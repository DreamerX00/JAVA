public class anonymous_class {
    public static void main(String[] args) {
        // This way we can make an Anonymous class
        // Generally Used when you made to much interface methods but you want to use some of them only ones
        anonCheck AC = new anonCheck() {
            @Override
            public void pyramid() {
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j <= i ; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        };
        AC.pyramid();
    }
}

interface anonCheck{
    void pyramid();
}
