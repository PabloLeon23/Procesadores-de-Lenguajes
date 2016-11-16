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


%%

<YYINITIAL> {

"#"~"\n"			{ System.out.println("token SL_COMMENT(" + yytext() + ")");  }	
"=begin"~"=end\n"		{ System.out.println("token ML_COMMENT(" + yytext() + ")");  }	
[0-9]+{ID}			{ System.out.println("token invalido: " + yytext());         }
{ID}				{ String x = yytext(); 
					 if(tabla.reservadas.containsKey(x))
						System.out.println("token: " + tabla.reservadas.get(x));
					 else 
					 	System.out.println("token: ID(" + x + ")"); }
{ID}[!?]			{ System.out.println("token: ID_FUNCTION(" + yytext() + ")");}
"$"{ID}				{ System.out.println("token: ID_GLOBAL(" + yytext() + ")");  }
-?[0-9]+			{ System.out.println("token: INT(" + yytext() + ")");        }
-?[0-9]+"."[0-9]+		{ System.out.println("token: FLOAT(" + yytext() + ")");      }
("\t" | " ")+			{ System.out.println("token: WS");                           }

}
