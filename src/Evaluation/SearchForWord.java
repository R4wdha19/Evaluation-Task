package Evaluation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Scanner;

public class SearchForWord {

	public static void SearchForOneWord() throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		String stringFromFile = "";
		String stringFromFile1 = "";
		Path newDirectory = Path.of("C:\\Users\\user013\\Documents");
		boolean reading = true;
		System.out.println(" Enter The Words That You Want To Search for ");
		String words = sc.next();
		String[] EnteredWords = words.split(",");
		HashSet<String> strings = new HashSet<>();
		strings.add(words);
		System.out.println(strings);
		sc.nextLine();
		System.out.println("Please Choose An Option : ");
		System.out.println(" 1 : Search From A Text File  ");
		System.out.println(" 2 : Search From A PDF File  ");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println(" Search For Words From A Text File ");
			System.out.println(" Remeber ! If Word is Found File will be Moved To Documents Dirctory ");

			Path pathOfFile = Path.of("C:\\Users\\user013\\Desktop\\Test.txt");

			stringFromFile = Files.readString(pathOfFile);
			for (String R : EnteredWords) {
				if (stringFromFile1.contains(R)) {

					System.out.println(words + " Is Found");
					Files.move(pathOfFile, newDirectory.resolve(pathOfFile.getFileName()));
				} else {
					System.out.println(words + " Word Not Found");
				}
			}

			break;
		case 2:

			System.out.println(" Search From A PDF File ");
			System.out.println(" Remeber ! If Word is Found File will be Moved To Documents Dirctory ");
			// Searching from a file for one word

			Path pathOfFile1 = Path.of("C:\\Users\\user013\\Desktop\\Test.pdf");

//			System.out.println(" Enter The Word That You Want To Search for ");
//			String words1 = sc.next();
//			String stringFromFile1 = "";

			stringFromFile1 = Files.readString(pathOfFile1);
			for (String R : EnteredWords) {
				if (stringFromFile1.contains(R)) {

					System.out.println(words + " Is Found");

					Files.move(pathOfFile1, newDirectory.resolve(pathOfFile1.getFileName()));
				} else {
					System.out.println(words + " Word Not Found");
				}
			}

		}

	}
}