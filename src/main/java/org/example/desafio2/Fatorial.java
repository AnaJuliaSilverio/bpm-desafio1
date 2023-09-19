package org.example.desafio2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int number = scanner.nextInt();
        int factorial = calculateFactorial(number);
        showMath(number,factorial);

    }
    public static int calculateFactorial(int number){
        return IntStream.range(1, number + 1)
                .reduce(1, (a, b) -> a * b);
    }
    public static void showMath(int number,int result){
        System.out.print(number+"! ");
        for (int i = number; i >=1; i--) {
            if (i==1) System.out.print(i);
            else System.out.print(i+"x");
        }
        System.out.println("="+result);

    }
}
