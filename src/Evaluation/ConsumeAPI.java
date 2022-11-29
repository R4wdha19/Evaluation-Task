package Evaluation;

import java.io.IOException;

// consuming The Given Api , Getting The results From it . 

public class ConsumeAPI {
	public static void main(String[] args) throws IOException, InterruptedException {

		WriteToFile wtf = new WriteToFile();
		wtf.WriteResponseFile();
		SearchForWord sfow = new SearchForWord();
		sfow.SearchForOneWord();

	}

}
