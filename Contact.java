package com.example.inheritance;

public class Contact {

    public String name;

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void writeName() {
        System.out.println("Contact name is " +name);
    }

    protected void name() {
    }
}
