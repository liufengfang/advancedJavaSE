package t4_threadsafe.src.extthread;

import t4_threadsafe.src.controller.LoginServlet;

public class ALogin extends Thread {
	@Override
	public void run() {
		LoginServlet.doPost("a", "aa");
	}
}
