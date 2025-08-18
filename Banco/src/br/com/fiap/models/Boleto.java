package br.com.fiap.models;

import br.com.fiap.interfaces.Comprovante;

import java.util.Random;

public class Boleto extends  Pagamento implements Comprovante {

    private Random random;


    public int[] gerarSequencia( int qtd, int limite){
        int[] numeros = new int[qtd];

        for (int i = 0; i< qtd; i++){
            numeros[i] = random.nextInt(limite);
        }
        return numeros;
    }

    public void ProcessarPagamentos(){
        //gerar um codigo de barras, o nome de quem compra, e o valor
        this.random = new Random();
    }

    @Override
    public void EmitirComprovante() {
        // mostar o preço e o nome de quem comprou e uma menssagem falando do aprovamento ou desaprovamento da compra
    }
}
