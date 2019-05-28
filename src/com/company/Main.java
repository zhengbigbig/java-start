package com.company;

import com.company.Human;

public class Main {
    //java entry
    public static void main(String[] args) {
	// write your code here
        Human def= new Human();
        System.out.println(def.name);
        System.out.println(def.height);

        Human bob = new Human("bob",120);
        System.out.println(bob.name);
        System.out.println(bob.height);

        bob.rename("jack");
        Human jack = bob; // bob -> Human("jack",120), jack -> Human("jack",120)
        System.out.println(jack);

        int newHeight = jack.workout();
        System.out.println(newHeight);
    }
}
