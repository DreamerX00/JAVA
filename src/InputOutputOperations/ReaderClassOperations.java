package InputOutputOperations;

import java.io.*;

public class ReaderClassOperations {
    static void main() {
        try(Reader rd = new FileReader("src/InputOutputOperations/InputOutputClassOperations.txt");
        Writer wr = new FileWriter("src/InputOutputOperations/CopyFile.txt")){
            IO.println(rd.ready());

            IO.println(rd.transferTo(wr));
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("Error Occurred While Accessing File : "+fileNotFoundException.getMessage());
        } catch (IOException e) {
            IO.println(e.getMessage());
        }


    }
}
