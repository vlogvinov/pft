package ru.stqa.pft.sandbox;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double distance(Point point) {
        double p1 = (point.x - this.x) * (point.x - this.x);
        double p2 = (point.y - this.y) * (point.y - this.y);
        return Math.sqrt(p1 + p2);
    }
}
