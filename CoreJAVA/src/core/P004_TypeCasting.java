package core;

public class P004_TypeCasting {
	public static void main(String[] args) {

		int a = 1;
		System.out.println("a = " + a);

		//implicit
		double d = a;
		System.out.println("d = " + d);
	
		//explicit
		double d1 = 3.14;
		int b = (int)d1;
		System.out.println("b = "+b);
	}
}
