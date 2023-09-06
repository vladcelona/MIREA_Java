package practice_files.second;


class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}


class Circle {

    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}


class Tester {
    private final Circle[] circles;
    private int count;

    public Tester(int maxSize) {
        circles = new Circle[maxSize];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив полон. Невозможно добавить больше элементов.");
        }
    }

    public int getCount() {
        return count;
    }
}

public class MultiClassFile {
    public static void main(String[] args) {
        Point center1 = new Point(2.0, 3.0);
        Circle circle1 = new Circle(center1, 4.0);

        Point center2 = new Point(5.0, 7.0);
        Circle circle2 = new Circle(center2, 2.5);

        Tester tester = new Tester(5); // Максимальный размер массива 5

        tester.addCircle(circle1);
        tester.addCircle(circle2);

        System.out.println("Количество окружностей в массиве: " + tester.getCount());
    }
}
