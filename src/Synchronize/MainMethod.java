package Synchronize;

public class MainMethod {
	public static void main(String[] args) {

		SynchronizeMethod obj = new SynchronizeMethod();
		FirstThread f1 = new FirstThread(obj);
		SecondThread f2 = new SecondThread(obj);

		f1.start();
		f2.start();

	}

}
