package Evaluation;

import java.io.IOException;
import java.util.Scanner;

// consuming The Given Api , Getting The results From it . 

public class ConsumeAPI {
	public static void main(String[] args) throws IOException, InterruptedException {

		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("Writting To File ");
			WriteToFile.WriteResponseFile();
			break;
		case 2:
			System.out.println("Where Do You Want TO Search From ? PDF OR TEXT FILE . ");
			System.out.println("If You Want To Search From Text File press 1 ");

			System.out.println("Search For A Word ");
			SearchForWord.SearchForOneWord();
			break;
		case 3:
			System.out.println("Duplicated And Unique Words ");
			DuplicatedWords.SearchForDuplicatedWords();
		}

	}

}
