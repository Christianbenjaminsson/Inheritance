package com.example.inheritance;

public class Inheritance {
    public static void main(String[] args) {

        Contact contact = new Contact("Sara");
        Adress adress = new Adress("Johan", "Stockholm");

        contact.writeName();
        System.out.println();

        adress.writeContactName();
        adress.getCity();
        adress.writeContactAndCity();

    }
}
