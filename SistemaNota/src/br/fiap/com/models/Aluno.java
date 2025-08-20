package br.fiap.com.models;

public class Aluno {
    private String nome;
    private int idade;
    private double nota1;
    private double nota2;

    public Aluno (String nome, int idade, double nota1, double nota2) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;

    }

    //getter


    public String getNome() {return nome;}
    public int getIdade() {return idade;}
    public double getNota1() {return nota1;}
    public double getNota2() {return nota2;}

    //setter
    public void setNome(String nome) {this.nome = nome;}
    public void setIdade(int idade) {this.idade = idade;}
    public void setNota1(double nota1) {this.nota1 = nota1;}
    public void setNota2(double nota2) {this.nota2 = nota2;}

    public double calcularMedia(){
        return (this.nota1 + this.nota2) / 2;

    }

    @Override
    public String toString(){
        return "------------------------------\n" +
                "Nome: " + getNome() + "\n" +
                "idade: " + getIdade() + "\n" +
                "Media: " +  calcularMedia();
    }



}

