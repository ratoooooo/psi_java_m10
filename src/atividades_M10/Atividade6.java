package atividades_M10;

import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {
        ContaCorrente contCorre = new ContaCorrente();
        ContaPoupanca contPoup = new ContaPoupanca();
        double definirSaldo, valor;
        Scanner ler = new Scanner(System.in);
        int op, conta;

        do {
            menu1();
            conta = ler.nextInt();

            switch (conta) {
                case 1:
                	menuConta(contCorre);
                	break;
                case 2:
                    menuConta(contPoup);
                    break;

                default:
                    System.out.println("Escolha inválida. Tente novamente.");
                    break;
            }
        } while (conta != 0);
    }

    public static void menuConta(ContaGeral conta) {
        int op;
        double valor;
        Scanner ler = new Scanner(System.in);

        do {
            menu2();
            op = ler.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Qual valor deseja depositar");
                    valor = ler.nextDouble();
                    conta.deposite(valor);
                    break;

                case 2:
                    System.out.println("Qual valor deseja retirar");
                    valor = ler.nextDouble();
                    conta.levante(valor);
                    break;

                case 3:
                    System.out.println(conta.toString());
                    break;

                default:
                    break;
            }
        } while (op != 0);
    }

    public static void menu1() {
        System.out.println("Conta a gerir");
        System.out.println("1-Conta Corrente");
        System.out.println("2-Conta Poupança");
    }

    public static void menu2() {
        System.out.println("Selecione uma opção");
        System.out.println("1-Depositar Dinheiro");
        System.out.println("2-Levantar Dinheiro");
        System.out.println("3-Verificar Saldo");
        System.out.println("0-Sair");
    }
}
