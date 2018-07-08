package t4_threadsafe.src.test;

import t4_threadsafe.src.extthread.*;

public class Run {

	public static void main(String[] args) {
		ALogin a = new ALogin();
		a.start();
		BLogin b = new BLogin();
		b.start();
	}

}
