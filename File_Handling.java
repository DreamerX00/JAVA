
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling {
    public static void main(String[] args) {
        /*
        // File is Already Created
        File fh = new File("Temp_File.txt");
        try {
            fh.createNewFile();
        }
        catch (IOException e){
            System.out.println("File not Created : Error Occurred");
            e.printStackTrace();
        }
        **/

        //Writing In A File
        /*
        try {
            FileWriter fileWriter = new FileWriter("Temp_File.txt");
            fileWriter.write("Testing Operation count : 1");
            for (int i = 1; i < 10; i++) {

                fileWriter.append("\nSr No. "+i);
            }
            fileWriter.close(); //text will not be shown if this is not initiated
        }
        catch (IOException e){
            System.out.println("File not updated");
        }
        */
        //Read File
        File fr = new File("Temp_File.txt");
        try {
            Scanner sc = new Scanner(fr);
            while (sc.hasNext()){
                String Line = sc.nextLine();
                System.out.println(Line);
            }
            sc.close();
        }
        catch (FileNotFoundException ffe){
            ffe.printStackTrace();
        }

    }
}
