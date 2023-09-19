package org.example.desafio1;

import java.util.ArrayList;
import java.util.Comparator;

public class Exercicio5 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(0);
        numbers.add(4);
        ArrayList<Integer> sortingNumbers = sortingNumbers(numbers);
        System.out.println("A lista ordenada de forma decrescente é "+ sortingNumbers);
    }
    public static ArrayList<Integer> sortingNumbers(ArrayList<Integer> numbers){
        numbers.sort(Comparator.reverseOrder());
        return numbers;
    }
}
