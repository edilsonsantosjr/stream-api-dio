package org.example.challenges;

import java.util.Arrays;
import java.util.List;

public class DistinctNumbers {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numerosDistintos = numeros.stream().distinct().count() == numeros.size();

        System.out.println("Todos os números são distintos? " + numerosDistintos);
    }
}
