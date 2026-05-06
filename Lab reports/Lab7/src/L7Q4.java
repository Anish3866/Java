class Shape {

    void area() {
        System.out.println("Area of Shape is not defined.");
    }
}

class Triangle extends Shape {

    double base = 10;
    double height = 5;

    @Override
    void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

class Rectangle extends Shape {

    double length = 8;
    double breadth = 4;

    @Override
    void area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class L7Q4 {

    public static void main(String[] args) {

        Shape s;

        s = new Triangle();
        s.area();

        s = new Rectangle();
        s.area();
    }
}