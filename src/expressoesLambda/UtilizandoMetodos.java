package expressoesLambda;

import java.util.*;
import java.util.function.*;

public class UtilizandoMetodos {

    // Helper method that uses Predicate
    static List<String> filterWords(List<String> words, Predicate<String> predicate) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (predicate.test(word)) {
                result.add(word);
            }
        }
        return result;
    }

    // Helper method that uses Consumer
    static void processWords(List<String> words, Consumer<String> processor) {
        for (String word : words) {
            processor.accept(word);
        }
    }

    // Helper method for numbers
    static List<Integer> filterNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                result.add(number);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<String> words = Arrays.asList("maçã", "banana", "pera", "melancia", "abacaxi");
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // filtra palavras que começam com 'm'
        List<String> comecaComM = filterWords(words, w -> w.startsWith("m"));
        System.out.println("Palavras que começam com 'm': " + comecaComM);

        // imprime todas as palavras em letras maiúsculas
        System.out.println("\nPalavras em maiúsculas:");
        processWords(words, w -> System.out.println(w.toUpperCase()));

        // filtra apenas números pares
        List<Integer> pares = filterNumbers(numeros, n -> n % 2 == 0);
        System.out.println("\nNúmeros pares: " + pares);
    }
}
