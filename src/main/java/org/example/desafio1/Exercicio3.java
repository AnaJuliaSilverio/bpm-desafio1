package org.example.desafio1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        char letter= scanner.next().charAt(0);
        String result = vowelOrConsonant(Character.toString(letter));
        System.out.println("A letra  "+letter+" é uma "+result);

    }
    public static String vowelOrConsonant(String letter){
        String regex = "[aeiouAEIOU]";
        if (letter.matches(regex))return "Vogal";
        else return "Consoante";

    }
}
