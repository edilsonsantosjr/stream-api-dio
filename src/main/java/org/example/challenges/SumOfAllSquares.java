package org.example.challenges;

import java.util.Arrays;
import java.util.List;

public class SumOfAllSquares {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosQuadrados = numeros.stream().map(n -> n * n).mapToInt(Integer::intValue).sum();

        System.out.println("A todos de todos os quadrados é: " + somaDosQuadrados);
    }
}
