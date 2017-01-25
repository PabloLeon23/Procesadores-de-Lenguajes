grammar ruby;

@header{
	import java.util.Hashtable;
	import java.lang.Math;
	
}

@members{
	/*Tabla de variables*/
	Hashtable<String,VarInfo> varTable=new Hashtable<String,VarInfo>();
	
	/*Funciones auxiliares*/
	
	/*Devuelve el valor booleano de un tipo según el funcionamiento de los mismos en ruby*/
	private boolean getBoolean(VarInfo var){
		boolean r=true;
		if(var.getType()==VarInfo.NIL_TYPE) r=false;
		else if(var.getType()==VarInfo.NIL_TYPE) r=(boolean) var.getContent();
		return r;
	}
	
	/*Multiplica un entero por un String y devuelve un objeto VarInfo con el resultado*/
	private VarInfo multString(String s, int n){
		if(n<0)
			return new VarInfo(VarInfo.ERROR, "Un String no se puede multiplicar por un número negativo");
		else{
			String f="";
			for(int i=0;i<n;i++)
				f+=s;
			return new VarInfo(VarInfo.STRING_TYPE,f);
		}
	}
	
	/*Si i1 e i2 son un error, los combina y los devuelve como un error nuevo, si no, devuelve el que era un error*/
	private VarInfo handleError(VarInfo i1, VarInfo i2){
		VarInfo r=null;
		if(i1.getType()==VarInfo.ERROR && i2.getType()==VarInfo.ERROR)
			r= new VarInfo(VarInfo.ERROR, ((String) i1.getContent()) + "; " + ((String) i2.getContent()));
		else if(i1.getType()==VarInfo.ERROR)
			r= i1;
		else
			r= i2;
		return r;
	}
	
	/*Divide un número entre otro y devuelve un objeto VarInfo con el resultado, teniendo en cuenta la posibilidad de error al dividir entre 0*/
	private VarInfo divide(Number i1, Number i2, int resultType){
		if(resultType==VarInfo.FLOAT_TYPE)
			return new VarInfo(resultType, i1.doubleValue()/i2.doubleValue());
		else if(resultType==VarInfo.INT_TYPE){
			if(i2.intValue()==0)
				return new VarInfo(VarInfo.ERROR, "División entre 0 en enteros");
			else
				return new VarInfo(resultType, i1.intValue()/i1.intValue());
		}
		else
			return new VarInfo(VarInfo.ERROR, "Error desconocido");
	}
	/*Aplica la operación módulo entre los números entrantes y devuelve un objeto VarInfo con el resultado, teniendo en cuenta la posibilidad de error al dividir entre 0*/
	private VarInfo module(Number i1, Number i2, int resultType){
		if(i2.doubleValue()!=0){
			if(resultType==VarInfo.FLOAT_TYPE)
				return new VarInfo(resultType, i1.doubleValue()%i2.doubleValue());
			else if(resultType==VarInfo.INT_TYPE){
				return new VarInfo(resultType, i1.intValue()/i1.intValue());
			}
			else
				return new VarInfo(VarInfo.ERROR, "Error desconocido");
		}
		else
			return new VarInfo(VarInfo.ERROR, "División entre 0 en operación módulo");
	}
}

/*prog*/
prog : expression_list;

/*expression_list*/
expression_list : expression_list expression terminator
         | expression terminator;

/*expression*/
expression : function_definition
| require_block
| if_statement
| unless_statement
|rvalue {System.out.println($rvalue.text+" -> "+$rvalue.info);}
| return_statement
| while_statement
| for_statement
;

/*require*/
require_block : REQUIRE literal_t;

/*function definition*/
function_definition : function_definition_header function_definition_body END;
/*function body definition*/
function_definition_body : expression_list;
/*function header definition*/
function_definition_header : DEF function_name crlf
| DEF function_name function_definition_params crlf
;

/*function name*/
function_name : id_function
| id
;
/*function definition parameters*/
function_definition_params : LEFT_RBRACKET function_definition_params_list RIGHT_RBRACKET
| function_definition_params_list
;

/*function definition parameters list*/
function_definition_params_list : id
| function_definition_params_list COMMA id
;

