package learnJava.Exception;

public class Ecpt01 {
	public static void main(String arg[]) {
		
		try {
		int a=2/0;}
		catch (ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		finally {}
		System.out.println("hi");
	}
}
