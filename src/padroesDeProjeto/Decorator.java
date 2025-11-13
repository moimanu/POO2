package padroesDeProjeto;

interface Prato {
    String getDescricao();
    double getPreco();
    int getTempoPreparo();
}

class Sanduiche implements Prato {
    public String getDescricao() {
        return "Sanduíche básico";
    }

    public double getPreco() {
        return 10.0;
    }

    public int getTempoPreparo() {
        return 5; // minutos
    }
}

class Refeicao implements Prato {
    public String getDescricao() {
        return "Refeição básica";
    }

    public double getPreco() {
        return 15.0;
    }

    public int getTempoPreparo() {
        return 10;
    }
}

abstract class AdicionalDecorator implements Prato {
    protected Prato prato;

    public AdicionalDecorator(Prato prato) {
        this.prato = prato;
    }

    public String getDescricao() {
        return prato.getDescricao();
    }

    public double getPreco() {
        return prato.getPreco();
    }

    public int getTempoPreparo() {
        return prato.getTempoPreparo();
    }
}

class Queijo extends AdicionalDecorator {
    public Queijo(Prato prato) {
        super(prato);
    }

    public String getDescricao() {
        return prato.getDescricao() + ", Queijo";
    }

    public double getPreco() {
        return prato.getPreco() + 2.5;
    }

    public int getTempoPreparo() {
        return prato.getTempoPreparo() + 1;
    }
}

class Bacon extends AdicionalDecorator {
    public Bacon(Prato prato) {
        super(prato);
    }

    public String getDescricao() {
        return prato.getDescricao() + ", Bacon";
    }

    public double getPreco() {
        return prato.getPreco() + 3.0;
    }

    public int getTempoPreparo() {
        return prato.getTempoPreparo() + 2;
    }
}

class MolhoEspecial extends AdicionalDecorator {
    public MolhoEspecial(Prato prato) {
        super(prato);
    }

    public String getDescricao() {
        return prato.getDescricao() + ", Molho Especial";
    }

    public double getPreco() {
        return prato.getPreco() + 1.5;
    }

    public int getTempoPreparo() {
        return prato.getTempoPreparo() + 1;
    }
}

class FrangoGrelhado extends AdicionalDecorator {
    public FrangoGrelhado(Prato prato) {
        super(prato);
    }

    public String getDescricao() {
        return prato.getDescricao() + ", Frango Grelhado";
    }

    public double getPreco() {
        return prato.getPreco() + 5.0;
    }

    public int getTempoPreparo() {
        return prato.getTempoPreparo() + 7;
    }
}

public class Decorator {
    public static void main(String[] args) {
        Prato pedido1 = new Sanduiche();
        pedido1 = new Queijo(pedido1);
        pedido1 = new Bacon(pedido1);
        pedido1 = new MolhoEspecial(pedido1);

        System.out.println("Pedido 1: " + pedido1.getDescricao());
        System.out.println("Preço total: R$ " + pedido1.getPreco());
        System.out.println("Tempo de preparo: " + pedido1.getTempoPreparo() + " min\n");

        Prato pedido2 = new Refeicao();
        pedido2 = new FrangoGrelhado(pedido2);
        pedido2 = new MolhoEspecial(pedido2);

        System.out.println("Pedido 2: " + pedido2.getDescricao());
        System.out.println("Preço total: R$ " + pedido2.getPreco());
        System.out.println("Tempo de preparo: " + pedido2.getTempoPreparo() + " min");
    }
}
