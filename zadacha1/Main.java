package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int fact = 1;
        for (int j = 0; j <= n; j++){    //сумма n-ое треугольного числа
            sum = sum + j;
        }
        for (int i = 1; i <= n; i++){   //Factorial
            fact = fact * i;
        }
        System.out.println("Сумма треугольного числа: " + sum);
        System.out.println("Факториал числа n: " + fact);
    }
}
