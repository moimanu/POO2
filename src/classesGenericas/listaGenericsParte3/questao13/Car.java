package classesGenericas.listaGenericsParte3.questao13;

public class Car implements Comparable<Car> {

    private int valor;

    @Override
    public String toString() {
        return "Car{" +
                "valor=" + valor +
                '}';
    }

    public Car (int valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(Car o) {
        return (this.valor - o.valor);
    }
}

