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

		// Searching from a file
		System.out.println(" Enter The Word That You Want To Search for ");
		String words = sc.nextLine();

		File file1 = new File("C:\\Users\\user013\\Desktop\\Test.txt");

		FileReader fileReaderObj = new FileReader(file1);
		BufferedReader bufferReaderObj = new BufferedReader(fileReaderObj);
		String search = bufferReaderObj.readLine();

		while (search != null) {

			if (search.equals(words))

			{
				System.out.println("Word is Found");
			}

			else {
				System.out.println("Word is Not Found");
			}
		}
		fileReaderObj.close();
	}

}
