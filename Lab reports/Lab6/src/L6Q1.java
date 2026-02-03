class Circle
{
    private float radius;

    Circle()
    {
        radius = 1;
    }

    Circle(float r)
    {
        radius = r;
    }

    float findArea()
    {
        return 3.14f * radius * radius;
    }

    float findCircumference()
    {
        return 2 * 3.14f * radius;
    }
}

public class L6Q1
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        System.out.println("Area = " + c1.findArea());
        System.out.println("Circumference = " + c1.findCircumference());

        System.out.println("Area = " + c2.findArea());
        System.out.println("Circumference = " + c2.findCircumference());
    }
}
