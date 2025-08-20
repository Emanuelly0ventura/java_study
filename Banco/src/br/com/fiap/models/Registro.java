package br.com.fiap.models;

public class Registro {
    private String nome;
    private double preco;
    private String cpf;
    private int NumCartao;
    private int CodSeguranca;

    //getters
    public String getNome() {return nome;}
    public double getPreco() {return preco;}
    public double getCpf() {return cpf;}
    public int getNumCartao() {return NumCartao;}
    public int getCodSeguranca() {return CodSeguranca;}

    //setters
    public void setNome(String nome) {this.nome = nome;}
    public void setPreco(double preco) {this.preco = preco;}
    public void setCpf(String cpf) {this.cpf = cpf;}
    public void setNumCartao(int NumCartao) {this.NumCartao = NumCartao;}
    public void setCodSeguranca(int codSeguranca) {CodSeguranca = codSeguranca;}



}
