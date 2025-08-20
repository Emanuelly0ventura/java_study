package br.com.fiap.teste;

import br.com.fiap.models.Boleto;
import br.com.fiap.models.CartaoDeCredito;
import br.com.fiap.models.Registro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteBanco {
    private String nome;
    public static void main(String[] args) {
        Scanner banco = new Scanner(System.in);
        Registro reg = new Registro();
        Boleto bol = new Boleto();
        CartaoDeCredito car = new CartaoDeCredito();



        //Introduçao
        //nome
        while (true) {
            try {
                System.out.println("Digite seu nome: ");
                reg.setNome(banco.nextLine());
                if(reg.getNome().matches("[\\p{L} ]+")){
                    break;
                }else{
                    System.out.println("Entrada inválida! Digite apenas letras.");
                }

            } catch (InputMismatchException e){
                System.out.println("numeros não são permitidos");
                banco.nextLine();
            }
            catch (Exception e) {
                System.out.println("Nome inválido!");
                banco.nextLine();
            }
        }

        //valor
        while (true) {
            try {
                System.out.println("Digite o valor da compra: ");
                reg.setPreco(banco.nextDouble());
                banco.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Valor errado!");
                banco.nextLine();
            }
        }

        //cpf
        while (true) {
            System.out.println("Digite seu CPF: ");
            reg.setCpf(banco.nextLine());

            if (reg.getCpf().matches("\\d{11}")) {
                break;
            } else {
                System.out.println("Número inválido, tente novamente!");
            }
        }




        //Menu
        System.out.println("1 - Pagar com Cartão de Crédito");
        System.out.println("2 - Pagar com Boleto");
        System.out.println("3 - Sair");
        int opcao = banco.nextInt();


        switch (opcao) {
            //cartão
            case 1:
                while (true) {
                    System.out.println("Digite o numero do cartão: ");

                    String numCartao = banco.next();
                    if (numCartao.matches("\\d{9}")) {
                        reg.setNumCartao(numCartao);
                        break;
                    } else {
                        System.out.println("Número de cartão inválido, digite 16 dígitos.");
                    }
                }

                while (true) {
                        System.out.println("Digite o codigo de segurança: ");

                        String  CodSeguranca = banco.next();
                        if(CodSeguranca.matches("\\d{3}")){
                            reg.setCodSeguranca(Integer.parseInt(CodSeguranca));
                            break;
                        }
                        else {
                            System.out.println("Numero invalido, tente novamente");
                        }
                }


                System.out.println("------------------------------\n" );
                System.out.println("Nome do comprador: " + reg.getNome());
                System.out.println("Valor: " + reg.getPreco());
                System.out.println("CPF do comprador: " + reg.getCpf());
                car.setPreco(reg.getPreco());
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
