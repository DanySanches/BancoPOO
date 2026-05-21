package application;

import entities.Cliente;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Cliente cliente = null;

        System.out.println("Digite o número da Conta: ");
        int conta = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nome = sc.nextLine();

        char r = ' ';

        while (r != 's' && r != 'n') {

            System.out.println("Deseja realizar o depósito inicial(s/n)? ");
            String respota = sc.next();
            r = respota.toLowerCase().charAt(0);

            if (r == 's') {
                System.out.println("Qual valor você deseja depositar: ");
                double valorInicial = sc.nextDouble();
                cliente = new Cliente(conta, nome, valorInicial);


            } else if (r == 'n') {
                cliente = new Cliente(conta, nome);

            } else {
                System.out.println("Por favor escolha uma alternativa válida");
            }

            System.out.println();
            System.out.println("Dados do cliente");
            System.out.println(cliente);

            System.out.println("Digite o valor do depósito: ");
            double valor = sc.nextDouble();
            cliente.deposito(valor);
            System.out.println("Dados atualizados");
            System.out.println(cliente);

            System.out.println("Digite o valor saque: ");
            valor = sc.nextDouble();
            cliente.saque(valor);
            System.out.println("Dados atualizados");
            System.out.println(cliente);

        }


        sc.close();



    }

}
