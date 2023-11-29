package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("put name");
        String name = scan.next();
        System.out.println("put surname");
        String surname = scan.next();
        System.out.println("put favorite color");
        String favoriteColor = scan.next();
        System.out.println("put your day of birth");
        int day = scan.nextInt();
        System.out.println("put your month of birth");
        int month = scan.nextInt();
        System.out.println("put your year of birth");
        int year = scan.nextInt();
        int sum = day + month + year;
        System.out.println("your password is"+" "+name+"-"+ surname+"-"+favoriteColor+"-"+sum);








        scan.close();

    }
}
