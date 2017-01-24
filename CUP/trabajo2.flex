import java_cup.runtime.Symbol;

%%
%class analex
%line
%cup
%column

%{
	static Tabla tabla = new Tabla();
%}

	ID = [a-zA-Z_][a-zA-Z0-9_]*
	ESCAPED_QUOTE = "\\\\\""

%%

<YYINITIAL> {

"\""({ESCAPED_QUOTE} | ([^\"]))* "\"" | "'"([^'])*"'"
{
return new Symbol(sym.LITERAL, yytext())
;}

"\""({ESCAPED_QUOTE} | ([^\"]))* | "'"[^']*
{
System.out.println("token invalido: "+ yytext() + " - Cadena de texto no cerrada - Línea: "+yyline);
}

","									
{
return new Symbol(sym.COMMA, yytext())
;}
";"									
{
return new Symbol(sym.SEMICOLON, yytext())
;}

("\n")							
{
return new Symbol(sym.CRLF, yytext());
}

[0-9]+{ID}					
{
System.out.println("token invalido: " + yytext() + " - Identificador ilegal - Línea: "+yyline);
}

{ID}							  
{
String x = yytext();
if(tabla.reservadas.containsKey(x))
	return new Symbol(tabla.reservadas.get(x), yytext());
	
else
	return new Symbol(sym.ID, yytext());
}

{ID}[!?]						
{
return new Symbol(sym.ID_FUNCTION, yytext());
}

"$"{ID}							
{
return new Symbol(sym.ID_GLOBAL, yytext());
}

[0-9]+						  
{
return new Symbol(sym.INT, new Integer(Integer.parseInt(yytext())));
}

[0-9]+"."[0-9]+		  
{
return new Symbol(sym.FLOAT, new Double(Double.parseDouble(yytext())));
}

"=="						 		
{
return new Symbol(sym.EQUAL, yytext());
}

"!="						 		
{
return new Symbol(sym.NOT_EQUAL, yytext());
}

"<="						 		
{
return new Symbol(sym.LESS_EQUAL, yytext());
}

">="						 		
{
return new Symbol(sym.GREATER_EQUAL, yytext());
}

">"							 		
{
return new Symbol(sym.GREATER, yytext());
}

"<"							 		
{
return new Symbol(sym.LESS, yytext());
}

"+="						 		
{
return new Symbol(sym.PLUS_ASSIGN, yytext());
}

"-="						 		
{
return new Symbol(sym.MINUS_ASSIGN, yytext());
}

"/="						 		
{
return new Symbol(sym.DIV_ASSIGN, yytext());
}

"%="						 		
{
return new Symbol(sym.MOD_ASSIGN, yytext());
}

"**="	
{				 			
return new Symbol(sym.EXP_ASSIGN, yytext());
}

"*="						 		
{
return new Symbol(sym.MUL_ASSIGN, yytext());
}

"="							 		
{
return new Symbol(sym.ASSIGN, yytext());
}

"+"							 		
{
return new Symbol(sym.PLUS, yytext());
}

"-"							 		
{
return new Symbol(sym.MINUS, yytext());
}

"/"							 		
{
return new Symbol(sym.DIV, yytext());
}

"%"							 		
{
return new Symbol(sym.MOD, yytext());
}
"**"						 		
{
return new Symbol(sym.EXP, yytext());
}
"*"							 		
{
return new Symbol(sym.MUL, yytext());
}

"&&"						 		
{
return new Symbol(sym.AND, yytext());
}

"||"						 		
{
return new Symbol(sym.OR, yytext());
}

"!"							 		
{
return new Symbol(sym.NOT, yytext());
}

"&"							 		
{
return new Symbol(sym.BIT_AND, yytext());
}

"|"							 	
{
return new Symbol(sym.BIT_OR, yytext());
}

"^"							 		
{
return new Symbol(sym.BIT_XOR, yytext());
}

"~"							 		
{
return new Symbol(sym.BIT_NOT, yytext());
}

">>"						 		
{
return new Symbol(sym.BIT_SHR, yytext());
}

"<<"						 		
{
return new Symbol(sym.BIT_SHL, yytext());
}

"("							 		
{
return new Symbol(sym.LEFT_RBRACKET, yytext());
}

")"							 		
{
System.out.println("token: RIGHT_RBRACKET");
return new Symbol(sym.RIGHT_RBRACKET, yytext());
}

"["							 		
{
return new Symbol(sym.LEFT_SBRACKET, yytext());
}

"]"							 		
{
return new Symbol(sym.RIGHT_SBRACKET, yytext());
}

"#"~(\n|\r)				  
{}

"=begin"~"=end\n"	  
{}

"=begin"			      
{
System.out.println("token invalido: " + yytext() + " - =begin sin =end - Línea: "+yyline);
}

"=end"							
{}

("\t" | " ")+		
{}

.					
{}

}
