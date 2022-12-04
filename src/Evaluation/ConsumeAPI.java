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
			System.out.println("Search For A Word ");
			SearchForWord.SearchForOneWord();
		}

//		WriteToFile wtf = new WriteToFile();
//		
//		SearchForWord sfow = new SearchForWord();
//		

		DuplicatedWords.SearchForDuplicatedWords();

	}

}
