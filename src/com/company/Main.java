package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String aux;
        int opcao;
        double valor;

        System.out.println(" digite o titular da conta ");
        aux= in.nextLine();

        conta c1 = new conta(aux); // estanciar um objeto
        do {
            System.out.println(" ");

            System.out.println( " --- menu ---");
            System.out.println( " 1 -- DADOS BANCARIOS ");
            System.out.println( " 2 -- DEPOSITO ");
            System.out.println( " 3 -- SAQUE ");
            System.out.println("  0 -- SAIR ");

            System.out.println("");

            System.out.println(" opçao: ");
            opcao= in.nextInt();

            switch (opcao){
                case 1 :
                  c1.DadosBancario();
                 break;
                case 2 :
                    System.out.println( " DIgite o valor do Deposito ");
                    valor = in.nextDouble();
                    c1.Deposito(valor);
                    break;
                case 3 :
                    System.out.println(" digite o valor do Saque ");
                    valor = in.nextDouble();
                    c1.sacar(valor);
                    break;
                case  0 :
                    System.out.println(" sair ");
            }

        } while (opcao != 0);


    }
}
