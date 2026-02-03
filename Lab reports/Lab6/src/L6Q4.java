class Distance {
    private int feet;
    private int inches;

    Distance() {
        feet = 0;
        inches = 0;
    }

    Distance(int f, int i) {
        feet = f;
        inches = i;
    }

    Distance addDistance(Distance d) {
        int f = this.feet + d.feet;
        int i = this.inches + d.inches;

        if (i >= 12) {
            f = f + 1;
            i = i - 12;
        }

        return new Distance(f, i);
    }

    void displayDistance() {
        System.out.println(feet + " feet " + inches + " inches");
    }
}

public class L6Q4 {
    public static void main(String[] args) {
        Distance d1 = new Distance(5, 8);
        Distance d2 = new Distance(3, 10);
        Distance d3 = d1.addDistance(d2);

        System.out.print("1st distance = ");
        d1.displayDistance();

        System.out.print("2nd distance = ");
        d2.displayDistance();

        System.out.print("distance sum = ");
        d3.displayDistance();
    }
}
