package br.com.fiap.teste;

import br.com.fiap.models.Boleto;
import br.com.fiap.models.CartaoDeCredito;
import br.com.fiap.models.Registro;

import java.util.Scanner;

public class TesteBanco {
    private String nome;
    public static void main(String[] args) {
        Scanner banco = new Scanner(System.in);
        Registro reg = new Registro();
        Boleto bol = new Boleto();
        CartaoDeCredito car = new CartaoDeCredito();


        //Introduçao
        System.out.println("Digite seu nome: ");
        reg.setNome(banco.nextLine());
        System.out.println("Digite o valor da compra: ");
        reg.setPreco(banco.nextDouble());
        System.out.println("Digite seu cpf: ");
        reg.setCpf(banco.nextDouble());


        //Menu
        System.out.println("1 - Pagar com Cartão de Crédito");
        System.out.println("2 - Pagar com Boleto");
        System.out.println("3 - Sair");
        int opcao = banco.nextInt();


        switch (opcao) {
            //cartão
            case 1:
                System.out.println("opa Cartão?" );
            break;

            //Boleto
            case 2:
                System.out.println("------------------------------\n" );
                System.out.println("Nome do comprador: " + reg.getNome());
                System.out.println("Valor: " + reg.getPreco());
                System.out.println("CPF do comprador: " + reg.getCpf());

                String codigoBarras = bol.gerarSequencia(10, 100);
                System.out.println("Codigo de Barras: " + codigoBarras);
                System.out.println("-----------------------------\n");
            break;

            //sair sistema
            case 3:
                System.out.println("saindo. . .");
                break;

            default:
                System.out.println("Opção invalida!");
        }


    }


}
