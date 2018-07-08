package stopThrowLock.src.testpackage;

import stopThrowLock.src.testpackage.SynchronizedObject;

public class MyThread extends Thread {

	private SynchronizedObject object;

	public MyThread(SynchronizedObject object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {
		object.printString("b", "bb");
	}
}
