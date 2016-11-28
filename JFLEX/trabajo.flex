%%
%unicode
%class analex
%standalone
%line
%column

%{

static Tabla tabla = new Tabla();

%}
ID = [a-zA-Z_][a-zA-Z0-9_]*
ESCAPED_QUOTE = "\\\\\""

%%

<YYINITIAL> {

"\""({ESCAPED_QUOTE} | ([^\"]))* "\"" | "'"([^'])*"'"
					{System.out.println("token: LITERAL("+yytext()+")");}
"\""({ESCAPED_QUOTE} | ([^\"]))* | "'"[^']*
					{System.out.println("token invalido: "+yytext()+" - Cadena de texto no cerrada - Línea: "+yyline);}

","					{System.out.println("token: COMMA");}
";"					{System.out.println("token: SEMICOLON");}
("\n")				{System.out.println("token: CRLF");}

[0-9]+{ID}			{System.out.println("token invalido: " + yytext()+" - Identificador ilegal - Línea: "+yyline);}
{ID}				{String x = yytext(); 
					 if(tabla.reservadas.containsKey(x))
						System.out.println("token: " + tabla.reservadas.get(x));
					 else 
					 	System.out.println("token: ID(" + x + ")");
					 }
{ID}[!?]			{System.out.println("token: ID_FUNCTION(" + yytext() + ")");}
"$"{ID}				{System.out.println("token: ID_GLOBAL(" + yytext() + ")");  }
-?[0-9]+			{System.out.println("token: INT(" + yytext() + ")");}
-?[0-9]+"."[0-9]+	{System.out.println("token: FLOAT(" + yytext() + ")");}

"=="				{System.out.println("token: EQUAL");}
"!="				{System.out.println("token: NOT_EQUAL");}
"<="				{System.out.println("token: LESS_EQUAL");}
">="				{System.out.println("token: GREATER_EQUAL");}
">"					{System.out.println("token: GREATER");}
"<"					{System.out.println("token: LESS");}

"+="				{System.out.println("token: PLUS_ASSIGN");}
"-="				{System.out.println("token: MINUS_ASSIGN");}
"/="				{System.out.println("token: DIV_ASSIGN");}
"%="				{System.out.println("token: MOD_ASSIGN");}
"**="				{System.out.println("token: EXP_ASSIGN");}
"*="				{System.out.println("token: MUL_ASSIGN");}
"="					{System.out.println("token: ASSIGN");}

"+"					{System.out.println("token: PLUS");}
"-"					{System.out.println("token: MINUS");}
"/"					{System.out.println("token: DIV");}
"%"					{System.out.println("token: MOD");}
"**"				{System.out.println("token: EXP");}
"*"					{System.out.println("token: MUL");}

"&&"				{System.out.println("token: AND");}
"||"				{System.out.println("token: OR");}
"!"					{System.out.println("token: NOT");}

"&"					{System.out.println("token: BIT_AND");}
"|"					{System.out.println("token: BIT_OR");}
"^"					{System.out.println("token: BIT_XOR");}
"~"					{System.out.println("token: BIT_NOT");}
">>"				{System.out.println("token: BIT_SHR");}
"<<"				{System.out.println("token: BIT_SHL");}

"("					{System.out.println("token: LEFT_RBRACKET");}
")"					{System.out.println("token: RIGHT_RBRACKET");}
"["					{System.out.println("token: LEFT_SBRACKET");}
"]"					{System.out.println("token: RIGHT_SBRACKET");}

"#"~(\n|\r)			{System.out.println("token SL_COMMENT(" + yytext() + ")");  }
"=begin"~"=end\n"	{System.out.println("token ML_COMMENT(" + yytext() + ")");}
"=begin"			{System.out.println("token invalido: " + yytext()+" - =begin sin =end - Línea: "+yyline);}
"=end"			{System.out.println("token invalido: " + yytext()+" - =end sin =begin - Línea: "+yyline);}
("\t" | " ")+		{System.out.println("token: WS");}

.					{System.out.println("token invalido:"+ yytext());}
}
