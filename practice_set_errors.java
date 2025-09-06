public class practice_set_errors {
    public static void main(String[] args) {
        int a = 35;
        int b = 5;
        int c = 0;
        mean m = new mean();
        // problem 1. this creates a syntax error
        //m.sum();

        // problem 2. This creates a logical error
        //       while(true){
        //            a = "Character";
        //        }

        // problem 3. This creates a runtime error
        //System.out.println("The answer is "+ m.sum(a,b)/m.sum(c,c));
    }
}
class mean{
    public int sum(int num1, int num2){
        System.out.println("Subtraction : "+(num1-num2)+"\nAddition : "+(num1+num2)+"\nMultiplication : "+(num1*num2)+"\nDivision : "+(num1/num2)+"\nDone!");
        return 0;
    }
}