/*return*/
return_statement : RETURN rvalue;
function_call : function_name LEFT_RBRACKET function_call_param_list RIGHT_RBRACKET
| function_name function_call_param_list
| function_name LEFT_RBRACKET RIGHT_RBRACKET
;
/*function call parameters*/
function_call_param_list : function_call_params;
function_call_params : rvalue
| function_call_params COMMA rvalue
;
/*if elsif*/
if_elsif_statement : ELSIF rvalue crlf expression_list
| ELSIF rvalue crlf expression_list ELSE crlf expression_list
| ELSIF rvalue crlf expression_list if_elsif_statement
;
/*if*/
if_statement : IF rvalue crlf expression_list END
| IF rvalue THEN expression_list END
| IF rvalue crlf expression_list ELSE crlf expression_list END
| IF rvalue THEN expression_list ELSE expression_list END
| IF rvalue crlf expression_list if_elsif_statement END;

/*unless*/
unless_statement : UNLESS rvalue crlf expression_list END;

/*while*/
while_statement : WHILE rvalue crlf while_expression_list END;
while_expression_list : expression terminator
| RETRY terminator
| BREAK terminator
| while_expression_list expression terminator
| while_expression_list RETRY terminator
| while_expression_list BREAK terminator
;

/*for*/
for_statement : FOR LEFT_RBRACKET expression SEMICOLON expression SEMICOLON expression
RIGHT_RBRACKET crlf for_expression_list END
| FOR expression SEMICOLON expression SEMICOLON expression crlf for_expression_list
END
;
for_expression_list : expression terminator
| RETRY terminator
| BREAK terminator
| for_expression_list expression terminator
| for_expression_list RETRY terminator
| for_expression_list BREAK terminator
;

/*case_statement : CASE content_case END;

content_case : lvalue when_list ELSE expression_list | lvalue when_list;*/

/*when*/
when_list : WHEN rvalue_list THEN expression_list when_list| WHEN rvalue_list THEN expression_list;

/*rvalue list*/
rvalue_list : rvalue COMMA | rvalue;

/*assignment*/
assignment returns [VarInfo info]: lvalue ASSIGN rvalue {$info=$rvalue.info;varTable.put($lvalue.text, $rvalue.info); System.out.println("Asignación a "+$lvalue.text+" de ("+$rvalue.info+")");}
| lvalue {int operation=0;} ( PLUS_ASSIGN | MINUS_ASSIGN{operation=1;} | MUL_ASSIGN{operation=2;} | DIV_ASSIGN {operation=3;}| MOD_ASSIGN{operation=4;} | EXP_ASSIGN{operation=5;}) rvalue{
	if(varTable.containsKey($lvalue.text)){
		VarInfo info2=$rvalue.info,info1=varTable.get($lvalue.text);
		
		if(info1.getType()==VarInfo.ERROR || info2.getType()==VarInfo.ERROR){
			$info=handleError(info1,info2);
		}
		else if((info1.getType()==VarInfo.INT_TYPE || info1.getType()==VarInfo.FLOAT_TYPE) && (info2.getType()==VarInfo.INT_TYPE || info2.getType()==VarInfo.FLOAT_TYPE)){
			int resultType=VarInfo.FLOAT_TYPE;
			if(info1.getType()==VarInfo.INT_TYPE && info2.getType()==VarInfo.INT_TYPE)
				resultType=VarInfo.INT_TYPE;
			switch(operation){
				case 0:
					if(resultType==VarInfo.INT_TYPE)
						$info=new VarInfo(VarInfo.INT_TYPE,((int) info1.getContent())+((int) info2.getContent()));
					else
						$info=new VarInfo(VarInfo.FLOAT_TYPE,((Number) info1.getContent()).doubleValue()+((Number) info2.getContent()).doubleValue());
				break;
				case 1:
					if(resultType==VarInfo.INT_TYPE)
						$info=new VarInfo(VarInfo.INT_TYPE,((int) info1.getContent())-((int) info2.getContent()));
					else
						$info=new VarInfo(VarInfo.FLOAT_TYPE,((Number) info1.getContent()).doubleValue()-((Number) info2.getContent()).doubleValue());
				break;
				case 2:
					if(resultType==VarInfo.INT_TYPE)
						$info=new VarInfo(VarInfo.INT_TYPE,((int) info1.getContent())*((int) info2.getContent()));
					else
						$info=new VarInfo(VarInfo.FLOAT_TYPE,((Number) info1.getContent()).doubleValue()*((Number) info2.getContent()).doubleValue());
				break;
				case 3:
					$info=divide((Number) info1.getContent(),(Number) info2.getContent(),resultType);
				break;
				case 4:
					$info=module((Number) info1.getContent(),(Number) info2.getContent(),resultType);
				break;
				case 5:
					if(resultType==VarInfo.INT_TYPE)
						$info=new VarInfo(VarInfo.INT_TYPE,(int) (Math.pow((int) info1.getContent(),(int) info2.getContent())));
					else
						$info=new VarInfo(VarInfo.FLOAT_TYPE,Math.pow(((Number) info1.getContent()).doubleValue(),((Number) info2.getContent()).doubleValue()));
				break;
			}
		}
		else if((info1.getType()==VarInfo.STRING_TYPE && info2.getType()==VarInfo.STRING_TYPE) && operation==0){
			$info=new VarInfo(VarInfo.STRING_TYPE,((String) info1.getContent())+((String) info2.getContent()));
		}
		else if(((info1.getType()==VarInfo.INT_TYPE && info2.getType()==VarInfo.STRING_TYPE) || (info2.getType()==VarInfo.INT_TYPE && info1.getType()==VarInfo.STRING_TYPE)) && operation==2){
			if(info1.getType()==VarInfo.INT_TYPE)
				$info=multString((String)info2.getContent(),(int)info1.getContent());
			else
				$info=multString((String)info1.getContent(),(int)info2.getContent());
		}
		else{
			$info=new VarInfo(VarInfo.ERROR,"Tipos incompatibles");
		}
	}
	else
		$info=new VarInfo(VarInfo.ERROR,"Variable utilizada sin inicializar: "+$lvalue.text);
	varTable.put($lvalue.text,$info);
}
;

