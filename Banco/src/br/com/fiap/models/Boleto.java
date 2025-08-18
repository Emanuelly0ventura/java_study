package br.com.fiap.models;
import java.util.*;
import br.com.fiap.interfaces.Comprovante;

import java.util.Random;

public class Boleto extends  Pagamento implements Comprovante {

    private Random random;


    public String gerarSequencia(int quantidade, int limite) {

        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < limite; i++) {
            lista.add(i);
        }

        Collections.shuffle(lista);


        List<Integer> selecionados = lista.subList(0, quantidade);

        return selecionados.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", "-")
                .replace(" ", "");
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
