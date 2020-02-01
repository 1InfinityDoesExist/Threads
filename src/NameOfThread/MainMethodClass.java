package NameOfThread;

public class MainMethodClass {

	public static void main(String[] args) {

		MainThread t1 = new MainThread();
		t1.start();
		for (int iter = 0; iter < 10; iter++) {
			System.out.println("Main:- " + Thread.currentThread().getName());
		}

	}

}
