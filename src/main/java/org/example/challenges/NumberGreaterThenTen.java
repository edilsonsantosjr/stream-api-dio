package org.example.challenges;

import java.util.Arrays;
import java.util.List;

public class NumberGreaterThenTen {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean maiorQueDez = numeros.stream().allMatch(n -> n > 10);

        System.out.println("Existe algum número maior que dez? " + maiorQueDez);
    }
}
