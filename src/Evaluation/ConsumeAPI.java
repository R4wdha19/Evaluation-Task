package Evaluation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

// consuming The Given Api , Getting The results From it . 

public class ConsumeAPI {
	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.nationalize.io/?name=nathaniel"))
				.GET().build();

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		System.out.println(response.body());

		// Writing it to file
		Path myFile = Path.of("C:\\Users\\user013\\Desktop\\Test.txt");
		Files.writeString(myFile, response.body(), StandardCharsets.UTF_8);
		boolean reading = true;

		// Searching from a file for one word
		while (reading) {
			Path pathToFile = Path.of("C:\\Users\\user013\\Desktop\\Test.txt");

			System.out.println(" Enter The Word That You Want To Search for ");
			String words = sc.nextLine();

			String stringFromFile = "";
			File file1 = new File("C:\\Users\\user013\\Desktop\\Test.txt");
			ArrayList wordsList = new ArrayList();
			wordsList.add(words);
			FileReader fileReaderObj = new FileReader(file1);
			BufferedReader bufferReaderObj = new BufferedReader(fileReaderObj);
			String search;

			int count = 0;
			stringFromFile = Files.readString(pathToFile);

			try {

				stringFromFile = Files.readString(pathToFile);

				if (wordsList.equals(words))

				{
					count++;
				}

				if (count != 0 && stringFromFile.contains(words)) {

					System.out.println(words + "Word is Found" + count + "Times ");

				} else {
					System.out.println("Word is Not Found");
				}

				fileReaderObj.close();
			}
			// Error handling
			catch (IOException e) {
				System.out.println(e.getMessage());

			}

		}
		reading = false;

	}
}
