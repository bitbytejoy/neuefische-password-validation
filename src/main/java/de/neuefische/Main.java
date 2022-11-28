package de.neuefische;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // Es muss mindestens 6 Karakter lang sein
    // Es muss mindestens 1 Zahl enthalten

    // password.length() >= 6 && password.matches("^.*[0-1].*$")

    public static boolean isPasswordValid (String password) {
        String[] forbiddenPasswords = new String[] {
            "Passwort123456",
            "Passwort1",
            "Passwort2!"
        };

        for (int i = 0; i < forbiddenPasswords.length; i++) {
            if (password.equals(forbiddenPasswords[i])) {
                return false;
            }
        }

        boolean containsCapitals = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                containsCapitals = true;
            }
        }

        return password.length() >= 6 && (
            password.contains("0") ||
            password.contains("1") ||
            password.contains("2") ||
            password.contains("3") ||
            password.contains("4") ||
            password.contains("5") ||
            password.contains("6") ||
            password.contains("7") ||
            password.contains("8") ||
            password.contains("9")
        ) && containsCapitals;
    }
}