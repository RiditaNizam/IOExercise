package com.fdmgroup.ioexercisetests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.fdmgroup.ioexercise.CharacterReader;
import com.fdmgroup.ioexercise.UserRegistration;

class IOExerciseTests {

	@Test
	public void test_CanCountNumberofesInFile() {
		// Arrange
		CharacterReader characterReader = new CharacterReader();
		// Act
		int numOfChars = characterReader.readChars();
		// Assert
		assertEquals(4, numOfChars);
	}

	@Test
	public void test_CanRegisterNewUser() {
		// Arrange
		UserRegistration userRegistration = new UserRegistration();
		// Act

		// Assert
		// assertTrue([Ridita Nizam, 1391 Altadena Dr., Pasadena, CA 91107,
		// Ridita@msn.com],);
	}

	@Test
	public void test_CanPopulateUserObjectWithLineFromTextFile() {
		// Arrange
		UserRegistration userRegistration = new UserRegistration();
		// Act
		userRegistration.readFromFile();
		// Assert
		// assertEquals()
	}

}
