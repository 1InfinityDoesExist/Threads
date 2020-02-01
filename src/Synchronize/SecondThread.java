package Synchronize;

public class SecondThread extends Thread {

	SynchronizeMethod syncMethod;

	public SecondThread(SynchronizeMethod syncMethod) {
		this.syncMethod = syncMethod;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		syncMethod.printNumber(5);
	}

}
