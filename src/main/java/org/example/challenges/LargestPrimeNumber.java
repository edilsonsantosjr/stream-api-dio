package org.example.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LargestPrimeNumber {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorPrimo = numeros.stream().filter((n) -> {
            if(n <= 1) return false;
            if(n == 2) return true;
            if(n % 2 == 0) return false;
            for(int i = 3; 3 <= Math.sqrt(n); i += 2){
                if(n % i == 0) return false;
            }
            return true;
        }).sorted((a, b) -> b - a).findFirst();

        maiorPrimo.ifPresentOrElse(
                n -> System.out.println("O maior número primo é: " + n),
                () -> System.out.println("Não há números primos na lista.")
        );
    }
}
