package SleepThread;

public class SleepDemo extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int iter = 0; iter < 10; iter++) {

			if (iter == 4) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("***********Sleep Demo**********" + Thread.currentThread().getName()+ "--------" + iter);
		}
	}
}
