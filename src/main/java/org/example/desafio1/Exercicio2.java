package org.example.desafio1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int number = scanner.nextInt();
        String result = evenOrOdd(number);
        System.out.println("O valor "+number+" é "+result);

    }
    public static String evenOrOdd(int number){
        if (number%2==0)return "Par";
        else return "Impar";

    }
}
