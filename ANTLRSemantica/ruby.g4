grammar ruby;

@header{
	import java.util.Hashtable;
	import java.lang.Math;
	
}

@members{
	Hashtable<String,VarInfo> varTable=new Hashtable<String,VarInfo>();
	
	private boolean getBoolean(VarInfo var){
		boolean r=true;
		if(var.getType()==VarInfo.NIL_TYPE) r=false;
		else if(var.getType()==VarInfo.NIL_TYPE) r=(boolean) var.getContent();
		return r;
	}
}

/*prog*/
prog : expression_list;

/*expression_list*/
expression_list : expression_list expression terminator
         | expression terminator;

/*expression*/
expression : rvalue {System.out.println($rvalue.text+" -> "+$rvalue.info);}
;

/*assignment*/
assignment returns [VarInfo info]: lvalue ASSIGN rvalue {$info=$rvalue.info;varTable.put($lvalue.text, $rvalue.info); System.out.println("Asignación a "+$lvalue.text+" de ("+$rvalue.info+")");}
| lvalue signo=( PLUS_ASSIGN | MINUS_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | EXP_ASSIGN) rvalue /*{
	if(varTable.containsKey($lvalue.text)){
		VarInfo aInf=null,idInf=varTable.get($lvalue.text);
		
		if(getVocabulary().getSymbolicName($signo.type).equals("PLUS_ASSIGN"))
			aInf=new VarInfo(idInf.getType(),);
	}
	else
		$info=new VarInfo(VarInfo.ERROR,"Variable utilizada sin inicializar: "+$lvalue.text);
}*/
;

/*int_result*/
int_result returns [VarInfo info] : i1=int_result EXP i2=int_result{
	if($i1.info.getType()==VarInfo.ERROR && $i2.info.getType()==VarInfo.ERROR)
		$info=new VarInfo(VarInfo.ERROR, ((String) $i1.info.getContent()) + "; " + ((String) $i2.info.getContent()));
	else if($i1.info.getType()==VarInfo.ERROR)
		$info=$i1.info;
	else if($i2.info.getType()==VarInfo.ERROR)
		$info=$i2.info;
	else 
		$info=new VarInfo(VarInfo.INT_TYPE, (int) Math.pow((int)$i1.info.getContent(),(int)$i2.info.getContent()));
}
|i1=int_result signo=( MUL | DIV | MOD ) i2=int_result {
	if($i1.info.getType()==VarInfo.ERROR && $i2.info.getType()==VarInfo.ERROR)
		$info=new VarInfo(VarInfo.ERROR, ((String) $i1.info.getContent()) + "; " + ((String) $i2.info.getContent()));
	else if($i1.info.getType()==VarInfo.ERROR)
		$info=$i1.info;
	else if($i2.info.getType()==VarInfo.ERROR)
		$info=$i2.info;
	else if(getVocabulary().getSymbolicName($signo.type).equals("MUL"))
		$info=new VarInfo(VarInfo.INT_TYPE,(Integer)$i1.info.getContent()*(Integer)$i2.info.getContent());
	else{
		if((Integer)$i2.info.getContent()==0)
			$info= new VarInfo(VarInfo.ERROR,"División por 0");
		else if(getVocabulary().getSymbolicName($signo.type).equals("DIV"))
			$info=new VarInfo(VarInfo.INT_TYPE,(Integer)$i1.info.getContent()/(Integer)$i2.info.getContent());
		else
			$info=new VarInfo(VarInfo.INT_TYPE,(Integer)$i1.info.getContent()%(Integer)$i2.info.getContent());
	}
}
| i1=int_result signo=( PLUS | MINUS ) i2=int_result {
	if($i1.info.getType()==VarInfo.ERROR && $i2.info.getType()==VarInfo.ERROR)
		$info=new VarInfo(VarInfo.ERROR, ((String) $i1.info.getContent()) + "; " + ((String) $i2.info.getContent()));
	else if($i1.info.getType()==VarInfo.ERROR)
		$info=$i1.info;
	else if($i2.info.getType()==VarInfo.ERROR)
		$info=$i2.info;
	else if(getVocabulary().getSymbolicName($signo.type).equals("PLUS"))
		$info=new VarInfo(VarInfo.INT_TYPE,(Integer)$i1.info.getContent()+(Integer)$i2.info.getContent());
	else{
		$info=new VarInfo(VarInfo.INT_TYPE,(Integer)$i1.info.getContent()-(Integer)$i2.info.getContent());
	}
}
| LEFT_RBRACKET int_result RIGHT_RBRACKET {$info=$int_result.info;}
| int_t{$info=new VarInfo(VarInfo.INT_TYPE,$int_t.value);};

