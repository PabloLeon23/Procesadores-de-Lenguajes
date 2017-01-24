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
										{System.out.println("token: LITERAL("+yytext()+")");
					 						return new Symbol(sym.LITERAL, yytext());}

"\""({ESCAPED_QUOTE} | ([^\"]))* | "'"[^']*
										{System.out.println("token invalido: "+ yytext() +
										    " - Cadena de texto no cerrada - Línea: "+yyline);}

","									{System.out.println("token: COMMA");
										 return new Symbol(sym.COMMA, yytext());}

";"									{System.out.println("token: SEMICOLON");
										 return new Symbol(sym.SEMICOLON, yytext());}

("\n")							{System.out.println("token: CRLF");
										 return new Symbol(sym.CRLF, yytext());}

[0-9]+{ID}					{System.out.println("token invalido: " + yytext() +
											 " - Identificador ilegal - Línea: "+yyline);}

{ID}							  {String x = yytext();
					 				   if(tabla.reservadas.containsKey(x)){
										 		
										  	return new Symbol(tabla.reservadas.get(x), yytext());
										}
					 					 else
					 					    System.out.println("token: ID(" + x + ")");
					 					 return new Symbol(sym.ID, yytext());}

{ID}[!?]						{System.out.println("token: ID_FUNCTION(" + yytext() + ")");
										 return new Symbol(sym.ID_FUNCTION, yytext());}

"$"{ID}							{System.out.println("token: ID_GLOBAL(" + yytext() + ")");
										 return new Symbol(sym.ID_GLOBAL, yytext());}

[0-9]+						  {System.out.println("token: INT(" + yytext() + ")");
							 			 return new Symbol(sym.INT, new Integer(Integer.parseInt(yytext())));}

[0-9]+"."[0-9]+		  {System.out.println("token: FLOAT(" + yytext() + ")");
										 return new Symbol(sym.FLOAT, new Double(Double.parseDouble(yytext())));}

"=="						 		{System.out.println("token: EQUAL");
						 				 return new Symbol(sym.EQUAL, yytext());}

"!="						 		{System.out.println("token: NOT_EQUAL");
										 return new Symbol(sym.NOT_EQUAL, yytext());}

"<="						 		{System.out.println("token: LESS_EQUAL");
										 return new Symbol(sym.LESS_EQUAL, yytext());}

">="						 		{System.out.println("token: GREATER_EQUAL");
										 return new Symbol(sym.GREATER_EQUAL, yytext());}

">"							 		{System.out.println("token: GREATER");
										 return new Symbol(sym.GREATER, yytext());}

"<"							 		{System.out.println("token: LESS");
										 return new Symbol(sym.LESS, yytext());}

"+="						 		{System.out.println("token: PLUS_ASSIGN");
										 return new Symbol(sym.PLUS_ASSIGN, yytext());}

"-="						 		{System.out.println("token: MINUS_ASSIGN");
										 return new Symbol(sym.MINUS_ASSIGN, yytext());}

"/="						 		{System.out.println("token: DIV_ASSIGN");
									   return new Symbol(sym.DIV_ASSIGN, yytext());}

"%="						 		{System.out.println("token: MOD_ASSIGN");
										 return new Symbol(sym.MOD_ASSIGN, yytext());}

"**="					 			{System.out.println("token: EXP_ASSIGN");
										 return new Symbol(sym.EXP_ASSIGN, yytext());}

"*="						 		{System.out.println("token: MUL_ASSIGN");
										 return new Symbol(sym.MUL_ASSIGN, yytext());}

"="							 		{System.out.println("token: ASSIGN");
										 return new Symbol(sym.ASSIGN, yytext());}

"+"							 		{System.out.println("token: PLUS");
										 return new Symbol(sym.PLUS, yytext());}

"-"							 		{System.out.println("token: MINUS");
										 return new Symbol(sym.MINUS, yytext());}

"/"							 		{System.out.println("token: DIV");
										 return new Symbol(sym.DIV, yytext());}

"%"							 		{System.out.println("token: MOD");
										 return new Symbol(sym.MOD, yytext());}

"**"						 		{System.out.println("token: EXP");
										 return new Symbol(sym.EXP, yytext());}

"*"							 		{System.out.println("token: MUL");
										 return new Symbol(sym.MUL, yytext());}

"&&"						 		{System.out.println("token: AND");
										 return new Symbol(sym.AND, yytext());}

"||"						 		{System.out.println("token: OR");
										 return new Symbol(sym.OR, yytext());}

"!"							 		{System.out.println("token: NOT");
										 return new Symbol(sym.NOT, yytext());}

"&"							 		{System.out.println("token: BIT_AND");
										 return new Symbol(sym.BIT_AND, yytext());}

"|"							 		{System.out.println("token: BIT_OR");
										 return new Symbol(sym.BIT_OR, yytext());}

"^"							 		{System.out.println("token: BIT_XOR");
										 return new Symbol(sym.BIT_XOR, yytext());}

"~"							 		{System.out.println("token: BIT_NOT");
										 return new Symbol(sym.BIT_NOT, yytext());}

">>"						 		{System.out.println("token: BIT_SHR");
										 return new Symbol(sym.BIT_SHR, yytext());}

"<<"						 		{System.out.println("token: BIT_SHL");
										 return new Symbol(sym.BIT_SHL, yytext());}

"("							 		{System.out.println("token: LEFT_RBRACKET");
										 return new Symbol(sym.LEFT_RBRACKET, yytext());}

")"							 		{System.out.println("token: RIGHT_RBRACKET");
										 return new Symbol(sym.RIGHT_RBRACKET, yytext());}

"["							 		{System.out.println("token: LEFT_SBRACKET");
										 return new Symbol(sym.LEFT_SBRACKET, yytext());}

"]"							 		{System.out.println("token: RIGHT_SBRACKET");
										 return new Symbol(sym.RIGHT_SBRACKET, yytext());}

"#"~(\n|\r)				  {System.out.println("token SL_COMMENT(" + yytext() + ")");}

"=begin"~"=end\n"	  {System.out.println("token ML_COMMENT(" + yytext() + ")");}

"=begin"			      {System.out.println("token invalido: " + yytext() +
											" - =begin sin =end - Línea: "+yyline);}

"=end"							{System.out.println("token invalido: " + yytext() +
											" - =end sin =begin - Línea: "+yyline);}

("\t" | " ")+		{System.out.println("token: WS");}

.					{System.out.println("token invalido:"+ yytext());}
}
