package enums;

public enum TipoDePonto {
    VITORIA(100), ABATE(20), ITEM_ESPECIAL(5);

    private int pontuacao;

    private TipoDePonto(int pontuacao){
        this.pontuacao = pontuacao;
    }

    public double getPontuacao() {
        return this.pontuacao;
    }
}

class Jogador {
    private double totalDePontos;

    public void adicionarPonto(TipoDePonto... p) {
        double soma = 0;
        for(TipoDePonto ponto : p){
            soma+= ponto.getPontuacao();
        }
        this.totalDePontos += soma;
    }
}