/*array*/
array_assignment : lvalue array_definition ASSIGN rvalue
| lvalue ASSIGN array_definition
;
array_definition : LEFT_SBRACKET array_definition_elements RIGHT_SBRACKET
| LEFT_SBRACKET RIGHT_SBRACKET
;
array_definition_elements : rvalue
| array_definition_elements COMMA rvalue
;
array_selector : id LEFT_SBRACKET rvalue RIGHT_SBRACKET
| id_global LEFT_SBRACKET rvalue RIGHT_SBRACKET
| function_call LEFT_SBRACKET rvalue RIGHT_SBRACKET
;

/*int_result*/
int_result returns [VarInfo info] : i1=int_result signo=( MUL | DIV | MOD ) i2=int_result {
	if($i1.info.getType()==VarInfo.ERROR || $i2.info.getType()==VarInfo.ERROR)
		$info=handleError($i1.info,$i2.info);
	else if(getVocabulary().getSymbolicName($signo.type).equals("MUL"))
		$info=new VarInfo(VarInfo.INT_TYPE,(Integer)$i1.info.getContent()*(Integer)$i2.info.getContent());
	else if(getVocabulary().getSymbolicName($signo.type).equals("DIV"))
			$info=divide((Number) $i1.info.getContent(),(Number) $i2.info.getContent(),VarInfo.INT_TYPE);
	else
			$info=module((Number) $i1.info.getContent(),(Number) $i2.info.getContent(),VarInfo.INT_TYPE);
}
| i1=int_result signo=( PLUS | MINUS ) i2=int_result {
	if($i1.info.getType()==VarInfo.ERROR || $i2.info.getType()==VarInfo.ERROR)
		$info=handleError($i1.info,$i2.info);
	else if(getVocabulary().getSymbolicName($signo.type).equals("PLUS"))
		$info=new VarInfo(VarInfo.INT_TYPE,(Integer)$i1.info.getContent()+(Integer)$i2.info.getContent());
	else{
		$info=new VarInfo(VarInfo.INT_TYPE,(Integer)$i1.info.getContent()-(Integer)$i2.info.getContent());
	}
}
| int_t{$info=new VarInfo(VarInfo.INT_TYPE,$int_t.value);};

