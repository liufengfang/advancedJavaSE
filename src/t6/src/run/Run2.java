package t6.src.run;

import t6.src.mythread.MyThread;

public class Run2 {
	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		// mythread.start();
		mythread.run();
	}
}
