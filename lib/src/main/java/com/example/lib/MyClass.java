package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("�п�J�@�Ӿ�ƨӤ��ѽ�]��:");
            n = scanner.nextInt();
            for (int i = 2; i <= n;i++) {
                if (n % i == 0) {
                    n = n / i;
                    System.out.print(i + " ");
                    i = 1;
                }

            }
            System.out.println();
        }
    }
}
