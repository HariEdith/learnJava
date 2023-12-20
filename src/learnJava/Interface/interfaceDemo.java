package learnJava.Interface;


@FunctionalInterface
public interface interfaceDemo {
	
	
	public abstract void add(int no1,int no2);
	
	default void test1() {
		
		System.out.println("i am default");
		
	}
	static void test2() {
		
		System.out.println("i am static");
	}
}
