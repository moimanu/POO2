package classesAninhadas;

import java.util.Scanner;

public class MeasurementUtility {

    public static class Conversion {

        public double meterstoCentimeters(double x) {
            return x * 100;
        }

        public double centimeterstoMeters(double x) {
            return x/100;
        }

        public double millimeterstoNanometers(double x) {
            return x * 1000000;
        }
    }

    public static void main (String[] args) {
        Scanner t = new Scanner(System.in);

        Conversion conversor = new Conversion();

        System.out.println("Converter:");
        System.out.println("1 - m para cm");
        System.out.println("2 - cm para m");
        System.out.println("3 - mm para nm");
        int escolha = t.nextInt();

        System.out.print("Digite seu numero: ");
        double num = t.nextDouble();

        switch (escolha) {
            case 1:
                System.out.println(conversor.centimeterstoMeters(num));
                break;
            case 2:
                System.out.println(conversor.meterstoCentimeters(num));
                break;
            case 3:
                System.out.println(conversor.millimeterstoNanometers(num));
                break;
        }
    }
}
