package excecoes.exercicio01;

public class TestaPessoa {
    public static void main(String[] args) {
        try {
            PessoaFisica pessoaFisica = new PessoaFisica("João", 25, "12345678901");
            System.out.println("Pessoa Física criada: " + pessoaFisica.getNome() + ", CPF: " + pessoaFisica.getID());

            PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa X", 10, "12345678000199");
            System.out.println("Pessoa Jurídica criada: " + pessoaJuridica.getNome() + ", CNPJ: " + pessoaJuridica.getID());

            PessoaFisica pfInvalida = new PessoaFisica("Maria", 30, "abc123");
            System.out.println("Pessoa Física criada: " + pfInvalida.getNome());

        } catch (InvalidIDException e) {
            System.out.println("Erro de ID: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
