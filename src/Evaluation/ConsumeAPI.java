package Evaluation;

import java.io.IOException;
import java.util.Scanner;

// consuming The Given Api , Getting The results From it . 

public class ConsumeAPI {
	public static void main(String[] args) throws IOException, InterruptedException {
		boolean menu = true;
		Scanner sc = new Scanner(System.in);
		while (menu) {
			System.out.println("Please Choose An Option : ");
			System.out.println(" 1 : Writting Response To File  ");
			System.out.println(" 2 : Search For A Word ");
			System.out.println(" 3 : Find Duplicated And Unique Words ");
			System.out.println(" 4 : Search For Many Words  ");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Writting To File ");
				WriteToFile.WriteResponseFile();
				break;
			case 2:
				System.out.println(" Search For A Word  ");
				SearchForWord.SearchForOneWord();
				break;

			case 3:
				System.out.println("Duplicated And Unique Words ");
				DuplicatedWords.SearchForDuplicatedWords();
				break;
			case 4:
				System.out.println("  Searching For Many Words  ");
			}

		}
		menu = false;
	}
}
