public class finalyyy {
    public static void main(String[] args) {
        try {
            int i = 0;
            while (i < 10){
                ++i;
                System.out.println(i);
            }
        }
        finally{
            System.out.println("Clearing Data");
        }
    }
}
