abstract class Student
{
    int roll;
    String name;

    abstract void Details();
}

class BCAStudent extends Student
{
    void Details()
    {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Course: BCA");
    }
}

class BBAStudent extends Student
{
    void Details()
    {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Course: BBA");
    }
}

public class L7Q6
{
    public static void main(String[] args)
    {
        BCAStudent s1 = new BCAStudent();
        s1.roll = 8;
        s1.name = "Anish";

        BBAStudent s2 = new BBAStudent();
        s2.roll = 3;
        s2.name = "Aayush";

        s1.Details();
        System.out.println();

        s2.Details();
    }
}