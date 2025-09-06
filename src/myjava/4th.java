package myjava;

class arg{
    public static void main(String[] args){
    check ch = new check();
        System.out.println(ch.sum(12,5,6,7));
    }
}
class check {
    int sum(int  ... Ars) {
        int res = 0;
        for (int i : Ars) {
            res += i;
        }
        return res;
    }
}