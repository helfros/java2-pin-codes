package ru.sportmaster.java2;

public class PinCode {
    private final String[] pinCodes = new String[]{"2e21d1", "2d2d21", "2d2312d", "f43f434f3"};

    public String getPinCode(int number) {
        try {
            return pinCodes[number];
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("Некорректный номер ячейки", e);
        }
    }
}
