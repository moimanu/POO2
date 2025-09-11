package excecoes.exercicio02;

import java.util.Random;

public class TestaBanco {
    public static void main(String[] args) {
        Conta[] contas = new Conta[5];
        contas[0] = new Conta(1, 1000, false, 0);
        contas[1] = new Conta(2, 500, true, 1000);
        contas[2] = new Conta(3, 200, false, 0);
        contas[3] = new Conta(4, 800, true, 500);
        contas[4] = new Conta(5, 50, false, 0);

        Banco banco = new Banco(contas);
        Random random = new Random();

        System.out.println("Iniciando testes de transferência aleatória:");

        for (int i = 0; i < 10; i++) {
            int idOrigem = random.nextInt(8);
            int idDestino = random.nextInt(8);

            while (idOrigem == idDestino) {
                idDestino = random.nextInt(8);
            }

            double valor = random.nextInt(500) + 10; 

            System.out.printf("---\nTeste " + (i + 1) + ": Transferindo R$" + valor + " da conta " + idOrigem + " para a conta " + idDestino  + "\n\n");

            try {
                banco.transferencia(idOrigem, idDestino, valor);
            } catch (CNEException | SIException e) {
                System.out.println("ERRO: " + e.getMessage()  + "\n\n");
            }
        }
        
        System.out.println("\n--- Balanço final ---");
        banco.balanco();
    }
}