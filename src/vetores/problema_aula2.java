package vetores;

import java.util.Scanner;

public class problema_aula2 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String[] convidados = new String[0];

        while (true) {
            System.out.println("\nMenu Cadastro");
            System.out.println("1 - Adicionar convidado");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = t.nextInt();
            t.nextLine(); // Scanner residual

            if (opcao == 0) {
                break;
            } else if (opcao == 1) {
                System.out.print("Digite o nome do convidado: ");
                String nome = t.nextLine();

                // Criando e copiando para novo vetor
                String[] novoVetor = new String[convidados.length + 1];
                for (int i = 0; i < convidados.length; i++) {
                    novoVetor[i] = convidados[i];
                }

                novoVetor[novoVetor.length - 1] = nome;
                convidados = novoVetor;
                System.out.println("Convidado adicionado!");

            } else {
                System.out.println("Opção inválida!");
            }
        }

        while (true) {
            System.out.println("\nMenu Pesquisa");
            System.out.println("1 - Pesquisar convidado");
            System.out.println("0 - Sair da pesquisa");
            System.out.print("Escolha uma opção: ");
            int opcao = t.nextInt();
            t.nextLine(); // Scanner residual

            if (opcao == 0) {
                break;
            } else if (opcao == 1) {
                System.out.print("Digite o nome ou parte do nome para pesquisar: ");
                String pesquisa = t.nextLine().toLowerCase();

                boolean encontrado = false;
                for (String convidado : convidados) {
                    if (convidado.toLowerCase().contains(pesquisa)) {
                        System.out.println("Convidado: " + convidado);
                        encontrado = true;
                    }
                }

                if (!encontrado) {
                    System.out.println("Inexistente");
                }
            } else {
                System.out.println("Opção inválida!");
            }
        }

        System.out.println("\nPrograma finalizado.");
        t.close();
    }
}
