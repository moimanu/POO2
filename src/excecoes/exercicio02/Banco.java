package excecoes.exercicio02;

public class Banco {
    private Conta[] contas;

    public Banco(Conta[] contas) {
        this.contas = contas;
    }

    public void transferencia(int contaDe, int contaPara, double valor) throws CNEException, SIException {
        Conta origem = buscarConta(contaDe);
        Conta destino = buscarConta(contaPara);

        if (origem == null) {
            throw new CNEException("Conta de origem não existe!");
        }
        if (destino == null) {
            throw new CNEException("Conta de destino não existe!");
        }

        origem.debita(valor);
        destino.credita(valor);
    }

    private Conta buscarConta(int numero) {
        for (Conta conta : contas) {
            if (conta != null && conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public void balanco() {
        double total = 0;
        int limiteExcedido = 0;

        System.out.println("\nBalanço do Banco");
        for (Conta conta : contas) {
            if (conta != null) {
                System.out.println("Conta " + conta.getNumero() + " -> Saldo: " + conta.getSaldo());
                total += conta.getSaldo();
                if (conta.getSaldo() < 0) {
                    limiteExcedido++;
                }
            }
        }
        System.out.println("Total disponível: " + total);
        System.out.println("Contas em cheque especial: " + limiteExcedido);
    }
}
