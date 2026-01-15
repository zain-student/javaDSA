class Car { // Class name must start with capital letter
    String name;
    int model;
    String number;

    // Three types of constructors :
    // 1 Simple Constructor.
    // 2 Parameterized constructor.
    // 3 Copy constructor.

    // Constructor is called when an object is created.
    // Simple Constructor
    public Car() {
        System.out.println("This is Simple Constructor");
    }

    // Parameterized Constructor
    public Car(String name2) {
        name = name2;
        System.out.println("Car Name in Parameterized Constructor is :" + name2);
    }

    // Copy Constructor
    public Car(Car c) {
        this.name = c.name;
        this.model = c.model;
        this.number = c.number;

    }

    // Methods :
    // You can use parameterized methods as well as simple methods.
    // This is called method (function inside class is called method).
    // This is the simple method without parameters
    public void getName() {
        System.out.println(name);
    }

    // This is a parameterized Method
    public void getDetails(int model1, String name1, String number1) {
        this.name = name1; // "this" is a key word that tell the method that which object is calling that
                           // function.
        this.model = model1;
        this.number = number1;
        System.out.println("Car Name:" + name1 + ".Car Model:" + model1 + ". Car Number:" + number1);

    }
}

public class Classes {
    public static void main(String[] args) {
        Car car1 = new Car("Mirra"); // car1 is object, new is a keyword that creates location in memory and Car() is
        // constructor. Java has prebuilt constructor. If we create a one that will be
        // used.
        Car car2 = new Car("XLI"); // Another object to understand better "this" keyword.
        Car car3 = new Car();
        Car car4 = new Car();
        // car1.name = "Mira";
        // car1.model = 2010;
        // car1.number = "IDL 2527";
        car1.getDetails(2010, "Suzuki", "SBS 8021");
        car2.getDetails(2000, "Mira", "BFG 219");
        car3.getDetails(2018, "GLI", "HJH 78");
        car4.getDetails(car2.model, car2.name, car2.number);
        // car2.getName();
    }
}
