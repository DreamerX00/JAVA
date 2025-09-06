package myjava;

import java.util.Scanner;

class enCaps {
    private String name;
    private long number;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getNumber(){
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Checker{
    public static void main(String[] args) {
        String name;
        int id;
        long number;
        Scanner getInput = new Scanner(System.in);
        enCaps en = new enCaps();
        System.out.print("Enter Your Name :- ");
        name = getInput.nextLine();
        System.out.print("Enter Your id :- ");
        id = getInput.nextInt();
        System.out.print("Enter Your Number :- ");
        number = getInput.nextLong();
        en.setName(name);
        en.setId(id);
        en.setNumber(number);
        System.out.println("Hello "+en.getName()+" Thanks for Visiting\nYour Permanent id is "+en.getId()+" And we will inform you about the update on this "+en.getNumber()+" number");
    }
}