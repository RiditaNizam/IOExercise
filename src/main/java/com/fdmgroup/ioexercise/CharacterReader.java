package com.fdmgroup.ioexercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CharacterReader {

	public static void main(String[] args) {
		// Set up filename
		String currentDirectory = System.getProperty("user.dir");
		String fullFileName = currentDirectory + "/input.txt";

		ArrayList<String> linesList = new ArrayList<>();
		try {
			// Set up Buffered Reader
			FileReader fileReader = new FileReader(fullFileName); // Reads ONE CHARACTER at a time
			BufferedReader bufferedReader = new BufferedReader(fileReader); // Reads one LINE at a time

			String line = "";
			int count = 0;

			// Print total number of e's in file
			while ((line = bufferedReader.readLine()) != null) {
				linesList.add(line);
				for (int i = 0; i < line.length(); i++) {
					if (line.charAt(i) == 'e') {
						count++;
					}
				}
			}
			System.out.println(count);

			bufferedReader.close(); // Close the file connection. Shut the file.
		} catch (Exception exception) {
			System.out.println("Something went wrong while reading the file.");
		}
	}
}