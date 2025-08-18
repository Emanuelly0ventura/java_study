package br.com.fiap.models;
//2.13.1 - versão do json
import br.com.fiap.interfaces.Comprovante;

public class CartaoDeCredito extends Registro implements Comprovante {


    public void ProcessarPagamentos(){
        System.out.println("Compra de valor: R$" + getPreco() + " realizado com sucesso!");

    }

    @Override
    public void EmitirComprovante() {
        System.out.println("------------------------------\n" );
        System.out.println("Nome do comprador: " + getNome());
        System.out.println("Valor: " + getPreco());
        System.out.println("CPF do comprador: " + getCpf());
        ProcessarPagamentos();
        System.out.println("-----------------------------\n");
    }
}
