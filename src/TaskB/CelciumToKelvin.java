package TaskB;

public class CelciumToKelvin implements BaseConvertor{
    public int celcium;
    public CelciumToKelvin(int celcium) {
        this.celcium = celcium;
    }
    @Override
    public double result() {
        return celcium + 273;
    }
    @Override
    public void info() {
        System.out.println(celcium + " celcius: " + result() + " kelvins");
    }

    public static void main(String[] args) {
        BaseConvertor kelvin = new CelciumToKelvin(27);
        kelvin.info();
    }
    
}
