package day4;

public class Ex3Day4 {

	public static void main(String[] args) throws InterruptedException {
		final ArrProdCon apc = new ArrProdCon();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					apc.produce();
				} catch (InterruptedException e){
					e.printStackTrace();
				}
			}	
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					apc.consumer();
				} catch (InterruptedException e){
					e.printStackTrace();
				}
			}	
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}
}
	