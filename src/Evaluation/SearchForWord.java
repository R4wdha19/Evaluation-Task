package Evaluation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SearchForWord {

	public static void SearchForOneWord() throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		boolean reading = true;
		System.out.println("Please Choose An Option : ");
		System.out.println(" 1 : Search From A Text File  ");
		System.out.println(" 2 : Search From A PDF File  ");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println(" Search From A Text File ");
			// Searching from a file for one word
			while (reading) {
				Path pathToFile = Path.of("C:\\Users\\user013\\Desktop\\Test.txt");

				System.out.println(" Enter The Word That You Want To Search for ");
				String words = sc.nextLine();
				String stringFromFile = "";

				stringFromFile = Files.readString(pathToFile);

				try {
					stringFromFile = Files.readString(pathToFile);
					// Error handling
				} catch (IOException e) {
					System.out.println(e.getMessage());

				}

				if (stringFromFile.contains(words)) {

					System.out.println(words + " Is Found");
				} else {
					System.out.println(words + " Word Not Found");
				}
			}
			reading = false;
			break;
		case 2:
			System.out.println(" Search From A PDF File ");
			// Searching from a file for one word
			while (reading) {
				Path pathToFile = Path.of("C:\\Users\\user013\\Desktop\\Test.pdf");

				System.out.println(" Enter The Word That You Want To Search for ");
				String words = sc.nextLine();
				String stringFromFile = "";

				stringFromFile = Files.readString(pathToFile);

				try {
					stringFromFile = Files.readString(pathToFile);
					// Error handling
				} catch (IOException e) {
					System.out.println(e.getMessage());

				}

				if (stringFromFile.contains(words)) {

					System.out.println(words + " Is Found");
				} else {
					System.out.println(words + " Word Not Found");
				}
			}
			reading = false;

		}

	}
}
