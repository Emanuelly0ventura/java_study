package br.com.fiap.models;

public class Registro {
    private String nome;
    private double preco;
    private int cpf;

    //getters
    public String getNome() {return nome;}
    public double getPreco() {return preco;}
    public int getCpf() {return cpf;}

    //setters
    public void setNome(String nome) {this.nome = nome;}
    public void setPreco(double preco) {this.preco = preco;}
    public void setCpf(int cpf) {this.cpf = cpf;}
}
