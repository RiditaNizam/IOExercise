package com.fdmgroup.ioexercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserRegistration {

	public static void main(String[] args) {
		// System.in- input a single byte or a series of bytes
		Scanner scanner = new Scanner(System.in);
		String name;
		String address;
		String email;
		List<String> personArrayList = new ArrayList<>();

		System.out.println("Enter name and press Enter");
		name = scanner.nextLine(); // Input what was typed

		System.out.println("Enter address and press Enter");
		address = scanner.nextLine();

		System.out.println("Enter e-mail and press Enter");
		email = scanner.nextLine();

		personArrayList.add(name);
		personArrayList.add(address);
		personArrayList.add(email);

		System.out.println(personArrayList);
		writeToFile(personArrayList);
		readFromFile();

	}

	private static void writeToFile(List<String> personDetails) {

		Writer writer = null;
		BufferedWriter bufferedWriter = null;

		try {
			writer = new FileWriter("./persondetails.txt", true);
			bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(personDetails + "\n");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedWriter.flush();
				bufferedWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void readFromFile() {
		try {
			File myFile = new File("./persondetails.txt");

			// FileReader- connection stream for chars, that connects to text file
			FileReader fileReader = new FileReader(myFile);

			// Chain FileReader to a BufferedReader for more efficient reading.
			// It'll go back to the file to read only when buffer is empty
			BufferedReader reader = new BufferedReader(fileReader);

			// Make a String variable to hold each line as the line is read
			String line = null;

			List<String> answerArrayList = new ArrayList<>();

			// Read line of text, assign it to String variable line
			// While there are still lines to read, read them and add them to the ArrayList
			while ((line = reader.readLine()) != null) {
				answerArrayList.add(line);
			}

			reader.close();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

}