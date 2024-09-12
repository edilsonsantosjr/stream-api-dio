package org.example.challenges;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class NumericalOrder {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosCrescente = numeros.stream().sorted().toList();
        System.out.println("Lista de números em ordem crescente:");
        System.out.println(numerosCrescente);

    }
}