/*float_result*/
float_result returns [VarInfo info]: f1=float_result signo=( MUL | DIV | MOD ) f2=float_result {
	if($f1.info.getType()==VarInfo.ERROR && $f2.info.getType()==VarInfo.ERROR)
		$info=handleError($f1.info,$f2.info);
	else if(getVocabulary().getSymbolicName($signo.type).equals("MUL"))
		$info=new VarInfo(VarInfo.FLOAT_TYPE,(Double) $f1.info.getContent()* (Double) $f2.info.getContent());
	else if(getVocabulary().getSymbolicName($signo.type).equals("DIV"))
			$info=divide((Number) $i1.info.getContent(),(Number) $i2.info.getContent(),VarInfo.FLOAT_TYPE);
	else
			$info=module((Number) $i1.info.getContent(),(Number) $i2.info.getContent(),VarInfo.FLOAT_TYPE);
}
| i1=int_result signo=( MUL | DIV | MOD ) f2=float_result{
	if($i1.info.getType()==VarInfo.ERROR || $f2.info.getType()==VarInfo.ERROR)
		$info=handleError($i1.info,$f2.info);
	else if(getVocabulary().getSymbolicName($signo.type).equals("MUL"))
		$info=new VarInfo(VarInfo.FLOAT_TYPE,(Double) $i1.info.getContent()* (Double) $f2.info.getContent());
	else if(getVocabulary().getSymbolicName($signo.type).equals("DIV"))
		$info=divide((Number) $i1.info.getContent(),(Number) $i2.info.getContent(),VarInfo.FLOAT_TYPE);
	else
		$info=module((Number) $i1.info.getContent(),(Number) $i2.info.getContent(),VarInfo.FLOAT_TYPE);
}
| f1=float_result signo=( MUL | DIV | MOD ) i2=int_result{
	if($f1.info.getType()==VarInfo.ERROR || $i2.info.getType()==VarInfo.ERROR)
		$info=handleError($f1.info,$i2.info);
	else if(getVocabulary().getSymbolicName($signo.type).equals("MUL"))
		$info=new VarInfo(VarInfo.FLOAT_TYPE,(Double) $f1.info.getContent()* (Double) $i2.info.getContent());
	else if(getVocabulary().getSymbolicName($signo.type).equals("DIV"))
		$info=divide((Number) $i1.info.getContent(),(Number) $i2.info.getContent(),VarInfo.FLOAT_TYPE);
	else
		$info=module((Number) $i1.info.getContent(),(Number) $i2.info.getContent(),VarInfo.FLOAT_TYPE);
}
| f1=float_result signo=( PLUS | MINUS ) f2=float_result{
	if($f1.info.getType()==VarInfo.ERROR || $f2.info.getType()==VarInfo.ERROR)
		$info=handleError($f1.info,$f2.info);
	else if(getVocabulary().getSymbolicName($signo.type).equals("PLUS"))
		$info=new VarInfo(VarInfo.FLOAT_TYPE,(Double)$f1.info.getContent()+(Double)$f2.info.getContent());
	else{
		$info=new VarInfo(VarInfo.FLOAT_TYPE,(Double)$f1.info.getContent()-(Double)$f2.info.getContent());
	}
}
| i1=int_result signo=( PLUS | MINUS ) f2=float_result{
	if($i1.info.getType()==VarInfo.ERROR || $f2.info.getType()==VarInfo.ERROR)
		$info=handleError($i1.info,$f2.info);
	else if(getVocabulary().getSymbolicName($signo.type).equals("PLUS"))
		$info=new VarInfo(VarInfo.INT_TYPE,(Integer)$i1.info.getContent()+(Double)$f2.info.getContent());
	else{
		$info=new VarInfo(VarInfo.INT_TYPE,(Integer)$i1.info.getContent()-(Double)$f2.info.getContent());
	}
}
| f1=float_result signo=( PLUS | MINUS ) i2=int_result{
	if($f1.info.getType()==VarInfo.ERROR || $i2.info.getType()==VarInfo.ERROR)
		$info=handleError($f1.info,$i2.info);
	else if(getVocabulary().getSymbolicName($signo.type).equals("PLUS"))
		$info=new VarInfo(VarInfo.INT_TYPE,(Double)$f1.info.getContent()+(Integer)$i2.info.getContent());
	else{
		$info=new VarInfo(VarInfo.INT_TYPE,(Double)$f1.info.getContent()-(Integer)$i2.info.getContent());
	}
}
| float_t {$info=new VarInfo(VarInfo.FLOAT_TYPE,$float_t.value);}
;

