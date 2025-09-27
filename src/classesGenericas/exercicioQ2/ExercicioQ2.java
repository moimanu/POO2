package classesGenericas.exercicioQ2;

import java.util.ArrayList;

public class ExercicioQ2 <T> {

    private ArrayList<T> lista = new ArrayList<T>();

    public void printArray (int lowSubscript, int rightSubscript) throws Exception {

        for (int i = lowSubscript; i < rightSubscript; i++) {
            System.out.println(this.lista.get(i));
        }

    }

}
