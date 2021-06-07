package day3;

import java.io.File;

public class Ex1Day3 {

	public static void listFiles(File folder) {
		for(File file: folder.listFiles()) {
			if(file.isDirectory()) {
				listFiles(file);
			} else {
				System.out.println(file.getName());
			}
		}
	}
	public static void main(String[] args) {
		File files = new File("C:\\Users\\AZNTO\\git\\SS_Folder\\jun_21"); //enter file name here
		listFiles(files);
	}

}