/* String Result */
string_result returns [VarInfo info]: string_result MUL int_result {
	if($int_result.info.getType()==VarInfo.ERROR || $string_result.info.getType()==VarInfo.ERROR)
		$info=handleError($int_result.info,$string_result.info);
	else{
		int n=(Integer) $int_result.info.getContent();
		String s=(String) $string_result.info.getContent();
		$info=multString(s,n);
	}
}
| int_result MUL string_result {
	if($int_result.info.getType()==VarInfo.ERROR || $string_result.info.getType()==VarInfo.ERROR)
		$info=handleError($int_result.info,$string_result.info);
	else{
		int n=(Integer) $int_result.info.getContent();
		String s=(String) $string_result.info.getContent();
		$info=multString(s,n);
	}
}
| literal_t {$info=new VarInfo(VarInfo.STRING_TYPE, $literal_t.text.substring(1,$literal_t.text.length()-1));}
;

/* lvalue */
lvalue : id
| id_global
;

/* rvalue */
rvalue returns [VarInfo info]: lvalue {if(varTable.containsKey($lvalue.text)) $info=varTable.get($lvalue.text); else $info=new VarInfo(VarInfo.ERROR,"Variable utilizada sin inicializar: "+$lvalue.text);} 
| int_result {$info=$int_result.info;}
| float_result {$info=$float_result.info;}
| string_result {$info=$string_result.info;}
| assignment {$info=$assignment.info;}
| bool_t {$info=new VarInfo(VarInfo.BOOL_TYPE,$bool_t.value);}
| nil_t {$info=new VarInfo(VarInfo.NIL_TYPE,null);}
| r1=rvalue EXP r2=rvalue{
	if($r1.info.getType()==VarInfo.ERROR || $r2.info.getType()==VarInfo.ERROR)
		$info=handleError($r1.info,$r2.info);
	else if($r1.info.getType()==VarInfo.INT_TYPE && $r2.info.getType()==VarInfo.INT_TYPE)
		$info=new VarInfo(VarInfo.INT_TYPE, (int) Math.pow((int)$r1.info.getContent(),(int)$r2.info.getContent()));
	else if(($r1.info.getType()==VarInfo.INT_TYPE || $r1.info.getType()==VarInfo.FLOAT_TYPE) && ($r2.info.getType()==VarInfo.INT_TYPE || $r2.info.getType()==VarInfo.FLOAT_TYPE))
		$info=new VarInfo(VarInfo.FLOAT_TYPE,Math.pow(((Number)$r1.info.getContent()).doubleValue(),((Number)$r2.info.getContent()).doubleValue()));
	else
		$info=new VarInfo(VarInfo.ERROR, "Tipos incompatibles");
}
| NOT rvalue {
	if($rvalue.info.getType()==VarInfo.ERROR)
		$info=$rvalue.info;
	else
		$info=new VarInfo(VarInfo.BOOL_TYPE,!getBoolean($rvalue.info));
}
| r1=rvalue{int operation=0;} ( MUL | DIV{operation=1;} | MOD{operation=2;} ) r2=rvalue{
	VarInfo info1=$r1.info, info2=$r2.info;
	if((info1.getType()==VarInfo.INT_TYPE||info1.getType()==VarInfo.FLOAT_TYPE) && (info2.getType()==VarInfo.INT_TYPE||info2.getType()==VarInfo.FLOAT_TYPE)){
		int resultType=VarInfo.FLOAT_TYPE;
		if(info1.getType()==VarInfo.INT_TYPE && info2.getType()==VarInfo.INT_TYPE){
			resultType=VarInfo.INT_TYPE;
		}
		switch(operation){
		case 0:
			if(resultType==VarInfo.INT_TYPE)
				$info=new VarInfo(resultType,((int)info1.getContent())*((int)info2.getContent()));
			else
				$info=new VarInfo(resultType,((Number)info1.getContent()).doubleValue()*((Number)info2.getContent()).doubleValue());
		break;
		case 1:
			$info=divide((Number) info1.getContent(),(Number) info1.getContent(),resultType);
		break;
		case 2:
			$info=module((Number) info1.getContent(),(Number) info1.getContent(),resultType);
		break;
		}
	}
	else if(((info1.getType()==VarInfo.INT_TYPE && info2.getType()==VarInfo.STRING_TYPE)||(info2.getType()==VarInfo.INT_TYPE && info1.getType()==VarInfo.STRING_TYPE))&&operation==0){
		if(info1.getType()==VarInfo.INT_TYPE)
			$info=multString((String) info2.getContent(),(int) info1.getContent());
		else
			$info=multString((String) info1.getContent(),(int) info2.getContent());
	}
	else if(info1.getType()==VarInfo.ERROR || info2.getType()==VarInfo.ERROR)
		$info=handleError(info1,info2);
	else $info=new VarInfo(VarInfo.ERROR,"Tipos incompatibles para esa operación");
}
| r1=rvalue{int operation=0;} ( PLUS | MINUS{operation=1;} ) r2=rvalue{
	VarInfo info1=$r1.info, info2=$r2.info;
	if((info1.getType()==VarInfo.INT_TYPE||info1.getType()==VarInfo.FLOAT_TYPE) && (info2.getType()==VarInfo.INT_TYPE||info2.getType()==VarInfo.FLOAT_TYPE)){
		int resultType=VarInfo.FLOAT_TYPE;
		if(info1.getType()==VarInfo.INT_TYPE && info2.getType()==VarInfo.INT_TYPE)
			resultType=VarInfo.INT_TYPE;
		switch(operation){
		case 0:
			if(resultType==VarInfo.INT_TYPE)
				$info=new VarInfo(resultType,((int)info1.getContent())+((int)info2.getContent()));
			else
				$info=new VarInfo(resultType,((Number)info1.getContent()).doubleValue()+((Number)info2.getContent()).doubleValue());
		break;
		case 1:
			if(resultType==VarInfo.INT_TYPE)
				$info=new VarInfo(resultType,((int)info1.getContent())-((int)info2.getContent()));
			else
				$info=new VarInfo(resultType,((Number)info1.getContent()).doubleValue()-((Number)info2.getContent()).doubleValue());
		break;
		}
	}
	else if(info1.getType()==VarInfo.STRING_TYPE && info2.getType()==VarInfo.STRING_TYPE&& operation==0){
		$info=new VarInfo(VarInfo.STRING_TYPE,((String) info1.getContent())+((String) info2.getContent()));
	}
	else if(info1.getType()==VarInfo.ERROR || info2.getType()==VarInfo.ERROR)
		$info=handleError(info1,info2);
	else $info=new VarInfo(VarInfo.ERROR,"Tipos incompatibles para esa operación");
}
| r1=rvalue{int selector=0;} ( LESS | GREATER{selector=1;} | LESS_EQUAL{selector=2;} | GREATER_EQUAL{selector=3;} ) r2=rvalue{
	boolean val=false;
	if($r1.info.getType()==VarInfo.ERROR || $r2.info.getType()==VarInfo.ERROR)
		$info=handleError($r1.info,$r1.info);
	else{
		if($r1.info.getType()==$r2.info.getType() && !($r1.info.getType()==VarInfo.NIL_TYPE)){
			int comp=((Comparable) $r1.info.getContent()).compareTo($r2.info.getContent());
			switch(selector){
			case 0:
				val=comp<0;
				break;
			case 1:
				val=comp>0;
				break;
			case 2:
				val=comp<=0;
				break;
			case 3:
				val=comp>=0;
				break;
			}
			$info=new VarInfo(VarInfo.BOOL_TYPE, val);
		}
		else if($r1.info.getType()==VarInfo.INT_TYPE && $r2.info.getType()==VarInfo.FLOAT_TYPE || $r2.info.getType()==VarInfo.INT_TYPE && $r1.info.getType()==VarInfo.FLOAT_TYPE){
			double v1=((Number) $r1.info.getContent()).doubleValue(),v2=((Number) $r2.info.getContent()).doubleValue();
			switch(selector){
			case 0:
				val=v1<v2;
				break;
			case 1:
				val=v1>v2;
				break;
			case 2:
				val=v1<=v2;
				break;
			case 3:
				val=v1>=v2;
				break;
			}
			$info=new VarInfo(VarInfo.BOOL_TYPE, val);
		}
		else{
			$info=new VarInfo(VarInfo.ERROR, "Tipos incompatibles para comparar");
		}
	}
}
| r1=rvalue{boolean eq=false;} ( EQUAL{eq=true;} | NOT_EQUAL ) r2=rvalue{
	boolean val=false;
	if($r1.info.getType()==VarInfo.ERROR && $r2.info.getType()==VarInfo.ERROR)
		$info=new VarInfo(VarInfo.ERROR, ((String) $r1.info.getContent()) + "; " + ((String) $r2.info.getContent()));
	else if($r1.info.getType()==VarInfo.ERROR)
		$info=$r1.info;
	else if($r2.info.getType()==VarInfo.ERROR)
		$info=$r2.info;
	else{
		if($r1.info.getType()==$r2.info.getType()){
			if($r1.info.getType()==VarInfo.NIL_TYPE || $r1.info.getContent().equals($r2.info.getContent()))
				val=true;
		}
		else if($r1.info.getType()==VarInfo.INT_TYPE && $r2.info.getType()==VarInfo.FLOAT_TYPE){
			val=(int) $r1.info.getContent()==(double) $r2.info.getContent();
		}
		else if($r2.info.getType()==VarInfo.INT_TYPE && $r1.info.getType()==VarInfo.FLOAT_TYPE){
			val=(int) $r2.info.getContent()==(double) $r1.info.getContent();
		}
		$info=new VarInfo(VarInfo.BOOL_TYPE,eq?val:!val);
	}
}
| r1=rvalue{boolean modeOr=false;} (OR{modeOr=false;}|AND) r2=rvalue {
	if($r1.info.getType()==VarInfo.ERROR && $r2.info.getType()==VarInfo.ERROR)
		$info=new VarInfo(VarInfo.ERROR, ((String) $r1.info.getContent()) + "; " + ((String) $r2.info.getContent()));
	else if($r1.info.getType()==VarInfo.ERROR)
		$info=$r1.info;
	else if($r2.info.getType()==VarInfo.ERROR)
		$info=$r2.info;
	else if(modeOr)$info=new VarInfo(VarInfo.BOOL_TYPE,getBoolean($r1.info) || getBoolean($r2.info));
	else $info=new VarInfo(VarInfo.BOOL_TYPE,getBoolean($r1.info) && getBoolean($r2.info));
}
| LEFT_RBRACKET rvalue RIGHT_RBRACKET {$info=$rvalue.info;}
;

