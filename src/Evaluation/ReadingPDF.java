package Evaluation;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadingPDF {
	public static void readUsingPdfBox() throws IOException {
		System.out.println("Enter File You Want to Use");
		Scanner scanner = new Scanner(System.in);
		String fileToUse = scanner.next();
		PDDocument pdDocument = PDDocument.load(new File(System.getProperty("user.dir") + "\\" + fileToUse + ".pdf"));
		PDFTextStripper textStripper = new PDFTextStripper();
		String textFromFile = textStripper.getText(pdDocument);
		System.out.println("Enter Word You Want to Search\n");
		Scanner scannerObject = new Scanner(System.in);
		String wordToSearch = scannerObject.next();
		if (textFromFile.contains(wordToSearch)) {
			System.out.println(wordToSearch + " found!!");
		} else {
			System.out.println(wordToSearch + " Not found");
		}
		pdDocument.close();

	}
}
