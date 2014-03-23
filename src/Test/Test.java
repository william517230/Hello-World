package Test;

public class Test {
	
	public static void main(String args[]){
		String s = "base";
		s.substring(0, 3);
		s.concat("ket");
		System.out.println(s);
	}
	
	public static void operate(StringBuffer x, StringBuffer y){
		x.append(y);
		y = x;
		
	}
}
