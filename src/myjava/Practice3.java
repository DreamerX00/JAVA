package myjava;

class Monkey{
    void jump(){
        System.out.println("This creature have jumping feature");
    }
    void bite(){
        System.out.println("This creature can also bite");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("The creature can also Eat");
    }
    public void sleep(){
        System.out.println("This creature is sleeping ");
    }
    void speak(){
        System.out.println("Ohio Mina San");
    }
}

public class Practice3{
    public static void main(String[] args) {
        Human hm = new Human();
        hm.jump();
        hm.speak();
        Monkey mm = new Human();
        mm.jump();
        mm.bite();
    }
}
