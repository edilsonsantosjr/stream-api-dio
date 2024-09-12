package org.example.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ProductOfNumbers {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> produto = numeros.stream().reduce((a, b) -> a * b);

        produto.ifPresentOrElse(
                n -> System.out.println("O produto dos números é: " + produto.get()),
                () -> System.out.println("Não há números na lista.")
        );
    }
}
