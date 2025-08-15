package br.com.fiap.models;

import br.com.fiap.interfaces.Comprovante;

public class boleto extends  Pagamento implements Comprovante {

    public abstract static class ProcessarPagamentos{

    }
    public abstract static class EmitirComprovante{

    }

    @Override
    public void EmitirComprovante() {

    }
}
