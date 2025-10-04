package classesGenericas.listaGenericsParte2.exercicioQ2;

public class ExercicioQ2 {

    public static <T> void printArray(T[] array, int lowSubscript, int rightSubscript) {
        if (lowSubscript < 0 || rightSubscript > array.length || lowSubscript >= rightSubscript) {
            throw new InvalidSubscriptException("Intervalo inválido: " + lowSubscript + " a " + rightSubscript);
        }

        for (int i = lowSubscript; i < rightSubscript; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carlos", "Diana"};
        ExercicioQ2.printArray(nomes, 1, 3);
    }
}
