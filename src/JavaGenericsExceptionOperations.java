public class JavaGenericsExceptionOperations {
    static void main() {
        try {
            throw new GetValues(123);
        }catch (Exception e) {
            IO.println(e.getMessage());
        }

        try {
            throw new GetValues("Hello");
        }catch (Exception e) {
            IO.println(e.getMessage());
        }

        try {
            throw new GetValues(false);
        }catch (Exception e) {
            IO.println(e.getMessage());
        }
    }
}

/*class NotPossibleClass<T> extends Exception{
    Not Possible
    Java Generics Does Not support Exception because
    of The type Erasure.
}
*/

// But A Workaround Exist For It
class GetValues extends Exception {
    public <T> GetValues(T value) {
        super("Exception Related To Value : "
                +value.toString()+
                " of type : "
                +value.getClass().getName()
        );
    }
}