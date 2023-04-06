package Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp;
        System.out.println("Enter temperature in Celsius");
        temp = in.nextInt();
        Convector convector = new Convector();
        convector.convert(temp);
        
    }
}
