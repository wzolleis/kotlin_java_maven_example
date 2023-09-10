package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        KotlinService service = new KotlinService();
        System.out.println("call kotlin from java -> " + service.sayHelloTo("Tim"));
    }
}