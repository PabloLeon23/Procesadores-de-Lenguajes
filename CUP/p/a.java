public class a{
	public static void main(String[] args){
		Object o1 = 2.0;
		Object o2 = 3;
		Comparable v1 = (Comparable) o1;
		Comparable v2 = (Comparable) o2;
	        Comparable a = (Comparable)(((Number) o1).doubleValue());
		Comparable b = (Comparable)(((Number) o2).doubleValue());
		System.out.println(a.compareTo(b));
	}
}
