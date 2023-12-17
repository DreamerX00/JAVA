import java.util.Random;
import java.util.Scanner;

interface CPU {
    int ALU(int num1, int num2);
    void memoryManagement();
    void operatingSystem();
}

interface RAM {
    void readData();
    void size();
}

interface GPU {
    void version();
    void size();
    boolean compatible();
}

class Mac implements CPU, RAM {
    int members;
    int age;
    String user;
    int userID;
    String[] memberList = new String[100];
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public int ALU(int num1, int num2) {
        return num1 + num2;
    }

    public void memoryManagement() {
        System.out.println("Current Memory Status : 54 / 2983");
    }

    public void operatingSystem() {
        System.out.println("MAC OS 2023");
    }

    public void readData() {
        userID = rd.nextInt(2000000000);
        System.out.print("Enter The Number of Members In Your Family : ");
        members = sc.nextInt();
        for (int i = 0; i < members; i++) {
            System.out.println("Member : " + (i + 1));
            System.out.print("Enter Name : ");
            sc.nextLine();
            user = sc.nextLine();
            System.out.println("ID generated " + userID);
            System.out.print("Enter age : ");
            age = sc.nextInt();
            memberList[i] = "user = " + user + " userID = " + userID + " Age = " + age;
        }
    }

    public void showData() {
        for (int i = 0; i < members; i++) {
            System.out.println(memberList[i]);
        }
    }

    public void size() {
        System.out.println("Size of The Disk is Free By 20%");
    }
}

class Android extends Mac {
    public int ALU(int num1, int num2) {
        return num1 * num2;
    }

    public void memoryManagement() {
        System.out.println("Current Memory Status is : Expandable (255/500)");
    }

    public void operatingSystem() {
        System.out.println("Windows 10 22H2");
    }
}

public class Example_Interface {
    public static void main(String[] args) {
        Mac m = new Mac();
        Android mp = new Android();

        m.ALU(20, 20);
        m.memoryManagement();
        m.operatingSystem();
        m.readData();
        m.showData();
        m.size();

        mp.ALU(20, 20);
        mp.memoryManagement();
        mp.operatingSystem();
        mp.readData();
        mp.showData();
        mp.size();
    }
}
