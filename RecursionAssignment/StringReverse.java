package RecursionAssignment;

public class StringReverse {
	
	static String reverse(String str,int length) {
		if(length==0) 
			return str;
		
		return str.substring(length)+reverse(str.substring(0,str.length()-1),length-1);
	}
	
	public static void main(String[] args) {
		String str = "Vishal";
		String strReversed = reverse(str,str.length()-1);
		System.out.println(strReversed);
	}
}
