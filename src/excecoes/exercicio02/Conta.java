package excecoes.exercicio02;

public class Conta {
    private int numero;
    private double saldo;
    private boolean clienteEspecial;
    private double limite;

    public Conta(int numero, double saldoInicial, boolean clienteEspecial, double limite) {
        this.numero = numero;
        this.saldo = saldoInicial;
        this.clienteEspecial = clienteEspecial;
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isClienteEspecial() {
        return clienteEspecial;
    }

    public void debita(double v) throws SIException {
        if (saldo - v < 0 && !clienteEspecial) {
            throw new SIException("Saldo insuficiente na conta " + numero);
        }
        if (saldo - v < -limite && clienteEspecial) {
            throw new SIException("Limite excedido na conta especial " + numero);
        }
        saldo -= v;
    }

    public void credita(double v) {
        saldo += v;
    }
}
