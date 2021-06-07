package day4;

public class Ex1Day4 {

	volatile public static Ex1Day4 instance = null;
	
	private Ex1Day4() { //private constructor
		
	}
	
	/*synchronized method sync*/ public Ex1Day4 getInstance() {
		synchronized(instance) {
			if(instance == null) {
				instance = new Ex1Day4();
			}
		}
		return instance;
	}
	
}