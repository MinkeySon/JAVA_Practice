package JAVA_IO;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class ScannerDemo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("out.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt()*1000);
			}
			sc.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
