package InputOutputOperations;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterClassOperations {
    static void main() {
        try(Writer wr = new FileWriter("src/InputOutputOperations/InputOutputClassOperations.txt")) {

            wr.write("This Is A Text Passed From This Writer Class");
            IO.println("Operation Complete !!!");

        }catch (FileNotFoundException fileNotFoundException){
            IO.println("Error Occurred : "+fileNotFoundException.getMessage());
        }catch (IOException io){
            IO.println("Fatal Error Occurred : "+io.getMessage());
        }

    }
}
