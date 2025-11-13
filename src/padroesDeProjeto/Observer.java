package padroesDeProjeto;// Arquivo: BingoAuto.java
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

// Sujeito observado
interface SorteadorSubject {
    void adicionarObservador(CartelaObserver obs);
    void removerObservador(CartelaObserver obs);
    void notificarObservadores(int numero);
}

// Observador (quem observa)
interface CartelaObserver {
    void atualizar(int numero);
    boolean terminou();
}

// Sorteador (concreto)
class Sorteador implements SorteadorSubject, Runnable {
    private final List<CartelaObserver> observadores = new CopyOnWriteArrayList<>();
    private final List<Integer> numerosDisponiveis = new ArrayList<>();
    private boolean jogoAtivo = true;

    public Sorteador() {
        for (int i = 1; i <= 75; i++) {
            numerosDisponiveis.add(i);
        }
        Collections.shuffle(numerosDisponiveis);
    }

    public void adicionarObservador(CartelaObserver obs) {
        observadores.add(obs);
    }

    public void removerObservador(CartelaObserver obs) {
        observadores.remove(obs);
    }

    public void notificarObservadores(int numero) {
        for (CartelaObserver obs : observadores) {
            obs.atualizar(numero);
        }
    }

    public void run() {
        Random rand = new Random();

        while (jogoAtivo && !numerosDisponiveis.isEmpty()) {
            int numero = numerosDisponiveis.remove(0);
            System.out.println("\nSorteador: número sorteado -> " + numero);

            notificarObservadores(numero);

            // Se alguma cartela ganhou, para o jogo
            for (CartelaObserver obs : observadores) {
                if (obs.terminou()) {
                    jogoAtivo = false;
                    break;
                }
            }

            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nSorteador finalizado!");
    }
}

// Cartela (observador concreto)
class Cartela implements CartelaObserver, Runnable {
    private final int id;
    private final Set<Integer> numeros;
    private final Set<Integer> marcados = new HashSet<>();
    private boolean venceu = false;

    public Cartela(int id, int qtdNumeros) {
        this.id = id;
        this.numeros = gerarNumerosAleatorios(qtdNumeros);
    }

    private Set<Integer> gerarNumerosAleatorios(int qtd) {
        Random rand = new Random();
        Set<Integer> numeros = new HashSet<>();
        while (numeros.size() < qtd) {
            numeros.add(rand.nextInt(75) + 1);
        }
        return numeros;
    }

    public void atualizar(int numero) {
        if (numeros.contains(numero)) {
            marcados.add(numero);
            System.out.println("Cartela " + id + " marcou " + numero + "! (" + marcados.size() + "/" + numeros.size() + ")");
        }

        if (marcados.size() == numeros.size()) {
            venceu = true;
            System.out.println("\n🎉 CARTELA " + id + " FEZ BINGO! 🎉");
        }
    }

    public boolean terminou() {
        return venceu;
    }

    public void run() {
        while (!venceu) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}

public class Observer {
    public static void main(String[] args) {
        Sorteador sorteador = new Sorteador();

        // Cria algumas cartelas
        Cartela c1 = new Cartela(1, 5);
        Cartela c2 = new Cartela(2, 5);
        Cartela c3 = new Cartela(3, 5);

        // Adiciona cartelas como observadores
        sorteador.adicionarObservador(c1);
        sorteador.adicionarObservador(c2);
        sorteador.adicionarObservador(c3);

        // Inicia threads
        Thread tSorteador = new Thread(sorteador);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);

        t1.start();
        t2.start();
        t3.start();
        tSorteador.start();
    }
}
