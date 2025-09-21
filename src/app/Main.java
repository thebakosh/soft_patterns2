package app;

import factories.*;
import products.laptop.*;
import products.phone.*;


public class Main {
    public static void main(String[] args) {
        TechFactory appleFactory = new AppleFactory();
        Phone iphone = appleFactory.createPhone();
        Laptop macbook = appleFactory.createLaptop();
        iphone.create();
        macbook.create();

        TechFactory samsungFactory = new SamsungFactory();
        Phone samsung = samsungFactory.createPhone();
        Laptop galaxyBook = samsungFactory.createLaptop();
        samsung.create();
        galaxyBook.create();
    }
}