import java.security.PrivateKey;

public class Aluno {
    private String aluno;
    private double nota1;
    private double nota2;
    private double nota3;

    public double MediadeNota(){
         double media = (nota1+nota2+nota3)/3;
         return media;
    }

    public void Aprovacao(){
        if(MediadeNota() >= 7.0){
            System.out.println("Aluno Aprovado");
        }else if (6.9 < MediadeNota() && MediadeNota() <= 5.0) {
            System.out.println("Aluno de Recuperação");
        }
        else{
            System.out.println("Aluno Reprovado");
        }

    }
//getters
    public String getAluno() {
        return aluno;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }


//Setters
    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}
