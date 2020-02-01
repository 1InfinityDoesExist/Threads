package Synchronize;

public class SynchronizeMethod {

	public void printNumber(int x) {

		for (int iter = 0; iter < 10; iter++) {

			synchronized (this) {
				System.out.println("**********" + x * iter);
			}

		}
	}

}
