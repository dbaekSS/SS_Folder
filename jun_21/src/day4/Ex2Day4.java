package day4;

public class Ex2Day4 {


	public static void main(String[] args) {
		
		Object l1 = new Object();
		Object l2 = new Object();
		
		Runnable t1 = new Runnable() {

			@Override
			public void run() {
				synchronized(l1) {
					System.out.println("thread 1 holding lock 1");
				}
				try {
					Thread.sleep(100);
					System.out.println("thread 1 waiting for lock 2");
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized(l2) {
					System.out.println("thread 1 holding lock 2");
				}
			}
		};

		Runnable t2 = new Runnable() {

			@Override
			public void run() {
				synchronized(l2) {
					System.out.println("thread 2 holding lock 2");
				}
				try {
					Thread.sleep(100);
					System.out.println("thread 1 waiting for lock 2");
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized(l1) {
					System.out.println("thread 2 holding lock 1");
				}
			}
		};
		new Thread(t1).start();
		new Thread(t2).start();
	}
}