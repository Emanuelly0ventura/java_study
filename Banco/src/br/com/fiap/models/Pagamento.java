package br.com.fiap.models;

public abstract class Pagamento {

    private double valor;
    private String data;
    private String numeroCartao;
    private String codigoBarras;

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
    public String getCidigoBarras() {return codigoBarras;}
    public String getNumeroCartao() {return numeroCartao;}

    //Setters
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setNumeroCartao(String numeroCartao) {this.numeroCartao = numeroCartao;}
    public void setCidigoBarras(String cidigoBarras) {this.codigoBarras = cidigoBarras;}

    public abstract static class ProcessarPagamentos{

    }
    public abstract static class EmitirComprovante{

    }
}