/* Types*/
literal_t: LITERAL;
float_t returns [double value]: FLOAT {$value=Double.parseDouble($FLOAT.text);};
int_t returns [int value]: INT {$value=$INT.int;};
bool_t returns [boolean value]: TRUE {$value=true;}
| FALSE{$value=false;};
nil_t: NIL;
id : ID;

/*ids*/
id_global : ID_GLOBAL;
id_function : ID_FUNCTION;

/*terminator*/
terminator : terminator SEMICOLON
| terminator crlf
| SEMICOLON
| crlf
;
crlf : CRLF
;

/*tokens*/
ESCAPED_QUOTE : '\\"';
LITERAL : '"' ( ESCAPED_QUOTE | ~('\n'|'\r') )*? '"'
| '\'' ( ESCAPED_QUOTE | ~('\n'|'\r') )*? '\'';
COMMA : ',';
SEMICOLON : ';';
CRLF : '\n';
REQUIRE : 'require';
END : 'end';
DEF : 'def';
RETURN : 'return';
IF: 'if';
THEN : 'then';
ELSE : 'else';
ELSIF : 'elsif';
UNLESS : 'unless';
WHILE : 'while';
RETRY : 'retry';
BREAK : 'break';
FOR : 'for';
CASE  : 'case';
WHEN : 'when';

