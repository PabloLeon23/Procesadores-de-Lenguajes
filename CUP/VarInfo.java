public class VarInfo{
	public static final int INT_TYPE=0;
	public static final int FLOAT_TYPE=1;
	public static final int STRING_TYPE=2;
	public static final int BOOL_TYPE=3;
	public static final int NIL_TYPE=4;
	public static final int ERROR=5;
	
	private Object content;
	private int type;
	
	public VarInfo(int t,Object cont){
		content=cont;
		type=t;
	}
	
	public int getType(){
		return type;
	}
	public Object getContent(){
		return content;
	}
	
	public void setType(int t){
		type=t;
	}
	public void setContent(Object cont){
		content=cont;
	}
	
	public String toString(){
		String ts;
		if(content==null)
			ts="";
		else
			ts=content.toString();
		switch(type){
			case INT_TYPE:
				ts="int: "+ts;
				break;
			case FLOAT_TYPE:
				ts="float: "+ts;
				break;
			case BOOL_TYPE:
				ts="bool: "+ts;
				break;
			case STRING_TYPE:
				ts="String: \""+ts+"\"";
				break;
			case NIL_TYPE:
				ts="nil";
				break;
			default:
				ts="Error: "+ts;
		}
		return ts;
	}
}
