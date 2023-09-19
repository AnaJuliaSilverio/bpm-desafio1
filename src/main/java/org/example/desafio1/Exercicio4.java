package org.example.desafio1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite uma nota: ");
            double grade = scanner.nextDouble();
            checkGrade(grade);
            String result = studentResult(grade);
            System.out.println("O aluno está :"+result);
        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }


    }
    public static String studentResult(double grade){
        if (grade<6) return "Reprovado";
        else if (grade>6 && grade<8) return "Em recuperação";
        else return "Aprovado";
    }
    public static void checkGrade(double grade){
        if (grade<0 || grade>10) throw new IllegalArgumentException("A nota deve estar entre 0 e 10");
    }
}
