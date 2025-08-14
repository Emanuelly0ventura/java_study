import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.println("Digite o nome do aluno: ");
        aluno.setAluno(leitor.nextLine());

        System.out.println("Digite a nota 1: ");
        aluno.setNota1(leitor.nextDouble());

        System.out.println("Digite a nota 2: ");
        aluno.setNota2(leitor.nextDouble());

        System.out.println("Digite a nota 3: ");
        aluno.setNota3(leitor.nextDouble());

        System.out.println("A media do aluno é: " + aluno.MediadeNota());

        aluno.Aprovacao();

    }
}
