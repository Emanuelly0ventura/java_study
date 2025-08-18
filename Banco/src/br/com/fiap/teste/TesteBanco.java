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
        try {

            System.out.println("Digite seu nome: ");
            reg.setNome(banco.nextLine());
        }catch (Exception e){
            System.out.println("Nome inválido!");
        }
        try {
            System.out.println("Digite o valor da compra: ");
            reg.setPreco(banco.nextDouble());
        }catch (Exception e){
            System.out.println("Valor errado!");
        }

        try {
            System.out.println("Digite seu cpf: ");
            reg.setCpf(banco.nextDouble());
        } catch (Exception e) {
            System.out.println("CPF inválido!");
        }


        //Menu
        System.out.println("1 - Pagar com Cartão de Crédito");
        System.out.println("2 - Pagar com Boleto");
        System.out.println("3 - Sair");
        int opcao = banco.nextInt();


        switch (opcao) {
            //cartão
            case 1:
                 try {
                     System.out.println("Digite o numero do cartão: ");
                     reg.setNumCartao(banco.nextInt());
                 }   catch (Exception e) {
                     System.out.println("Erro, numero do cartão inválido!");
                 }


                 try {
                     System.out.println("Digite o codigo de segurança: ");
                     reg.setCodSeguranca(banco.nextInt());
                 }catch (Exception e) {
                     System.out.println("Erro, numero de segurança inválido!");
                 }


                System.out.println("------------------------------\n" );
                System.out.println("Nome do comprador: " + reg.getNome());
                System.out.println("Valor: " + reg.getPreco());
                System.out.println("CPF do comprador: " + reg.getCpf());
                System.out.println("Compra de valor: R$" + car.getPreco() + " realizado com sucesso!");
                System.out.println("-----------------------------\n");


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

                System.out.println("Você pode realizar o pagamento ate 5 dias uteis depois de ter gerado o boleto!");
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
