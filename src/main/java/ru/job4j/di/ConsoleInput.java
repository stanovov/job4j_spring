package ru.job4j.di;

import java.util.Scanner;

public class ConsoleInput {

    private Scanner scanner = new Scanner(System.in);

    public String enterString() {
        System.out.println("Enter string:");
        return scanner.nextLine();
    }
}
