class Person {
    String name;
    String address;

    void setName(String n) {
        name = n;
    }

    void setAddress(String a) {
        address = a;
    }

    String getName() {
        return name;
    }

    String getAddress() {
        return address;
    }
}

class Student extends Person {
    int roll;

    void setRoll(int r) {
        roll = r;
    }

    int getRoll() {
        return roll;
    }
}

// -------- Multi Level --------
class Employee extends Person {
    double salary;

    void setSalary(double s) {
        salary = s;
    }

    double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
}

class CollegeStudent extends Person {
    String collegeName;

    void setCollege(String c) {
        collegeName = c;
    }

    String getCollege() {
        return collegeName;
    }
}

public class L7Q2 {
    public static void main(String[] args) {

        Student s = new Student();
        s.setName("Anish");
        s.setAddress("Kathmandu");
        s.setRoll(101);

        System.out.println("Single-Level:");
        System.out.println(s.getName());
        System.out.println(s.getAddress());
        System.out.println(s.getRoll());

        System.out.println("\nMulti-Level:");
        Manager m = new Manager();
        m.setName("Ram");
        m.setSalary(50000);

        System.out.println(m.getName());
        System.out.println(m.getSalary());

        System.out.println("\nHierarchical:");
        CollegeStudent cs = new CollegeStudent();
        cs.setName("Aayush");
        cs.setCollege("Patan Campus");

        System.out.println(cs.getName());
        System.out.println(cs.getCollege());
    }
}