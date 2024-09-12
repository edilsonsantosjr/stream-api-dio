package org.example.challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OddAndEven {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> parImpar = numeros.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> pares = parImpar.get(true);
        List<Integer> impar = parImpar.get(false);

        System.out.println("Lista de números pares: " + pares);
        System.out.println("Lista de números ímpares: " + impar);

    }
}
