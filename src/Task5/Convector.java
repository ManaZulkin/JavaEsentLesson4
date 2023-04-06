package Task5;

public class Convector extends ConverterTemperature {
    @Override
    void convert(int temp) {
        System.out.println("Temperature in Farengate: " + (( 9 * temp / 5 ) + 32));
        System.out.println("Tempereture in Kelvin: " + (temp + 273.15) );
    }
}
