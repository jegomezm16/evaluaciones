package com.asys;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solucion {

    // Ejercicio 1: número primo
    public static boolean numeroPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int divisor = 2; (long) divisor * divisor <= numero; divisor++) {
            if (numero % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    // Ejercicio 2: segundo número mayor (distinto del mayor)
    public static int segundoNumeroMayor(ArrayList<Integer> lista) {
        if (lista == null || lista.size() < 2) {
            throw new IllegalArgumentException("La lista no contiene dos números distintos");
        }
        Integer primero = null;
        Integer segundo = null;
        for (int valor : lista) {
            if (primero == null || valor > primero) {
                if (primero != null) {
                    segundo = primero;
                }
                primero = valor;
            } else if (valor < primero && (segundo == null || valor > segundo)) {
                segundo = valor;
            }
        }
        if (segundo == null) {
            throw new IllegalArgumentException("No existe un segundo número mayor distinto");
        }
        return segundo;
    }

    // Ejercicio 3: cadena palíndroma (ignora mayúsculas, espacios y puntuación)
    public static boolean cadenaPalindroma(String cadena) {
        if (cadena == null) {
            return false;
        }
        String texto = cadena.toLowerCase().replaceAll("[\\p{P}\\s]", "");
        int inicio = 0;
        int fin = texto.length() - 1;
        while (inicio < fin) {
            if (texto.charAt(inicio++) != texto.charAt(fin--)) {
                return false;
            }
        }
        return true;
    }

    // Ejercicio 4: encontrar duplicados (en orden de primera aparición)
    public static ArrayList<Integer> encontrarDuplicados(ArrayList<Integer> lista) {
        Map<Integer, Integer> conteo = new LinkedHashMap<>();
        for (Integer valor : lista) {
            conteo.merge(valor, 1, Integer::sum);
        }
        ArrayList<Integer> repetidos = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entrada : conteo.entrySet()) {
            if (entrada.getValue() > 1) {
                repetidos.add(entrada.getKey());
            }
        }
        return repetidos;
    }

    // Ejercicio 5: paréntesis, corchetes y llaves balanceados
    public static boolean parentesisBalanceados(String texto) {
        if (texto == null) {
            return false;
        }
        Map<Character, Character> pares = Map.of(')', '(', ']', '[', '}', '{');
        Deque<Character> pila = new ArrayDeque<>();
        for (char c : texto.toCharArray()) {
            if (pares.containsValue(c)) {
                pila.push(c);
            } else if (pares.containsKey(c)) {
                if (pila.isEmpty() || !pila.pop().equals(pares.get(c))) {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }
}
