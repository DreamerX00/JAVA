package Practicals;

public class p7_runtime {
    public static void main(String[] args) {
        planet p = new galaxy();
        p.orbit();
    }
}
class planet{
    void orbit(){
        System.out.println("""
                -----------------------
                Orbital state is okay and ready to launch the rocket
                -----------------------""");
    }
}
class galaxy extends planet{
    void orbit(){
        System.out.println("""
                ------------------------
                Orbital state is not okay please stop the mission as ordered
                ------------------------""");
    }
}
