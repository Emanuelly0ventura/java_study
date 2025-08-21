package br.fiap.com.model;

public class Taxi {

    private String modelo;
    private String placa;
    private double velociade;
    private boolean emCorrida;
    private double valorCorrida;


    public void Construtor(String modelo, String placa, double velociade, boolean emCorrida, double valorCorrida){

        this.modelo = modelo;
        this.placa = placa;
        this.velociade = velociade;
        this.emCorrida = emCorrida;
        this.valorCorrida = valorCorrida;

    }

    public void iniciarCorrida(){

    }

}
