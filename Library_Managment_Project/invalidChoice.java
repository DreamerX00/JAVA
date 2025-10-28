package Library_Managment_Project;

public class invalidChoice extends Exception {
    @Override
    public String getMessage() {
        return "Not Allowed Choose Withing Options";
    }

    @Override
    public String toString() {
        return "You Blind Or Something ???";

    }

    static void main() {

    }
}
