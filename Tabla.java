import java.util.Hashtable;

class Tabla{
	public Hashtable<String, String> reservadas = new Hashtable<String, String>();
	public Tabla(){
		reservadas.put("require", "REQUIRE");
		reservadas.put("end", "END");
		reservadas.put("def", "DEF");
		reservadas.put("nil","NIL");
		reservadas.put("true","TRUE");
		reservadas.put("for","FOR");
		reservadas.put("break","BREAK");
		reservadas.put("retry","RETRY");
		reservadas.put("while","WHILE");
		reservadas.put("elsif", "ELSIF");
		reservadas.put("unless","UNLESS");
		reservadas.put("return","RETURN");
		reservadas.put("false","FALSE");
		reservadas.put("if","IF");
		reservadas.put("then","THEN");
		reservadas.put("else","ELSE");
	}
}
