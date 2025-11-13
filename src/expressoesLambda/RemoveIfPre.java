package expressoesLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfPre {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("presente");
        palavras.add("amigo");
        palavras.add("preferido");
        palavras.add("gato");
        palavras.add("prever");

        Predicate<String> comecaComPre = s -> s.startsWith("pre");
        palavras.removeIf(comecaComPre.negate()); // Não consegui utilizar o operador '!'
        System.out.println(palavras);
    }
}
