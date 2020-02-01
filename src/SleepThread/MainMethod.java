package SleepThread;

public class MainMethod {
	public static void main(String[] args) {

		SleepDemo t1 = new SleepDemo();
		t1.start();

		SleepDemo t2 = new SleepDemo();
		t2.start();
	}
}
