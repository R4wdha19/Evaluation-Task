package Evaluation;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class WriteToFile {
	public static void WriteResponseFile() throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Choose An Option : ");
		System.out.println(" 1 : Writting Response As A Text File  ");
		System.out.println(" 2 : Writting Response As A PDF File  ");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println(" Writting Response As A Text File  ");
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.nationalize.io/?name=nathaniel"))
					.GET().build();

			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

			System.out.println(response.body());

			// Writing it to file
			Path myFile = Path.of("C:\\Users\\user013\\Desktop\\Test.txt");
			Files.writeString(myFile, response.body(), StandardCharsets.UTF_8);
			break;
		case 2:
			System.out.println(" 2 : Writting Response As A PDF File  ");
			HttpClient client1 = HttpClient.newHttpClient();
			HttpRequest request1 = HttpRequest.newBuilder()
					.uri(URI.create("https://api.nationalize.io/?name=nathaniel")).GET().build();

			HttpResponse<String> response1 = client1.send(request1, HttpResponse.BodyHandlers.ofString());

			System.out.println(response1.body());

			// Writing it to file
			Path myFile1 = Path.of("C:\\Users\\user013\\Desktop\\Test.pdf");
			Files.writeString(myFile1, response1.body(), StandardCharsets.UTF_8);

		}

	}

}
