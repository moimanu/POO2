package classesGenericas.listaGenericsParte3.questao13;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car(200));
        cars.add(new Car(2100));
        cars.add(new Car(300));
        cars.add(new Car(4400));

        Collections.sort(cars);

        for(Car car : cars) {
            System.out.println(car.toString());
        }
    }

}
