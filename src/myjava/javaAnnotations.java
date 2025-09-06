package myjava;

public class javaAnnotations {
    @FunctionalInterface //this annotation tells that this function is a "Functional Interface
        /*
        This Mean That the interface contains on and only one function without any
        Body i.e Abstract
         */
    interface anotCheck{
        void helloWorld(String B);
    }

    static class overRide implements anotCheck{
        public void helloWorld(String A) {
            System.out.println("Print : "+A);
        }
    }
    static class check extends overRide{
        //@SuppressWarnings("helloWorld")
        @Override  //This Annotation Tells if a Method is Override or Not
        @Deprecated //This Will Deprecate any function just for alert purposes

        public void helloWorld(String B){
            System.out.println(B);
        }
    }

    //@SuppressWarnings("Deprecated") //This Helps in Suppressing any warning
    @Deprecated
    static void sumCheck(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        check ck = new check();
        ck.helloWorld("This is a Deprecated Function");
        sumCheck(12,18);
    }
}
