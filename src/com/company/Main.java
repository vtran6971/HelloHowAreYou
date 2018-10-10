package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("How old are you "+name);
        int age = input.nextInt();
        System.out.println("You're "+age);
    }
}
