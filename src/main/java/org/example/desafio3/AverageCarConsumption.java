package org.example.desafio3;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class AverageCarConsumption {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            BigDecimal fuel;
            BigDecimal km;

            System.out.println("Digite a distância total percorrida:");
            km = new BigDecimal(scanner.next());
            verifyKm(km);
            System.out.println("Digite o total de combustível consumido:");
            fuel = new BigDecimal(scanner.next());
            verifyFuel(fuel);
            BigDecimal avg = avgConsumption(km,fuel);

            System.out.println(avg + " km/l");
        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
    }

    public static BigDecimal avgConsumption(BigDecimal km, BigDecimal fuel){
        return km.divide(fuel, MathContext.DECIMAL32).setScale(3, BigDecimal.ROUND_HALF_EVEN);
    }

    public static void verifyFuel(BigDecimal value){
        if (value.scale() > 1) {
            throw new IllegalArgumentException("O valor o total de combustível consumido deve possuir apenas uma casa decimal.");
        }
    }
    public static void verifyKm(BigDecimal value) {
        if (value.scale() > 0) {
            throw new IllegalArgumentException("O km não deve possuir casa decimal.");
        }
    }
}
