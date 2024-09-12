package org.example.challenges;

import java.util.Arrays;
import java.util.List;

public class SumOfDivisibles {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer somaDivisiveis = numeros.stream().filter(n -> n % 3 == 0 && n % 5 == 0).mapToInt(Integer::intValue).sum();

        if(somaDivisiveis == 0){
            System.out.println("Não há números divisíveis tanto por 3 quanto por 5.");
        } else {
            System.out.println("A soma dos números divisíveis tanto por 3 quanto por 5 é: " + somaDivisiveis);
        }
    }
}