/*float_result*/
float_result returns [VarInfo info]: f1=float_result EXP f2=float_result{
	if($f1.info.getType()==VarInfo.ERROR && $f2.info.getType()==VarInfo.ERROR)
		$info=new VarInfo(VarInfo.ERROR, ((String) $f1.info.getContent()) + "; " + ((String) $f2.info.getContent()));
	else if($f1.info.getType()==VarInfo.ERROR)
		$info=$f1.info;
	else if($f2.info.getType()==VarInfo.ERROR)
		$info=$f2.info;
	else 
		$info=new VarInfo(VarInfo.FLOAT_TYPE, (double) Math.pow((double)$f1.info.getContent(),(double)$f2.info.getContent()));
}
|i1=int_result EXP f2=float_result{
	if($i1.info.getType()==VarInfo.ERROR && $f2.info.getType()==VarInfo.ERROR)
		$info=new VarInfo(VarInfo.ERROR, ((String) $i1.info.getContent()) + "; " + ((String) $f2.info.getContent()));
	else if($i1.info.getType()==VarInfo.ERROR)
		$info=$i1.info;
	else if($f2.info.getType()==VarInfo.ERROR)
		$info=$f2.info;
	else 
		$info=new VarInfo(VarInfo.FLOAT_TYPE, (double) Math.pow((int)$i1.info.getContent(),(double)$f2.info.getContent()));
}
|f1=float_result EXP i2=int_result{
	if($f1.info.getType()==VarInfo.ERROR && $i2.info.getType()==VarInfo.ERROR)
		$info=new VarInfo(VarInfo.ERROR, ((String) $f1.info.getContent()) + "; " + ((String) $i2.info.getContent()));
	else if($f1.info.getType()==VarInfo.ERROR)
		$info=$f1.info;
	else if($i2.info.getType()==VarInfo.ERROR)
		$info=$i2.info;
	else 
		$info=new VarInfo(VarInfo.FLOAT_TYPE, (double) Math.pow((double)$f1.info.getContent(),(int)$i2.info.getContent()));
}
|f1=float_result signo=( MUL | DIV | MOD ) f2=float_result {
	if($f1.info.getType()==VarInfo.ERROR && $f2.info.getType()==VarInfo.ERROR)
		$info=new VarInfo(VarInfo.ERROR, ((String) $f1.info.getContent()) + "; " + ((String) $f2.info.getContent()));
	else if($f1.info.getType()==VarInfo.ERROR)
		$info=$f1.info;
	else if($f2.info.getType()==VarInfo.ERROR)
		$info=$f2.info;
	else if(getVocabulary().getSymbolicName($signo.type).equals("MUL"))
		$info=new VarInfo(VarInfo.FLOAT_TYPE,(Double) $f1.info.getContent()* (Double) $f2.info.getContent());
	else{
		if((Double)$f2.info.getContent()==0)
			$info= new VarInfo(VarInfo.ERROR,"División por 0");
		else if(getVocabulary().getSymbolicName($signo.type).equals("DIV"))
			$info=new VarInfo(VarInfo.INT_TYPE,(Double)$f1.info.getContent()/(Double)$f2.info.getContent());
		else
			$info=new VarInfo(VarInfo.INT_TYPE,(Double)$f1.info.getContent()%(Double)$f2.info.getContent());
	}
}
| i1=int_result signo=( MUL | DIV | MOD ) f2=float_result{
	if($i1.info.getType()==VarInfo.ERROR && $f2.info.getType()==VarInfo.ERROR)
		$info=new VarInfo(VarInfo.ERROR, ((String) $i1.info.getContent()) + "; " + ((String) $f2.info.getContent()));
	else if($i1.info.getType()==VarInfo.ERROR)
		$info=$i1.info;
	else if($f2.info.getType()==VarInfo.ERROR)
		$info=$f2.info;
	else if(getVocabulary().getSymbolicName($signo.type).equals("MUL"))
		$info=new VarInfo(VarInfo.FLOAT_TYPE,(Double) $i1.info.getContent()* (Double) $f2.info.getContent());
	else{
		if((Double)$f2.info.getContent()==0)
			$info= new VarInfo(VarInfo.ERROR,"División por 0");
		else if(getVocabulary().getSymbolicName($signo.type).equals("DIV"))
			$info=new VarInfo(VarInfo.INT_TYPE,(Integer)$i1.info.getContent()/(Double)$f2.info.getContent());
		else
			$info=new VarInfo(VarInfo.INT_TYPE,(Integer)$i1.info.getContent()%(Double)$f2.info.getContent());
	}
}
| f1=float_result signo=( MUL | DIV | MOD ) i2=int_result{
	if($f1.info.getType()==VarInfo.ERROR && $i2.info.getType()==VarInfo.ERROR)
		$info=new VarInfo(VarInfo.ERROR, ((String) $f1.info.getContent()) + "; " + ((String) $i2.info.getContent()));
	else if($f1.info.getType()==VarInfo.ERROR)
		$info=$f1.info;
	else if($i2.info.getType()==VarInfo.ERROR)
		$info=$i2.info;
	else if(getVocabulary().getSymbolicName($signo.type).equals("MUL"))
		$info=new VarInfo(VarInfo.FLOAT_TYPE,(Double) $f1.info.getContent()* (Double) $i2.info.getContent());
	else{
		if((Integer)$i2.info.getContent()==0)
			$info= new VarInfo(VarInfo.ERROR,"División por 0");
		else if(getVocabulary().getSymbolicName($signo.type).equals("DIV"))
			$info=new VarInfo(VarInfo.INT_TYPE,(Double)$f1.info.getContent()/(Integer)$i2.info.getContent());
		else
			$info=new VarInfo(VarInfo.INT_TYPE,(Double)$f1.info.getContent()%(Integer)$i2.info.getContent());
	}
}
| f1=float_result signo=( PLUS | MINUS ) f2=float_result{
	if($f1.info.getType()==VarInfo.ERROR && $f2.info.getType()==VarInfo.ERROR)
		$info=new VarInfo(VarInfo.ERROR, ((String) $f1.info.getContent()) + "; " + ((String) $f2.info.getContent()));
	else if($f1.info.getType()==VarInfo.ERROR)
		$info=$f1.info;
	else if($f2.info.getType()==VarInfo.ERROR)
		$info=$f2.info;
	else if(getVocabulary().getSymbolicName($signo.type).equals("PLUS"))
		$info=new VarInfo(VarInfo.INT_TYPE,(Double)$f1.info.getContent()+(Double)$f2.info.getContent());
	else{
		$info=new VarInfo(VarInfo.INT_TYPE,(Double)$f1.info.getContent()-(Double)$f2.info.getContent());
	}
}
| i1=int_result signo=( PLUS | MINUS ) f2=float_result{
	if($i1.info.getType()==VarInfo.ERROR && $f2.info.getType()==VarInfo.ERROR)
		$info=new VarInfo(VarInfo.ERROR, ((String) $i1.info.getContent()) + "; " + ((String) $f2.info.getContent()));
	else if($i1.info.getType()==VarInfo.ERROR)
		$info=$i1.info;
	else if($f2.info.getType()==VarInfo.ERROR)
		$info=$f2.info;
	else if(getVocabulary().getSymbolicName($signo.type).equals("PLUS"))
		$info=new VarInfo(VarInfo.INT_TYPE,(Integer)$i1.info.getContent()+(Double)$f2.info.getContent());
	else{
		$info=new VarInfo(VarInfo.INT_TYPE,(Integer)$i1.info.getContent()-(Double)$f2.info.getContent());
	}
}
| f1=float_result signo=( PLUS | MINUS ) i2=int_result{
	if($f1.info.getType()==VarInfo.ERROR && $i2.info.getType()==VarInfo.ERROR)
		$info=new VarInfo(VarInfo.ERROR, ((String) $f1.info.getContent()) + "; " + ((String) $i2.info.getContent()));
	else if($f1.info.getType()==VarInfo.ERROR)
		$info=$f1.info;
	else if($i2.info.getType()==VarInfo.ERROR)
		$info=$i2.info;
	else if(getVocabulary().getSymbolicName($signo.type).equals("PLUS"))
		$info=new VarInfo(VarInfo.INT_TYPE,(Double)$f1.info.getContent()+(Integer)$i2.info.getContent());
	else{
		$info=new VarInfo(VarInfo.INT_TYPE,(Double)$f1.info.getContent()-(Integer)$i2.info.getContent());
	}
}
| LEFT_RBRACKET float_result RIGHT_RBRACKET {$info=$float_result.info;}
| float_t {$info=new VarInfo(VarInfo.FLOAT_TYPE,$float_t.value);}
;

