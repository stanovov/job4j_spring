package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        Store store = context.getBean(Store.class);
        store.add("Petr Arsentev");
        store.add("Ivan Ivanov");
        System.out.println("The message specially for exercise '3. Dockerfile + maven [#505041]'");
        System.out.println("Contents of the first container:");
        store.getAll().forEach(System.out::println);
        Store another = context.getBean(Store.class);
        System.out.println("Contents of the second container:");
        another.getAll().forEach(System.out::println);
    }
}
