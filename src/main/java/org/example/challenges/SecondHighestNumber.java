package org.example.challenges;

import com.sun.source.tree.UsesTree;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class SecondHighestNumber {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaiorNumero = numeros.stream().sorted((a, b) -> b - a).skip(1).findFirst();

        segundoMaiorNumero.ifPresentOrElse(n -> System.out.println("O segundo maior número é: " + n), () -> System.out.println("Não existe segundo maior número."));
    }
}
