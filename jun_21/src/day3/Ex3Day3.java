package day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex3Day3 {

	public static void main(String[] args) {
		char c = 0;
		if(args != null){
			if(args[0].length() == 1) { //check to see if it's a single character
				c = args[0].charAt(0);
			}
			try {
				BufferedReader buf = new BufferedReader(new FileReader("src/day3/out.txt"));
				int count = 0;
				String line = buf.readLine();
				while(line != null) {
					for(int i = 0; i < line.length(); i++) {
						if(line.charAt(i) == c) {
							count++;
						}
					}
					line = buf.readLine();
				}
				System.out.println("total number of " + c + "'s is: " + count);
				buf.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
