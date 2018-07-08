package t12.src.test;

import t12.src.exthread.MyThread;



public class Run2 {
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("ÊÇ·ñÍ£Ö¹1£¿=" + Thread.interrupted());
		System.out.println("ÊÇ·ñÍ£Ö¹2£¿=" + Thread.interrupted());
		System.out.println("end!");
	}
}
