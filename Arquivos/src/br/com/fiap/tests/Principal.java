package br.com.fiap.tests;

import br.com.fiap.models.ArquivoCupom;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) {

        String path = "C:\\Manu\\fiap\\fiap\\2semestre\\java_study\\ddd-livraria\\cupom";
        try {
            ArquivoCupom.escrita(path);
            ArquivoCupom.leitor(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
