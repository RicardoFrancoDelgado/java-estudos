package util;

public class Calculator {

    //devolvemos o static no método para reutilizarmos na classe program
    public static final double PI = 3.14159;

    //devolvemos o static no método para reutilizarmos na classe program
    public  static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    //devolvemos o static no método para reutilizarmos na classe program
    public  static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
