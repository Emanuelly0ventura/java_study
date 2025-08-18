package br.com.fiap.teste;

import br.com.fiap.models.Boleto;
import br.com.fiap.models.CartaoDeCredito;
import br.com.fiap.models.Pagamento;
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
        System.out.println("digite seu cpf");
        reg.setCpf(banco.nextInt());

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
                int[] numeros = bol.gerarSequencia(10, 100);
                for (int n : numeros){
                    System.out.println("Codigo de Barras:" + n);
                }
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
