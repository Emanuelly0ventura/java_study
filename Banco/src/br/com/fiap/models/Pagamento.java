package br.com.fiap.models;

public abstract class Pagamento {

    private double valor;
    private String data;
    private String numeroCartao;
    private String cidigoBarras;

    public void Construtores(double valor, String data){
        this.valor = valor;
        this.data = data;
    }

    //Getters
    public double getValor() {
        return valor;
    }
    public String getData() {
        return data;
    }

    //Setters
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setData(String data) {
        this.data = data;
    }

    public abstract class ProcessarPagamentos{

    }
    public abstract class EmitirComprovante{

    }
}
