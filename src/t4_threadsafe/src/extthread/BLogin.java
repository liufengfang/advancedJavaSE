package t4_threadsafe.src.extthread;

import t4_threadsafe.src.controller.LoginServlet;

public class BLogin extends Thread {
	@Override
	public void run() {
		LoginServlet.doPost("b", "bb");
	}
}
