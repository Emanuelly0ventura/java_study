//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void leituraJson(){
//        Gson gson = new Gson();
//        try(FileReader reader = new FileReader()){
//            Cliente cliente = gson.fromJson(reader, Cliente.class);
//            System.out.println(cliente);
//        } catch (IOException e) {
//            System.out.println("Ocorreu um erro ao ler o arquivo cliente");
//        }
//    }
//
//    public static void main(String[] args) {
//        Cliente cliente = new Cliente();
//        Gson gson = new GsonBuilder().setPrettyPrinting().creat();
//        try(FileWriter writer = new FileWriter()){
//            gson.toJson(cliente, writer);
//            System.out.println("Arquivo salvo com sucesso!");
//        } catch (IOException e) {
//            System.out.println("Erro ao slavar o arquivo!");
//        }
//        Main.leituraJson();
//    }
//}