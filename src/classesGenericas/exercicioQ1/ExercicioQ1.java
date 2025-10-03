package classesGenericas.exercicioQ1;

public class ExercicioQ1 {

    public static <T extends Comparable<T>> void selectionSort(T[] entrada) {
        int tamanho = entrada.length;

        for (int i = 0; i < tamanho - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < tamanho; j++) {
                if (entrada[j].compareTo(entrada[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            T temp = entrada[i];
            entrada[i] = entrada[minIndex];
            entrada[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] nums = {5, 2, 9, 1, 3};
        ExercicioQ1.selectionSort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
