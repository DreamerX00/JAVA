class method{
    public static void main(String[] args){
        System.out.println("Hello bro");
        Area obj = new Area();
        int length = 82;
        int breath = 22;
        int height = 40;

        obj.Cube(length);
        obj.Cuboid(length,breath,height);
        Area.Square(length);
    }
}
class Area {
    public static void Rectangle(int l,int b){
        int area = l * b;
        System.out.println("Area of the Rectangle = "+ area);
    }
    public static void Square(int s){
        int area = s*s;
        System.out.println("Area of The Square = "+ area);
    }

    void Cube(int s){
        int area = s*s*s;
        System.out.println("Area of The Cube = "+ area);
    }
    void Cuboid(int l, int b, int h){
        int area = (l*h + l*b + h*b)*2;
        System.out.println("Area of The Cuboid = "+area);
    }
}