package runMethodUseStopMethod.src.test.run;

import runMethodUseStopMethod.src.testpackage.MyThread;

public class Run {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
	}
}
