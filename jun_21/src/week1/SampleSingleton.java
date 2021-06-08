package week1;

/*import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;  don't need these imports*/


public class SampleSingleton { //don't need static
	
	private SampleSingleton() {
		//no instance calling for other classes
	}
	//private static Connection conn = null; unneeded
	
	volatile public static SampleSingleton instance = null; //should be public and volatile for thread sync
	
	public static SampleSingleton getInstance() { //adding a synchronized instance lets only one thread access at a time
		synchronized (instance) {
			if (instance == null) {
				instance = new SampleSingleton();
			}
		}

		return instance;
	}
	
}
