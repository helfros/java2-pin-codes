package ru.sportmaster.java2;

import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PinCode pinCodes = new PinCode();
        try (Scanner userInputScanner = new Scanner(System.in)) {
            int pinCodeNumber = scanNumber(userInputScanner);

            System.out.println(pinCodes.getPinCode(pinCodeNumber));
        }
    }

    public static int scanNumber(Scanner userInputScanner) {
        System.out.println("Введите номер ячейки (от 0 до 3)");
        try {
            return userInputScanner.nextInt();
        } catch (InputMismatchException e) {
            throw new RuntimeException("Вы ввели не число", e);
        }

    }
}