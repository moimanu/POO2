package enums.operacao;

public class TestaOperacao {
    public static void main(String[] args) throws Exception {
        double x = calcular(Operacao.SUB, 2, 2);
        System.out.println("x = "+x);
    }

    public static double calcular(Operacao op, double... numeros) throws Exception {
        double n1 = numeros [0];
        double n2;

        double resultado = 0;

        for(int i = 1; i < numeros.length; i++) {
            n2 = numeros[i];
            resultado = op.executar(n1, n2);
            n1 = resultado;
        }
        return resultado;
    }
}
