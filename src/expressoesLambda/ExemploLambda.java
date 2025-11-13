package expressoesLambda;

import java.util.Arrays;
import java.util.List;

public class ExemploLambda {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("maçã", "banana", "abacaxi", "pera");
        fruits.forEach(fruit -> System.out.println(fruit));
    }
}

/*
    R.: O exemplo acima funciona, pois fruit se trata de uma string, que é passada pelo parâmetro da expressão lambda.
    O forEach utiliza o .accept() com parâmetro genérico da classe Consumer, que se trata de uma classe funcional.
 */