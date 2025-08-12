import java.util.Scanner;

public class testeCelsius {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try {
            Celsius cel = new Celsius();
            System.out.println("Digite o temperatura em Celsius:");
            cel.setTemperaturaCelsius(leitor.nextDouble());

            System.out.println("Valor convertido para fahrenheit");
            cel.Converter();

        }catch (Exception e){
            System.out.println("ERRO");
        }finally {
            System.out.println("finalizado");
        }
    }
}
