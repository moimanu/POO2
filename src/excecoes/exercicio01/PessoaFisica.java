package excecoes.exercicio01;

public class PessoaFisica extends Pessoa {

    public PessoaFisica(String nome, int idade, String id) throws Exception {
        super(nome, idade, id);
    }

    @Override
    protected void setID(String id) throws InvalidIDException {
        if (id == null || !id.matches("\\d{11}")) {
            throw new InvalidIDException("CPF inválido. Deve conter exatamente 11 dígitos numéricos.");
        }
        definirID(id);
    }
}
