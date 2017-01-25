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
String literal = yytext();
return new Symbol(sym.LITERAL, yyline, yycolumn, literal.substring(1, literal.length() - 1));
}

"\""({ESCAPED_QUOTE} | ([^\"]))* | "'"[^']*
{
System.out.println("token invalido: "+ yytext() + " - Cadena de texto no cerrada - Línea: "+yyline);
}

","
{
//return new Symbol(sym.COMMA, yyline, yycolumn, yytext())
;}
";"
{
return new Symbol(sym.SEMICOLON, yyline, yycolumn, yytext())
;}

("\n")
{
return new Symbol(sym.CRLF, yyline, yycolumn, yytext());
}

[0-9]+{ID}
{
System.out.println("token invalido: " + yytext() + " - Identificador ilegal - Línea: "+yyline);
}

{ID}
{
String x = yytext();
if(tabla.reservadas.containsKey(x))
	return new Symbol(tabla.reservadas.get(x), yyline, yycolumn);
else
	return new Symbol(sym.ID, yyline, yycolumn, yytext());
}

{ID}[!?]
{
//return new Symbol(sym.ID_FUNCTION, yyline, yycolumn, yytext());
}

"$"{ID}
{
return new Symbol(sym.ID_GLOBAL, yyline, yycolumn, yytext());
}

[0-9]+
{
return new Symbol(sym.INT, yyline, yycolumn, new Integer(Integer.parseInt(yytext())));
}

[0-9]+"."[0-9]+
{
return new Symbol(sym.FLOAT, yyline, yycolumn, new Double(Double.parseDouble(yytext())));
}

"=="
{
return new Symbol(sym.EQUAL, yyline, yycolumn);
}

"!="
{
return new Symbol(sym.NOT_EQUAL, yyline, yycolumn);
}

"<="
{
return new Symbol(sym.LESS_EQUAL, yyline, yycolumn);
}

">="
{
return new Symbol(sym.GREATER_EQUAL, yyline, yycolumn);
}

">"
{
return new Symbol(sym.GREATER, yyline, yycolumn);
}

"<"
{
return new Symbol(sym.LESS, yyline, yycolumn);
}

"+="
{
return new Symbol(sym.PLUS_ASSIGN, yyline, yycolumn);
}

"-="
{
return new Symbol(sym.MINUS_ASSIGN, yyline, yycolumn);
}

"/="
{
return new Symbol(sym.DIV_ASSIGN, yyline, yycolumn);
}

"%="
{
return new Symbol(sym.MOD_ASSIGN, yyline, yycolumn);
}

"**="
{
return new Symbol(sym.EXP_ASSIGN, yyline, yycolumn);
}

"*="
{
return new Symbol(sym.MUL_ASSIGN, yyline, yycolumn);
}

"="
{
return new Symbol(sym.ASSIGN, yyline, yycolumn);
}

"+"
{
return new Symbol(sym.PLUS, yyline, yycolumn);
}

"-"
{
return new Symbol(sym.MINUS, yyline, yycolumn);
}

"/"
{
return new Symbol(sym.DIV, yyline, yycolumn);
}

"%"
{
return new Symbol(sym.MOD, yyline, yycolumn);
}
"**"
{
return new Symbol(sym.EXP, yyline, yycolumn);
}
"*"
{
return new Symbol(sym.MUL, yyline, yycolumn);
}

"&&"
{
return new Symbol(sym.AND, yyline, yycolumn);
}

"||"
{
return new Symbol(sym.OR, yyline, yycolumn);
}

"!"
{
return new Symbol(sym.NOT, yyline, yycolumn);
}

"&"
{
return new Symbol(sym.BIT_AND, yyline, yycolumn);
}

"|"
{
return new Symbol(sym.BIT_OR, yyline, yycolumn);
}

"^"
{
return new Symbol(sym.BIT_XOR, yyline, yycolumn);
}

"~"
{
return new Symbol(sym.BIT_NOT, yyline, yycolumn);
}

">>"
{
return new Symbol(sym.BIT_SHR, yyline, yycolumn);
}

"<<"
{
return new Symbol(sym.BIT_SHL, yyline, yycolumn);
}

"("
{
return new Symbol(sym.LEFT_RBRACKET, yyline, yycolumn);
}

")"
{
return new Symbol(sym.RIGHT_RBRACKET, yyline, yycolumn);
}

"["
{
//return new Symbol(sym.LEFT_SBRACKET, yyline, yycolumn);
}

"]"
{
//return new Symbol(sym.RIGHT_SBRACKET, yyline, yycolumn);
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
