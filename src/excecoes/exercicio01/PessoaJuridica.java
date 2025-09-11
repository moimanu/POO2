package excecoes.exercicio01;

public class PessoaJuridica extends Pessoa {

    public PessoaJuridica(String nome, int idade, String id) throws Exception {
        super(nome, idade, id);
    }

    @Override
    protected void setID(String id) throws InvalidIDException {
        if (id == null || !id.matches("\\d{14}")) {
            throw new InvalidIDException("CNPJ inválido. Deve conter exatamente 14 dígitos numéricos.");
        }
        definirID(id);
    }
}
