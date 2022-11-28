package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    // Wenn password kürzer als 6 char, dann soll false sein
    @Test
    void isPasswordValid_whenShorterThan6Char_thenReturnFalse() {
        // given
        String password = "12345";
        // when
        boolean actual = Main.isPasswordValid(password);
        // then
        Assertions.assertEquals(false, actual);
    }

    // Wenn password keine Zahl enthält, dann soll false sein
    @Test
    void isPasswordValid_whenNoDigits_thenReturnFalse() {
        // given
        String password = "abcdefgh";
        // when
        boolean actual = Main.isPasswordValid(password);
        // then
        Assertions.assertEquals(false, actual);
    }

    // Wenn password kürzer als 6 char und eine Zahl enthält, dann soll false sein
    @Test
    void isPasswordValid_whenShorterThan6CharAndOneDigit_thenReturnFalse() {
        // given
        String password = "abcd1";
        // when
        boolean actual = Main.isPasswordValid(password);
        // then
        Assertions.assertEquals(false, actual);
    }

    // Wenn password länger als/oder 6 char und keine Zahl enthält, dann soll false sein
    @Test
    void isPasswordValid_whenLongerThan6CharAndNoDigits_thenReturnFalse() {
        // given
        String password = "abcdef";
        // when
        boolean actual = Main.isPasswordValid(password);
        // then
        Assertions.assertEquals(false, actual);
    }

    // Wenn das password länger als/oder 6 char und eine Zahl enthält und keinen
    // großen Buchstaben enthält, dann return false
    @Test
    void isPasswordValid_whenLongerThan6CharAndADigitAndNoCapitalLetters_thenReturnFalse() {
        // given
        String password = "abcde1";
        // when
        boolean actual = Main.isPasswordValid(password);
        // then
        Assertions.assertEquals(false, actual);
    }

    // Wenn das password länger als/oder 6 char und eine Zahl enthält und einen großen Buchstaben enthält, dann return true
    @Test
    void isPasswordValid_whenLongerThan6CharAndADigitAndACapitalLetter_thenReturnTrue() {
        // given
        String password = "Abcde1";
        // when
        boolean actual = Main.isPasswordValid(password);
        // then
        Assertions.assertEquals(true, actual);
    }

    // Wenn password 123456 dann return false
    @Test
    void isPasswordValid_when123456_thenReturnFalse() {
        // given
        String password = "123456";
        // when
        boolean actual = Main.isPasswordValid(password);
        // then
        Assertions.assertEquals(false, actual);
    }

    // Wenn password passwort dann return false
    @Test
    void isPasswordValid_when_passwort_thenReturnFalse() {
        // given
        String password = "passwort";
        // when
        boolean actual = Main.isPasswordValid(password);
        // then
        Assertions.assertEquals(false, actual);
    }

    // Wenn password Passwort123456 dann return false
    @Test
    void isPasswordValid_whenPasswort123456_thenReturnFalse() {
        // given
        String password = "Passwort123456";
        // when
        boolean actual = Main.isPasswordValid(password);
        // then
        Assertions.assertEquals(false, actual);
    }

}