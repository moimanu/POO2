package classesGenericas.listaGenericsParte2.exercicioQ3;

public class ExercicioQ3 {

    public static void printArray(String[] array, int lowSubscript, int rightSubscript) {
        if (lowSubscript < 0 || rightSubscript > array.length || lowSubscript >= rightSubscript) {
            throw new InvalidSubscriptException("Intervalo inválido: " + lowSubscript + " a " + rightSubscript);
        }

        for (int i = lowSubscript; i < rightSubscript; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carlos", "Diana"};
        ExercicioQ3.printArray(nomes, 1, 3);
    }
}
