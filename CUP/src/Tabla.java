import java.util.Hashtable;
import java_cup.runtime.Symbol;

class Tabla{
	public Hashtable<String, Integer> reservadas = new Hashtable<String, Integer>();
	public Tabla(){
		//reservadas.put("require", sym.REQUIRE);
		//reservadas.put("end", sym.END);
		//reservadas.put("def", sym.DEF);*/
		reservadas.put("nil", sym.NIL);
		reservadas.put("true", sym.TRUE);
		//reservadas.put("for", sym.FOR);
		//reservadas.put("break", sym.BREAK);
		//reservadas.put("retry", sym.RETRY);
		//reservadas.put("while", sym.WHILE);
		//reservadas.put("elsif", sym.ELSIF);
		//reservadas.put("unless", sym.UNLESS);
		//reservadas.put("return", sym.RETURN);
		reservadas.put("false", sym.FALSE);
		//reservadas.put("if", sym.IF);
		//reservadas.put("then", sym.THEN);
		//reservadas.put("else", sym.ELSE);
		reservadas.put("and", sym.AND);
		reservadas.put("or", sym.OR);
		reservadas.put("not", sym.NOT);
	}
}
