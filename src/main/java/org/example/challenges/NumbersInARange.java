package org.example.challenges;

import java.util.Arrays;
import java.util.List;

public class NumbersInARange {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosEmUmIntervalo = numeros.stream().filter(n -> n > 5 && n < 10).toList();

        System.out.println("Números em um intervalo de 5 e 10: " + numerosEmUmIntervalo);
    }
}
