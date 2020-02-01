package JoinThread;

public class JoinDemo extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int iter = 0; iter < 10; iter++) {
			System.out.println("*************Join Demo*************");

		}
	}
}
