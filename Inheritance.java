// Inheritance is the concept in which one class access the attributes and methods of other class.
// The class that inherit the attributes is called child class and the class whose attributes are inherited is called Parent or base class.
// Inheritance has 4 types:
// 1) Single level Inheritance (Base class -> Derived class)
// 2) Multi level Inheritance (Base class -> Derived class -> Derived class)
// 3) Hierarchial Inheritance(Multiple Derived classes from the same base class) 
// 4) Hybrid Inheritance (in which any types of inheritance is used )
//  There is one another type which is called Multiple Inheritance but it is not in java but in c++.In java we use interfaces instead of it 
class Shape {
    public void getArea() {
        System.out.println("Area for the shape");
    }
}

class Triangle extends Shape {
    public void getArea(int l, int h) {
        System.out.println("Area of Triangle is: " + (1 / 2) * l * h);
    }
}

// This was Single level triangle(Shape(base class) -> Triangle(derived class))
class EquilateralTriangle extends Triangle {
    public void getArea(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

// This was multilevel Inheritance (Shape(Base class) ->Triangle(Derived class)
// -> EquilateralTriangle(Derived class))
class Circle extends Shape {
    public void getArea(int r) {
        System.out.println((3.14) * r * r);
    }
}

// This was Hierarchial Inheritance (Shape(Base class)-> Triangle(Derived
// class)),(Shape(Base class) -> Circle(Derived class))

// Hybrid Inheritance is using all these types of inheritance
public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.getArea();
        t1.getArea(6, 1);
    }
}
