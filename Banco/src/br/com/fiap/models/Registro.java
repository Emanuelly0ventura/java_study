package br.com.fiap.models;

public class Registro {
    private String nome;
    private double preco;
    private double cpf;

    //getters
    public String getNome() {return nome;}
    public double getPreco() {return preco;}
    public double getCpf() {return cpf;}

    //setters
    public void setNome(String nome) {this.nome = nome;}
    public void setPreco(double preco) {this.preco = preco;}
    public void setCpf(double cpf) {this.cpf = cpf;}
}
