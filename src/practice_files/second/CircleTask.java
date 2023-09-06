package practice_files.second;

import java.util.Objects;

class ThisCircle {

    private double radius;

    public ThisCircle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть положительным числом");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть положительным числом");
        }
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public boolean equals(ThisCircle otherCircle) {
        if (otherCircle == null) {
            return false;
        }
        return this.radius == otherCircle.radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ThisCircle otherCircle = (ThisCircle) obj;
        return Double.compare(otherCircle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}

public class CircleTask {

    public static void main(String[] args) {
        ThisCircle circle1 = new ThisCircle(5.0);
        ThisCircle circle2 = new ThisCircle(3.0);
        ThisCircle circle3 = new ThisCircle(5.0);

        System.out.println("Окружность 1: " + circle1);
        System.out.println("Окружность 2: " + circle2);
        System.out.println("Окружность 3: " + circle3);

        System.out.println("Площадь окружности 1: " + circle1.calculateArea());
        System.out.println("Длина окружности 1: " + circle1.calculateCircumference());

        System.out.println("Сравнение окружности 1 и окружности 2: " + circle1.equals(circle2));
        System.out.println("Сравнение окружности 1 и окружности 3: " + circle1.equals(circle3));
    }
}
