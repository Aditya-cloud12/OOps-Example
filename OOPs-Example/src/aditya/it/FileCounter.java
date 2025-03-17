package aditya.it;

import java.io.File;
import java.util.Scanner;

public class FileCounter {
	public static void main(String[] args) {
		
		String filePath = "abx.txt";

		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;

		try {

			File file = new File(filePath);

			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {

				String line = scanner.nextLine();

				lineCount = lineCount + 1;

				charCount = charCount + line.length();

				if (!line.isEmpty()) {

					String[] words = line.split(" ");

					for (int i = 0; i < words.length; i++) {
						String word = words[i];
						if (!word.isEmpty()) {
							wordCount = wordCount + 1;
						}
					}
				}
			}

			scanner.close();

			
			System.out.println("Total characters: " + charCount);
			System.out.println("Total words: " + wordCount);
			System.out.println("Total lines: " + lineCount);

		} catch (Exception e) {
			System.out.println("Error reading the file: " + e.getMessage());
		}
	}
}
