package br.com.projetocosnnectcorrecao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MatheusA
 */
public class Cosnnect {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList email = new ArrayList();
        ArrayList senha = new ArrayList();
        ArrayList usuario = new ArrayList();

        Usuario u = new Usuario();
        Evento e = new Evento();
        GestoraDeEvento g = new GestoraDeEvento();
        EnderecoEvento ee = new EnderecoEvento();
        Ingressos i = new Ingressos();

        System.out.println("------------------------------");
        System.out.println("-----BEM VINDO A COSNNECT-----");
        System.out.println("------------------------------");

        System.out.println("Voce ja possui cadastro? (SIM)(NAO):\n");
        String entrar = input.nextLine();

        try {
            if (entrar.toUpperCase().equals("SIM")) {
                System.out.println("Digite seu usuario:\n");
                String entrarUser = input.nextLine();
                u.setNomeUser(entrarUser);
                System.out.println("Digite seu email:\n");
                String entrarEmail = input.nextLine();
                u.setEmail(entrarEmail);
                System.out.println("Digite sua senha:\n");
                String entrarSenha = input.nextLine();
                entrarSenha.replaceAll("[^ ]", "*");

            } else if (entrar.toUpperCase().equals("NAO")) {
                System.out.println("Digite seu email para cadastrar:\n");
                String cadastrarEmail = input.nextLine();
                email.add(cadastrarEmail);
                System.out.println("Digite sua senha:\n");
                String cadastrarSenha = input.nextLine();
                cadastrarSenha.replaceAll("[^ ]", "*");
                senha.add(cadastrarSenha);
                System.out.println("Como voce se chama?:\n");
                String nomeUser = input.nextLine();
                u.setNomeUser(nomeUser);
            }

        } catch (Exception ex) {
            System.err.println("Usuario nao cadastrado, tente novamente!");
        }

        System.out.println("Ola, " + u.getNomeUser() + ". Bem vindo!");
        System.out.println("Estes sao os eventos disponiveis de acordo suas preferencias:\n"
                + "1- Anime Gakuen: Palhoca\n"
                + "2- AnimeFest: Sao Jose\n"
                + "3- ComicCon: Sao Jose");

        try {
            System.out.println("Qual evento lhe interessa? Apenas numeros:\n");
            Integer escolhaEvento = input.nextInt();
            switch (escolhaEvento) {
                case 1:
                    System.out.println("Voce selecionou Anime Gakuen\n"
                            + "Estes sao seus valores:\n"
                            + "1- Entrada Inteira: R$32,00. Disponiveis: " + i.getQuantidade() + "\n"
                            + "2- Entrada Meia: R$16,00. Disponiveis: " + i.getQuantidade() + "\n"
                            + "3- Entrada Diamante: R$100,00. Disponiveis: " + i.getQuantidade());
                    Integer escolhaEntrada1 = input.nextInt();
                    break;
                case 2:
                    System.out.println("Voce selecionou AnimeFest\n"
                            + "Estes sao seus valores:\n"
                            + "1- Entrada Inteira: R$32,00. Disponiveis: " + i.getQuantidade() + "\n"
                            + "2- Entrada Meia: R$16,00. Disponiveis: " + i.getQuantidade() + "\n"
                            + "3- Entrada Diamante: R$100,00. Disponiveis: " + i.getQuantidade());
                    Integer escolhaEntrada2 = input.nextInt();
                    break;
                case 3:
                    System.out.println("Voce selecionou ComicCon\n"
                            + "Estes sao seus valores:\n"
                            + "1- Entrada Inteira: R$32,00. Disponiveis: " + i.getQuantidade() + "\n"
                            + "2- Entrada Meia: R$16,00. Disponiveis: " + i.getQuantidade() + "\n"
                            + "3- Entrada Diamante: R$100,00. Disponiveis: " + i.getQuantidade());
                    Integer escolhaEntrada3 = input.nextInt();
                    break;
            }
        } catch (Exception ex) {
            System.err.println("Opcao Invalida. Tente Novamente!");
        }

        System.out.println("Quantos ingressos voce deseja?:\n");
        Integer qntIngressos = input.nextInt();
        //i.setQuantidade(qntIngressos);
        System.out.println(qntIngressos + " ingressos foram enviados para seu email: " + u.getEmail());

    }
}
