package org.example.challenges;

import java.util.Arrays;
import java.util.List;

public class SumAllNumbers {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somarTodos = numeros.stream().mapToInt(Integer::intValue).sum();
        System.out.println("A soma de todos os números é: " + somarTodos);
    }
}
