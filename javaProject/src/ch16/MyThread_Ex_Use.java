package ch16;

public class MyThread_Ex_Use {
	public static void main(String[] args) {
		MyThread_Ex m = new MyThread_Ex("스레드1");
		MyThread_Ex m2 = new MyThread_Ex("스레드2");
		m.setPriority(Thread.MAX_PRIORITY);
		m2.setPriority(Thread.MIN_PRIORITY);
		m.start();
		m2.start();
	}
}
