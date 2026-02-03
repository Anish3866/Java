class Box {
    private double width;
    private double height;
    private double depth;
    
    Box() {
        width = 0;
        height = 0;
        depth = 0;
    }
    
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double getVolume() {
        return width * height * depth;
    }

    double getSurfaceArea() {
        return 2 * (width * height + height * depth + width * depth);
    }
}

public class L6Q3 {
    public static void main(String[] args) {
        Box box1 = new Box(4, 5, 6);
        Box box2 = new Box(2.5, 3.5, 4.5);

        System.out.println("Box 1:");
        System.out.println("Volume = " + box1.getVolume());
        System.out.println("Surface Area = " + box1.getSurfaceArea());

        System.out.println("\nBox 2:");
        System.out.println("Volume = " + box2.getVolume());
        System.out.println("Surface Area = " + box2.getSurfaceArea());
    }
}
