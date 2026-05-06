class Fruit {

    String name;
    String taste;
    String size;

    void setFruit(String n, String t, String s) {
        name = n;
        taste = t;
        size = s;
    }

    void eat() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Taste: " + taste);
    }
}

class Apple extends Fruit {

    @Override void eat() {
        System.out.println("Apple Details:");
        System.out.println("Fruit Name: " + name);
        System.out.println("Taste: Sweet & Slightly Sour");
    }
}

class Orange extends Fruit {

    @Override void eat() {
        System.out.println("Orange Details:");
        System.out.println("Fruit Name: " + name);
        System.out.println("Taste: Sour & Tangy");
    }
}

public class L7Q3 {

    public static void main(String[] args) {

        Apple a = new Apple();
        a.setFruit("Apple", "Sweet", "Medium");
        a.eat();

        System.out.println();

        Orange o = new Orange();
        o.setFruit("Orange", "Sour", "Medium");
        o.eat();
    }
}