package ru.stqa.pft.sandbox;

public class MyFirstProgramm {
    public static void main(String[] args) {
        hello("Vladimir");
        hello("User");
        hello("world");

        double len = 5;
        System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));

        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " равна " + area(a, b));
    }

    public static void hello(String somebody) {
        System.out.println("Hello," + somebody + "!");
    }

    public static double area(double l) {
        return l * l;
    }

    public static double area(double a, double b) {
        return a * b;
    }
}
