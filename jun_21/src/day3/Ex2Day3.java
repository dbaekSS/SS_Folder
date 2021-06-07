package day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Ex2Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String apData = "This is data that is being appended"; //change to change added string
		String path = "src/day3/out.txt"; //change to change path file
		try {
			Files.write(Paths.get(path), apData.getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
