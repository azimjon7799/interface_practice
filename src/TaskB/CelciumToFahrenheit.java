package TaskB;

public class CelciumToFahrenheit implements BaseConvertor{
    public int celcium;

    public CelciumToFahrenheit(int celcium) {
        this.celcium = celcium;
    }

    @Override
    public double result() {
        return celcium * 1.8 + 32;
    }

    @Override
    public void info() {
        System.out.println(celcium + " celcius: " + result() + " fahrenheit");
    }

    public static void main(String[] args) {
        BaseConvertor faranheit = new CelciumToFahrenheit(20);
        faranheit.info();
    }
    
}
