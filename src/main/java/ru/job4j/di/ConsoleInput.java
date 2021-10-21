package ru.job4j.di;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleInput {

    private Scanner scanner = new Scanner(System.in);

    public String enterString() {
        System.out.println("Enter string:");
        return scanner.nextLine();
    }
}
