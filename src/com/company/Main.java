package com.company;

import com.company.Human;

public class Main {
    //java entry
    public static void main(String[] args) {
	// write your code here
        Human def= new Human();
        System.out.println(def.getName());
        System.out.println(def.getHeight());

        Human bob = new Human("bob",120);
        System.out.println(bob.getName());
        System.out.println(bob.getHeight());

        bob.rename("jack");
        Human jack = bob; // bob -> Human("jack",120), jack -> Human("jack",120)
        System.out.println(jack);

        int newHeight = jack.workout();
        System.out.println(newHeight);

        System.out.println(Human.getNumber());
    }
}
