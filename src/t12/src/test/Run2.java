package t12.src.test;

import t12.src.exthread.MyThread;



public class Run2 {
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("�Ƿ�ֹͣ1��=" + Thread.interrupted());
		System.out.println("�Ƿ�ֹͣ2��=" + Thread.interrupted());
		System.out.println("end!");
	}
}
