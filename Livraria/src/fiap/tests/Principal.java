package fiap.tests;

import fiap.models.ArquivoCupom;

import java.io.IOException;

public class Principal {
    public static void main(String[] args)  {

        String path = "C:\\projetos\\2025\\ddd\\DDD_1TDSPJ\\ddd-livraria\\cupom.txt";
        try {
            ArquivoCupom.escrita(path);
            ArquivoCupom.leitor(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
