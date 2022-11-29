package Evaluation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class DuplicatedWords {
	public static void SearchForDuplicatedWords() throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);

		List<String> listOfWords = new ArrayList<>();
		HashSet<String> words = new HashSet<>();

		for (String word : listOfWords) {
			if (words.add(word) == false) {
				System.out.println("The Dublicated Words Are : " + word);
			}
		}

	}
}
