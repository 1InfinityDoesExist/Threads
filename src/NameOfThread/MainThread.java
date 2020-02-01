package NameOfThread;

public class MainThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int iter = 0; iter < 10; iter++) {
			if (iter == 4) {
				Thread.currentThread().setName("Babu");
			}
			if (iter == 6) {
				Thread.currentThread().setName("Garlic Nan");
			}
			System.out.println(Thread.currentThread().getName());
		}

	}
}
