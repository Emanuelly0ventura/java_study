public class Celsius {
    private double temperaturaCelsius;

    public void Converter() {
        double resultado = (temperaturaCelsius * 9/5) + 32;
        System.out.println("Resultado: " + resultado);
    }

    public double setTemperaturaCelsius(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
        return temperaturaCelsius;
    }

    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }
}
