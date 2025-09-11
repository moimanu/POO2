package excecoes.exercicio02;

public class TestaBanco {
    public static void main(String[] args) {
        Conta[] contas = new Conta[5];
        contas[0] = new Conta(1, 1000, false, 0);
        contas[1] = new Conta(2, 500, true, 1000);
        contas[2] = new Conta(3, 200, false, 0);
        contas[3] = new Conta(4, 800, true, 500);
        contas[4] = new Conta(5, 50, false, 0);

        Banco banco = new Banco(contas);

        try {
            banco.transferencia(1, 2, 200);
            banco.transferencia(2, 3, 700);
            banco.transferencia(3, 4, 100);
            banco.transferencia(4, 5, 300);
            banco.transferencia(5, 1, 20);
            banco.transferencia(2, 1, 50);
            banco.transferencia(4, 2, 400);
            banco.transferencia(1, 5, 100);
            banco.transferencia(5, 3, 10);
            banco.transferencia(3, 2, 20);
        } catch (CNEException | SIException e) {
            System.out.println("Erro na transferência: " + e.getMessage());
        }

        banco.balanco();
    }
}
