package learnJava.Interface;
// normal interface
public class Game implements interfaceDemo {
	public static void main (String args[]) {
	
	Game gg = new Game();
	//interfaceDemo gg = new Game();--> dynamic buinding
	gg.add(1, 2);
	gg.test1();
	interfaceDemo.test2();
	}
	

	@Override
	public void add(int no1, int no2) {
		// TODO Auto-generated method stub
		System.out.println(no1+no2);
	}

}
