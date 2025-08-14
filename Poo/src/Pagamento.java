public abstract class Pagamento {

    private double valor;
    private String data;

    public Pagamento(double valor, String data){
        this.valor = valor;
        this.data = data;
    }

    public abstract class processarPagamento{

    }


    //Getter
    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    //Setter
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setData(String data) {
        this.data = data;
    }

}
