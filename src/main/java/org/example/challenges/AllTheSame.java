package org.example.challenges;

import java.util.Arrays;
import java.util.List;

public class AllTheSame {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean iguais = numeros.stream().findFirst().map(p -> numeros.stream().allMatch(n -> n.equals(p))).orElse(true);

        System.out.println("Todos os itens da lista são iguais? " + iguais);
    }
}