/* String Result */
string_result returns [VarInfo info]: string_result MUL int_result {
	if($int_result.info.getType()==VarInfo.ERROR && $string_result.info.getType()==VarInfo.ERROR)
		$info=new VarInfo(VarInfo.ERROR, ((String) $int_result.info.getContent()) + "; " + ((String) $string_result.info.getContent()));
	else if($int_result.info.getType()==VarInfo.ERROR)
		$info=$int_result.info;
	else if($string_result.info.getType()==VarInfo.ERROR)
		$info=$string_result.info;
	else{
		int n=(Integer) $int_result.info.getContent();
		String s=(String) $string_result.info.getContent();
		if(n<0)
			$info=new VarInfo(VarInfo.ERROR, "Un String no se puede multiplicar por un número negativo");
		else{
			String f="";
			for(int i=0;i<n;i++){
				f+=s;
			}
			$info=new VarInfo(VarInfo.STRING_TYPE,f);
		}
	}
}
| int_result MUL string_result {
	if($int_result.info.getType()==VarInfo.ERROR && $string_result.info.getType()==VarInfo.ERROR)
		$info=new VarInfo(VarInfo.ERROR, ((String) $int_result.info.getContent()) + "; " + ((String) $string_result.info.getContent()));
	else if($int_result.info.getType()==VarInfo.ERROR)
		$info=$int_result.info;
	else if($string_result.info.getType()==VarInfo.ERROR)
		$info=$string_result.info;
	else{
		int n=(Integer) $int_result.info.getContent();
		String s=(String) $string_result.info.getContent();
		if(n<0)
			$info=new VarInfo(VarInfo.ERROR, "Un String no se puede multiplicar por un número negativo");
		else{
			String f="";
			for(int i=0;i<n;i++){
				f+=s;
			}
			$info=new VarInfo(VarInfo.STRING_TYPE,f);
		}
	}
}
| LEFT_RBRACKET string_result RIGHT_RBRACKET {$info=$string_result.info;}
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
| NOT rvalue {
	if($rvalue.info.getType()==VarInfo.ERROR)
		$info=$rvalue.info;
	else
		$info=new VarInfo(VarInfo.BOOL_TYPE,!getBoolean($rvalue.info));
}
| r1=rvalue{int selector=0;} ( LESS | GREATER{selector=1;} | LESS_EQUAL{selector=2;} | GREATER_EQUAL{selector=3;} ) r2=rvalue{
	boolean val=false;
	if($r1.info.getType()==VarInfo.ERROR && $r2.info.getType()==VarInfo.ERROR)
		$info=new VarInfo(VarInfo.ERROR, ((String) $r1.info.getContent()) + "; " + ((String) $r2.info.getContent()));
	else if($r1.info.getType()==VarInfo.ERROR)
		$info=$r1.info;
	else if($r2.info.getType()==VarInfo.ERROR)
		$info=$r2.info;
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
;

/* Types*/
literal_t: LITERAL;
float_t returns [double value]: FLOAT {$value=Double.parseDouble($FLOAT.text);};
int_t returns [int value]: INT {$value=$INT.int;};
bool_t returns [boolean value]: TRUE {$value=true;}
| FALSE{$value=false;};
nil_t: NIL;
id : ID;

id_global : ID_GLOBAL;
id_function : ID_FUNCTION;
terminator : terminator SEMICOLON
| terminator crlf
| SEMICOLON
| crlf
;
crlf : CRLF
;

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
