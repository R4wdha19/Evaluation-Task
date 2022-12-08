package Evaluation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SearchForWord {

	public static void SearchForOneWord() throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		Path newDirectory = Path.of("C:\\Users\\user013\\Documents");
		boolean reading = true;
		System.out.println("Please Choose An Option : ");
		System.out.println(" 1 : Search From A Text File  ");
		System.out.println(" 2 : Search From A PDF File  ");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println(" Search From A Text File ");
			// Searching from a file for one word

			Path pathOfFile = Path.of("C:\\Users\\user013\\Desktop\\Test.txt");

			System.out.println(" Enter The Word That You Want To Search for ");
			String words = sc.next();
			String stringFromFile = "";

			stringFromFile = Files.readString(pathOfFile);

			try {
				stringFromFile = Files.readString(pathOfFile);
				// Error handling
			} catch (IOException e) {
				System.out.println(e.getMessage());

			}

			if (stringFromFile.contains(words)) {

				System.out.println(words + " Is Found");
				Files.move(pathOfFile, newDirectory.resolve(pathOfFile.getFileName()));
			} else {
				System.out.println(words + " Word Not Found");
			}

			break;
		case 2:
			System.out.println(" Search From A PDF File ");
			// Searching from a file for one word

			Path pathOfFile1 = Path.of("C:\\Users\\user013\\Desktop\\Test.pdf");

			System.out.println(" Enter The Word That You Want To Search for ");
			String words1 = sc.next();
			String stringFromFile1 = "";

			stringFromFile1 = Files.readString(pathOfFile1);

			try {
				stringFromFile1 = Files.readString(pathOfFile1);
				// Error handling
			} catch (IOException e) {
				System.out.println(e.getMessage());

			}

			if (stringFromFile1.contains(words1)) {

				System.out.println(words1 + " Is Found");
				Files.copy(pathOfFile1, newDirectory.resolve(pathOfFile1.getFileName()));
			} else {
				System.out.println(words1 + " Word Not Found");
			}
		}

	}

}
