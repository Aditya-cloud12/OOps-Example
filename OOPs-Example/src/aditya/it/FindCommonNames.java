package aditya.it;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FindCommonNames {

	public static void main(String[] args) {
		// Step 1: Create file objects
		File file1 = new File("abx.txt");
		File file2 = new File("aby.txt");

		// Step 2: Read names from both files
		ArrayList<String> namesFromFile1 = readNamesFromFile(file1);
		ArrayList<String> namesFromFile2 = readNamesFromFile(file2);

		// Step 3: Find common names
		ArrayList<String> commonNames = findCommonNames(namesFromFile1, namesFromFile2);

		// Step 4: Print the results
		System.out.println("Names found in both files:");

		if (commonNames.size() == 0) {
			System.out.println("No common names found.");
		} else {
			for (String name : commonNames) {
				System.out.println(name);
			}
			System.out.println("\nTotal common names found: " + commonNames.size());
		}
	}

	// This method reads all names from a file and returns them as a list
	public static ArrayList<String> readNamesFromFile(File file) {
		ArrayList<String> names = new ArrayList<String>();

		try {
			// Create a Scanner to read the file
			Scanner scanner = new Scanner(file);

			// Read each line (name) from the file
			while (scanner.hasNextLine()) {
				String name = scanner.nextLine().trim();

				// Only add non-empty names to the list
				if (!name.equals("")) {
					names.add(name);
				}
			}

			// Close the scanner when done
			scanner.close();

		} catch (FileNotFoundException e) {
			// If the file doesn't exist, print an error message
			System.out.println("Error: File not found - " + file.getName());
		}

		return names;
	}

	// This method finds names that appear in both lists
	public static ArrayList<String> findCommonNames(ArrayList<String> list1, ArrayList<String> list2) {
		ArrayList<String> commonNames = new ArrayList<String>();

		// Check each name in list1
		for (String name : list1) {
			// If the name is also in list2, it's a common name
			if (list2.contains(name)) {
				commonNames.add(name);
			}
		}

		return commonNames;
	}
}