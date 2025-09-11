package excecoes.exercicio01;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String id;

    public Pessoa(String nome, int idade, String id) throws Exception {
        setNome(nome);
        setIdade(idade);
        setID(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome == null || nome.isBlank()) {
            throw new Exception("Nome inválido.");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws Exception {
        if (idade < 0) {
            throw new Exception("Idade inválida.");
        }
        this.idade = idade;
    }

    public String getID() {
        return id;
    }

    protected void definirID(String id) {
        this.id = id;
    }

    protected abstract void setID(String id) throws InvalidIDException;
}
