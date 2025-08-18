package br.com.fiap.models;
//2.13.1 - versão do json
import br.com.fiap.interfaces.Comprovante;

public class CartaoDeCredito extends Pagamento implements Comprovante {


    public void ProcessarPagamentos(){

    }

    @Override
    public void EmitirComprovante() {

    }
}
