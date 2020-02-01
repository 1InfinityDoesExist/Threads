package PriorityThread;

public class MainMethod {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setPriority(10);
		t1.start();

		for (int iter = 0; iter < 20; iter++) {
			System.out.println(
					"***************Main Thread***********************" + Thread.currentThread().getPriority());
		}

	}

}
