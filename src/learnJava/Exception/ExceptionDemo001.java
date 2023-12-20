package learnJava.Exception;

import java.util.Scanner;

public class ExceptionDemo001 {	
	public static void main(String args[]) {
		ExceptionDemo001 ec= new ExceptionDemo001();
		
		ec.add();
		ec.divide();
	}

	private void divide() {
		Scanner sc = new Scanner(System.in);
		int n01= sc.nextInt();
		int n02= sc.nextInt();
		
		System.out.println("divide" + n01/n02);
	}

	private void add() {
		Scanner sc = new Scanner(System.in);
		int n01= sc.nextInt();
		int n02= sc.nextInt();
		
		System.out.println("add" + n01+n02);
	}

}
