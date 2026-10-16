package com.asys;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejecutando ejemplos...");

        for (int n = 1; n <= 5; n++) {
            System.out.println("n = " + n + " -> primo: " + Solucion.numeroPrimo(n));
        }
        System.out.println("Segundo mayor: " + Solucion.segundoNumeroMayor(new ArrayList<>(List.of(4, 9, 2))));
        System.out.println("Palíndromo: " + Solucion.cadenaPalindroma("Anita lava la tina"));
        System.out.println("Duplicados: " + Solucion.encontrarDuplicados(new ArrayList<>(List.of(1, 2, 2, 3, 3))));
        System.out.println("Balanceado: " + Solucion.parentesisBalanceados("{[()]}"));
    }
}
