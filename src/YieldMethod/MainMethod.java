package YieldMethod;

public class MainMethod {
	public static void main(String[] args) {

		MainThread t1 = new MainThread();
		t1.start();

		for (int iter = 0; iter < 10; iter++) {
			Thread.yield();
			System.out.println("**********Main************" + iter);
		}

	}

}
