abstract class Geometry{
    abstract void pen();
    abstract void refill();
}
class Notebook extends Geometry{
    void pen() {
        System.out.println("Writing in a Notebook");
    }
    void refill(){
        System.out.println("Refilling The Pen");
    }

}
final class fountainPen extends Notebook{
    void changeNib(){
            System.out.println("Change Nib");
    }
}

public class Practice {
    public static void main(String[] args) {
        fountainPen fn = new fountainPen();
        fn.changeNib();
        fn.pen();
        fn.refill();
    }
}
