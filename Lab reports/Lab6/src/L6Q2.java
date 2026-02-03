class Student
{
    String name;
    String address;
    int roll;

    Student()
    {
        name = "Aayush";
        address = "Kalimati";
        roll = 3;
    }

    Student(String n, String a, int r)
    {
        name = n;
        address = a;
        roll = r;
    }

    void display()
    {
        System.out.println(name + " " + address + " " + roll);
    }
}

public class L6Q2
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student("Anish", "Kathmandu", 10);

        s1.display();
        s2.display();
    }
}
