package ImportantConcepts;

public class Sealed_Classes {
     /* Java 17 Feature
     A sealed class is a class that restricts which other classes or interfaces may extend or implement it.
     This is done using the permits keyword in the class declaration.
     Sealed classes are useful when you want to control the inheritance hierarchy of a class.
     A sealed class can only be extended by classes that are explicitly permitted to do so.
     A sealed class can have three types of subclasses:
     1. final classes: These classes cannot be extended further.
     2. non-sealed classes: These classes can be extended further.
     3. sealed classes: These classes can also restrict which classes can extend them.
     */
    public static void main(String[] args) {
        BMW car = new BMW();
        car.start();
        car.model();

        Samsung android = new Samsung();
        android.os();
        android.model();

        Iphone ios = new Iphone();
        ios.os();
        ios.model();

        Shape shape1 = new Circle();
        shape1.draw();
        Shape shape2 = new Rectangle();
        shape2.draw();
        /* Shape shape3 = new Square();
         shape3.draw();*/


        Bike vehicle = new Bike();
        vehicle.start();
        vehicle.start();
        }

}

sealed class Car permits BMW, Audi, Tesla {
    void start() {
        System.out.println("Car Started");
    }
}

sealed class Android permits Samsung, OnePlus {
    void os() {
        System.out.println("Android OS");
    }
}

sealed class IOS {
    void os() {
        System.out.println("iOS");
    }
}

final class BMW extends Car {
    void model() {
        System.out.println("BMW Model");
    }
}
final class Audi extends Car {
    void model() {
        System.out.println("Audi Model");
    }
}
final class Tesla extends Car {
    void model() {
        System.out.println("Tesla Model");
    }
}
final class Samsung extends Android {
    void model() {
        System.out.println("Samsung Model");
    }
}
final class OnePlus extends Android {
    void model() {
        System.out.println("OnePlus Model");
    }
}
final class Iphone extends IOS {
    void model() {
        System.out.println("iPhone Model");
    }
}

// Non-sealed class example
sealed class Shape permits Circle, Rectangle {
    void draw() {
        System.out.println("Drawing Shape");
    }
}
non-sealed class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}
final class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

final class Square{
    void draw() {
        System.out.println("Drawing Square");
    }
}
// In the above example, the Car class is a sealed class that can only be extended by the BMW, Audi, and Tesla classes.
// The Android class is a sealed class that can only be extended by the Samsung and OnePlus classes.
// The IOS class is a sealed class that can only be extended by the iPhone and iPad classes.
// The Shape class is a sealed class that can be extended by the Circle, Rectangle, and Square classes.
// The Circle class is a non-sealed class that can be extended further.
// The Rectangle and Square classes are final classes that cannot be extended further.
// This way, we can control the inheritance hierarchy of the classes and ensure that only the permitted classes can extend the sealed classes.
// Note: Sealed classes are a powerful feature that can help you create more maintainable and secure code.
// However, they should be used judiciously, as they can also make the code more complex and harder to understand.
// Also, sealed classes are not meant to replace traditional inheritance.
// They are meant to be used in conjunction with traditional inheritance to create more controlled and secure class hierarchies.
// Sealed interfaces
sealed interface Vehicle permits  Bike {
    void start();
}
final class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike Started");
    }
}
// In the above example, the Vehicle interface is a sealed interface that can only be implemented by the Car and Bike classes.
// The Bike class is a final class that cannot be extended further.
// This way, we can control the implementation hierarchy of the interfaces and ensure that only the permitted classes can implement the sealed interfaces.
// Note: Sealed interfaces are a powerful feature that can help you create more maintainable and secure code.
// However, they should be used judiciously, as they can also make the code more complex and harder to understand.
// Also, sealed interfaces are not meant to replace traditional interfaces.
// They are meant to be used in conjunction with traditional interfaces to create more controlled and secure interface hierarchies.
// Sealed classes and interfaces can be used in various scenarios, such as:
// 1. When you want to create a class hierarchy that is controlled and secure.
// 2. When you want to create a class hierarchy that is easy to understand and maintain.
// 3. When you want to create a class hierarchy that is optimized for performance.
// 4. When you want to create a class hierarchy that is compatible with other programming languages.
// 5. When you want to create a class hierarchy that is easy to test and debug.
// Overall, sealed classes and interfaces are a powerful feature that can help you create more maintainable and secure code.
// However, they should be used judiciously, as they can also make the code more complex and harder to understand.
// Also, sealed classes and interfaces are not meant to replace traditional inheritance and interfaces.
// They are meant to be used in conjunction with traditional inheritance and interfaces to create more controlled and secure class and interface hierarchies.
