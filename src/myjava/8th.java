package myjava;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class file{
    public static void main(String[] args) {
        //File Creation

        /*File myfile = new File("Demo.txt");
        try {
            myfile.createNewFile();
        }
        catch (IOException e){
            System.out.println("Error In Creating File");
            e.printStackTrace();
        }

        //File Write

        try {
            FileWriter fw = new FileWriter("Demo.txt");
            fw.append("Gaddiya uchiya rakhia ohyeee\nnara to piche ne kadiya par tu menu badi jachdi\nlakh de gucchi d belt tu paaya");
            fw.close();
        }
        catch (IOException e){
            System.out.println("File not found");
            e.printStackTrace();
        }

        //File Read
        File myfile = new File("Demo.txt");
        try {
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()){
                String Line = sc.nextLine();
                System.out.println(Line);
            }
            sc.close();
        }
        catch (IOException e){
            System.out.println("Can't Open File");
            e.printStackTrace();
        }*/

        //Deleting File

        File myfile = new File("Demo.txt");
        if (myfile.delete()){
            System.out.println("File Deletion Successful : "+myfile.getName()+"From Path "+myfile.getPath());
        }
        else {
            System.out.println("Error in file deletion");
        }


    }
}