package classesGenericas.pair;

public class ParametroDeTipo {

    //double middle = ArrayAlg.getMiddle(4.9, 1900, 0); <- Errado, os três precisam ser "double"
    double middle = ArrayAlg.<Double>getMiddle(4.9, 1900.0, 0.0);

}

class ArrayAlg {
    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }
}