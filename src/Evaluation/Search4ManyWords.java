package Evaluation;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search4ManyWords {
	public static void main(String[] args) throws IOException, InterruptedException {
		List<String> listOfStrings = new ArrayList<String>();
		Scanner sc = new Scanner(new FileReader("C:\\Users\\user013\\Desktop\\Test.txt")).useDelimiter(",\\s*");
		String string;
		while (sc.hasNext()) {
			string = sc.next();

			listOfStrings.add(string);
		}
		String[] array = listOfStrings.toArray(new String[0]);
		for (String eachString : array) {
			System.out.println(eachString);
		}
//		  
//		Scanner sc2 = new Scanner(System.in);
//		System.out.println(" Enter the Words You want to search for ");
//		String Words = sc.next();
//		if (list.contains(Words)) {
//			System.out.println(" Words" + Words + " Are found ");
//
//		} else {
//			System.out.println(" Words can not be found ");
//		}
	}
}
