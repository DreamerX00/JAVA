import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

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
        try {
            FileWriter fileWriter = new FileWriter("Temp_File.txt");
            fileWriter.write("Testing Operation count : 1");
            fileWriter.close(); //text will not be shown if this is not initiated
        }
        catch (IOException e){
            System.out.println("File not updated");
            e.printStackTrace();
        }

    }
}
