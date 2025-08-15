package br.com.fiap.models;
//2.13.1 - versão do json
import br.com.fiap.interfaces.Comprovante;

public class CartaoDeCredito extends Pagamento implements Comprovante {

    public abstract static class ProcessarPagamentos{

    }
    public abstract static class EmitirComprovante{

    }

    @Override
    public void EmitirComprovante() {

    }
}
