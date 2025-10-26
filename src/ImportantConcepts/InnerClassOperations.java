package ImportantConcepts;

public class InnerClassOperations {
    static void main() {
        Outer.Inner out2 = new Outer().new Inner();
        IO.println(Outer.Inner.class.toString());

        Outer outer = new Outer();
        outer.showLocalDisplay();

        Outer.StaticInner.display();

        TopOuter top = new TopOuter();

        top.outer2.showLocalDisplay();
    }
}

class Outer{
    public Outer(){
        IO.println("This Is Outer Class Constructor !!");
    }
    // Inner Class
    class Inner{
        public Inner(){
            IO.println("This is Inner Class Constructor");
        }
    }

    // Local Inner Class
    public void showLocalDisplay(){
        class Inner2{
            private int a = 88;
            void localDisplay(){
                a += 12;
                IO.println("Incremented Value : "+a);
            }
        }

        Inner2 in2 = new Inner2();
        in2.localDisplay();
    }

    //static Inner class
    static class StaticInner {
        private StaticInner(){
            IO.println("Private Constructor!!!");
        }
        static void display(){
            IO.println("Invoked Through A Static Inner Class");
        }
    }
}

class TopOuter{
    public TopOuter(){
            IO.println("TopOuter constructor Invoked !!!!");
    }
    Outer outer2 = new Outer(){
        void display(){
            IO.println("This Is Called From Top Outer");
        }
    };
}

class ChildA extends Outer{
    public ChildA(){
        super();
        IO.println("Calling SuperClass");
    }
}

