package Synchronize;

public class FirstThread extends Thread {

	SynchronizeMethod syncMethod;

	public FirstThread(SynchronizeMethod syncMethod) {
		this.syncMethod = syncMethod;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		syncMethod.printNumber(100);
	}

}
