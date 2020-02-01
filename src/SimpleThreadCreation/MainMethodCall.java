package SimpleThreadCreation;

public class MainMethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread t1 = new MyThread();
		t1.start();
		
		for(int iter = 0; iter < 10; iter++) {
			System.out.println("************Inside Main Thread*********** " + iter);
		}

	}

}
