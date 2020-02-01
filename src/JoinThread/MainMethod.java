package JoinThread;

public class MainMethod {
	public static void main(String[] args) throws InterruptedException {

		JoinDemo t1 = new JoinDemo();
		t1.start();

		t1.join(100000);

		for (int iter = 0; iter < 10; iter++) {
			System.out.println("*********main Join***************");
		}
	}

}
