package org.example.desafio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro número: ");
        int fisrtNumber = scanner.nextInt();
        System.out.println("Digite o valor do segundo número: ");
        int secondNumber = scanner.nextInt();
        int result = higherNumber(fisrtNumber,secondNumber);

        System.out.println("O maior valor entre "+fisrtNumber+" e "+secondNumber+" é "+ result);
    }
    public static int higherNumber(int fisrtNumber,int secondNumber){
        return Math.max(fisrtNumber, secondNumber);
    }
}
