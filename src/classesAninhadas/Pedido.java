package classesAninhadas;

public class Pedido {

    private String id;

    public Pedido(String id) {
        this.id = id;
    }

    public class Item {

        private String nome;
        private int valor;

        public Item(String nome, int valor) {
            this.nome = nome;
            this.valor = valor;
        }

        public void exibirDetalhes() {
            System.out.println("ID do pedido: " + Pedido.this.id);
            System.out.println("Item: " + this.nome);
            System.out.println("Valor: " + this.valor + " reais");
        }
    }

    public static void main (String[] args) {
        Pedido pedido1 = new Pedido("r4h2l9");
        Pedido.Item item1 = pedido1.new Item("Hamburguer", 23);
        item1.exibirDetalhes();
    }
}
