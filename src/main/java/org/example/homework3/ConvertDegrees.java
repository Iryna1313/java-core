package org.example.homework3;

public class ConvertDegrees {
    public static void main(String[] args) {
        double Celsius = 12.5;
        double Fahrenheit = (Celsius * 9/5) + 32;
        double Kelvin = Celsius + 273.15;

        System.out.println("Celsius: " + Celsius);
        System.out.println("Fahrenheit: " + Fahrenheit);
        System.out.println("Kelvin: " + Kelvin);
    }
}
