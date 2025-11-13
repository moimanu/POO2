package expressoesLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfNull {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add(null);
        palavras.add("presente");
        palavras.add(null);
        palavras.add("preferido");

        Predicate<String> nulo = s -> s == null;
        palavras.removeIf(nulo);
        System.out.println(palavras);
    }
}
