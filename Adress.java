package com.example.inheritance;

public class Adress extends Contact {

    public String city;

    public Adress(String name, String city) {
        super(name);
        this.city = city;
    }

    public void getCity() {
        System.out.println("Your city is " +city);
    }

    public void writeContactName() {
        System.out.println("Contact name is " + getName());
    }

    public void writeContactAndCity() {
        System.out.println("Contact name is " +name+ " and lives in " +city);
    }

}
