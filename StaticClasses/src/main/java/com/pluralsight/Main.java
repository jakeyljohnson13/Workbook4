package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String name = s.nextLine();
        String[] parts = name.split(" ");
        switch (parts.length){
            case 2:
                System.out.println(NameFormatter.format(parts[0],parts[1]));
                break;
            case 5:
                System.out.println(NameFormatter.format(parts[0],parts[1],parts[2],parts[3],parts[4]));
                break;
            default:
                System.out.println(NameFormatter.format(name));
        }
    }
}