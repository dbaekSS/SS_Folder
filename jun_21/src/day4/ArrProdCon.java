package day4;

import java.util.ArrayList;

public class ArrProdCon {
	
	ArrayList<Integer> arr = new ArrayList<Integer>();
	int cap = 5;

	public void produce() throws InterruptedException {
		while(true) {
			synchronized (this) {
				while(arr.size() >= cap) {
					wait(); //if array is bigger than 5 wait
				}
				int val = (int) (Math.random() * 10);
				System.out.println("arr made " + val);
				arr.add(val);
				notify(); //tells consume to resume
				Thread.sleep(500); //short time to move to next
			}
		}
	}

	public void consumer() throws InterruptedException {
		while(true) {
			synchronized(this) {
				while(arr.size() <= 0) {
					wait(); //don't do anything if arr is empty
				} 
				int val = arr.remove(0);
				System.out.println("arr removed " + val);
				notify();
				Thread.sleep(500); //short time to move to next
			}
		}
	}
}
