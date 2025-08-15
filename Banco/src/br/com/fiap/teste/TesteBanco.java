package br.com.fiap.teste;

import java.util.Scanner;

public class TesteBanco {
    public static void main(String[] args) {
        Scanner banco = new Scanner(System.in);

        System.out.println("1 - Pagar com Cartão de Crédito");
        System.out.println("2 - Pagar com Boleto");
        System.out.println("3 - Sair");
        int opcao = banco.nextInt();


        switch (opcao) {
            case 1:
                System.out.println("opa Cartão?");
            break;

            case 2:
                System.out.println("opa boleto?");
            break;

            case 3:
                System.out.println("saindo. . .");
                break;

            default:
                System.out.println("Opção invalida!");
        }


    }


}
