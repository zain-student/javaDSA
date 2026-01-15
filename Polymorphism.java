// Polymorphism : poly -> many and morphism ->  forms 
// It means to solve a problem in different forms.
// Two types :
// 1) Compile time polymorphism.(function overloading and function overriding)
// 2) Run-time polymorphism.

// This is called run time polymorphism which is also as function overloading.
// Compile time polymorphism will be in Inheritance topic
class Student {
    String name;
    int age;

    // Function overloading (function will have same name but with different
    // arguments or return type)
    public void getInfo(int age1) {
        this.age = age1;
        System.out.println(age1);
    }

    public void getInfo(String name1) {
        this.name = name1;
        System.out.println(name1);
    }

    public void getInfo(String name1, int age1) {
        this.age = age1;
        this.name = name1;
        System.out.println(name1);
        System.out.println(age1);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Zain Malik";
        s1.age = 25;
        s1.getInfo(s1.age);
        s1.getInfo(s1.name);
        s1.getInfo(s1.name, s1.age);
    }
}
