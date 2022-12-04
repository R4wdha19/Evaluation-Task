package Evaluation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DuplicatedWords {
	public static void SearchForDuplicatedWords() throws IOException, InterruptedException {
		Scanner sc = new Scanner(new FileInputStream(("C:\\Users\\user013\\Desktop\\Test.txt")));
		String search = sc.next();

		search = search.replaceAll("\\W", " ");
		String[] jasonStringArray = search.split(" ");
		Scanner sc1 = new Scanner(System.in);
		Integer count = 0;
//		ArrayList<String> uInput = new ArrayList();
		Boolean input = true;
//		HashSet<String> uniqueWords = new HashSet<>();

//		while (input) {

		System.out.println(" Enter The Word You Want to Search For : ");
		String userInput = sc1.next();
//			uInput.add(userInput);
		List<String> list = new ArrayList<>();

		list.addAll(Arrays.asList(jasonStringArray));

		for (String st : list) {
			if (st.equals(userInput)) {
				count++;
			}

		}
		System.out.println(userInput + " occurs " + count + " time.");
		if (count == 1) {
			System.out.println(userInput + " This Word is Unique");
		}
		/*
		 * if (count == 1) { System.out.println("Unique"); System.out.println(count); }
		 * else if (count > 1) { System.out.println("This word is duplicated");
		 * 
		 * }
		 */
//		}
//		input = false;
	}
}