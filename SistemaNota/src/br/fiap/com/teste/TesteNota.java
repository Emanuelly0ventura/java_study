package br.fiap.com.teste;
import br.fiap.com.models.Aluno;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteNota {
    //========Codigo para salavar o arquivo==========
    private static final String ARQUIVO = "alunos.txt";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Aluno> alunos = new ArrayList<>();

        //codigo pra carregar o arquivo

        try(BufferedReader br = new BufferedReader(new FileReader(ARQUIVO))){
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                String nome = dados[0];
                int idade = Integer.parseInt(dados[1]);
                double nota1 = Double.parseDouble(dados[2]);
                double nota2 = Double.parseDouble(dados[3]);
                alunos.add(new Aluno(nome, idade, nota1, nota2));


            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Erro ao ler arquivo");
        }
        catch (IOException e) {
            System.out.println("Erro ao ler arquivo");
        }

        //============ Menu ==============

        while (true){
            System.out.println("1 - Cadastrar aluno ");
            System.out.println("2 - Ver lista de aluno ");
            System.out.println("3 - Sair ");

            int opcao;
            try{
                opcao = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Escolha invalida!");
                continue;
            }

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do aluno: ");
                    String nome = sc.nextLine();

                    int idade;
                    while (true) {
                        try {
                            System.out.println("Digite a idade do aluno: ");
                            idade = Integer.parseInt(sc.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Idade invalida!");
                        }
                    }

                    double nota1;
                    while (true) {
                        try {
                            System.out.println("Digite a primaira nota do aluno: ");
                            nota1 = Double.parseDouble(sc.nextLine());
                            break;
                        }catch (NumberFormatException e){
                            System.out.println("Nota invalida!");
                        }
                    }

                    double nota2;
                    while (true) {
                        try {
                            System.out.println("Digite a segunda nota do aluno: ");
                            nota2 = Double.parseDouble(sc.nextLine());
                            break;
                        }catch (NumberFormatException e){
                            System.out.println("Nota invalida!");
                        }
                    }

                    Aluno novo = new Aluno(nome, idade, nota1, nota2);
                    alunos.add(novo);

                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO, true))){
                        bw.write(nome + ";" + idade + ";" + nota1 + ";" + nota2);
                        bw.newLine();
                    } catch (IOException e) {
                        System.out.println("Erro ao salvar aluno!");
                    }

                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("====Lista de Alunos cadastrados====");
                    for(Aluno al : alunos){
                        System.out.println(al.toString());
                    }
                    break;

                case 3:
                    System.out.println("Saindo. . .");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }

    }
}
