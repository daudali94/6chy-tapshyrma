package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int shet = 1;
        for (int i = 1; i <= a; i++) {
            shet *=i;
            System.out.println(shet);
        }
    }
}
