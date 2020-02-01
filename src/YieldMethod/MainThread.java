package YieldMethod;

public class MainThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int iter = 0; iter < 10; iter++) {
			System.out.println("**************Thread***************" + iter);

		}
	}

}
