package Practicals;

public class p9_abstract {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
abstract class Animal {

    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pig extends Animal {
    public void animalSound() {

        System.out.println("The pig says: wee wee");
    }
}

