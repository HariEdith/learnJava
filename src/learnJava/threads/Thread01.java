package learnJava.threads;


public class Thread01 extends Thread {// public class Main implements Runnable {
	  public static void main(String[] args) {
		  
	    Thread01 thread = new Thread01();
	    thread.start();
	    System.out.println("This code is outside of the thread");
	    
	  }
	  public void run() {
	    System.out.println("This code is running in a thread");
	  }
	}

