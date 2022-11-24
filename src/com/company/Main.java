package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        System.out.println("enter your year of birth");
        boolean hasNextInt = userScanner.hasNextInt();
        if (hasNextInt) {
            int age = 2022 - userScanner.nextInt();
            userScanner.nextLine();
            System.out.println("enter your name");
            String name = userScanner.nextLine();
            if (age < 0 || age > 111) {
                System.out.println("invalid age");
            } else {
                System.out.println("your name is " + name + " and your age is " + age);
            }


        } else {
            System.out.println("unable to parse year of birth");
        }
        userScanner.close();
    }
}
