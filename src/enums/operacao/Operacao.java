package enums.operacao;

public enum Operacao { ADD('+'), SUB('-'), MUL('x'), DIV('/');
    char simboloOp;

    private Operacao (char simbolo) {
        this.simboloOp = simbolo;
    }

    public double executar (double n1, double n2) throws Exception {
        switch ((this.simboloOp)){
            case '+':
                return (n1 + n2);
            case '-':
                return (n1 - n2);
            case 'x':
                return (n1 * n2);
            case '/':
                if (n2 != 0)
                    return (n1 / n2);
                else
                    throw new Exception("Divisão por zero.");
            default:
                throw new Exception("Opção inválida");
        }
    }
}