TRUE : 'true';
FALSE : 'false';
PLUS : '+';
MINUS : '-';
MUL : '*';
DIV : '/';
MOD : '%';
EXP : '**';
EQUAL : '==';
NOT_EQUAL : '!=';
GREATER : '>';
LESS : '<';
LESS_EQUAL : '<=';
GREATER_EQUAL : '>=';
ASSIGN : '=';
PLUS_ASSIGN : '+=';
MINUS_ASSIGN : '-=';
MUL_ASSIGN : '*=';
DIV_ASSIGN : '/=';
MOD_ASSIGN : '%=';
EXP_ASSIGN : '**=';

BIT_AND : '&';
BIT_OR : '|';
BIT_XOR : '^';
BIT_NOT : '~';
BIT_SHL : '<<';
BIT_SHR : '>>';
AND : 'and' | '&&';
OR : 'or' | '||';
NOT : 'not' | '!';
LEFT_RBRACKET : '(';
RIGHT_RBRACKET : ')';
LEFT_SBRACKET : '[';
RIGHT_SBRACKET : ']';

NIL : 'nil';
SL_COMMENT : ('#' ~('\r' | '\n')* '\n') -> skip;
ML_COMMENT : ('=begin' .*? '=end\n') -> skip;
WS : (' '|'\t')+ -> skip;
INT: [0-9]+;
FLOAT : [0-9]*'.'[0-9]+;
ID : [a-zA-Z_][a-zA-Z0-9_]*;
ID_GLOBAL : '$'ID;
ID_FUNCTION : ID[!?];
