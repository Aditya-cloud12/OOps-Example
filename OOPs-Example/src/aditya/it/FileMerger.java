package aditya.it;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMerger {
	public static void main(String[] args) {

		String firstFilePath = "abx.txt";
		String secondFilePath = "aby.txt";
		String outputFilePath = "combined.txt";

		mergeFiles(firstFilePath, secondFilePath, outputFilePath);
	}

	public static void mergeFiles(String firstFilePath, String secondFilePath, String outputFilePath) {
		try {

			BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

			System.out.println("Reading from first file: " + firstFilePath);
			readAndWrite(firstFilePath, writer);

			writer.newLine();

			System.out.println("Reading from second file: " + secondFilePath);
			readAndWrite(secondFilePath, writer);

			writer.close();
			System.out.println("Files merged successfully into: " + outputFilePath);

		} catch (IOException e) {

			System.out.println("An error occurred: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void readAndWrite(String filePath, BufferedWriter writer) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader(filePath));

		String line;

		while ((line = reader.readLine()) != null) {

			writer.write(line);

			writer.newLine();
		}

		reader.close();
	}
}
