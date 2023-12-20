package learnJava.Array;

import java.util.Scanner;

public class ArrayInput {
	public static void main(String agrs[]) {
		int n;
		Scanner  sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] array= new int[n];
		
		for(int i=0;i<=n;i++) {
			array[i]=sc.nextInt();
			System.out.println(array[i]);
		}
		System.out.println(array);
	}
}
