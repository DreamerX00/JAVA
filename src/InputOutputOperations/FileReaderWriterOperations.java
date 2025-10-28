package InputOutputOperations;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterOperations {
    static void main() {
          String filePath = "src/InputOutputOperations/FileReaderWriter.txt";
//        new WriterOperation(filePath);
        try(FileReader flr = new FileReader(filePath);){
            int ch;
            while ((ch = flr.read()) != -1){
                IO.print((char) ch);
            }
            IO.println();
        }catch (IOException io){
            IO.println(io.getMessage());
        }
    }
}

class WriterOperation{
    private String text;
    public WriterOperation(String File,String text){
        this.text = text;
        try(FileWriter flw = new FileWriter(File,true);){
            flw.write(text);
        }catch (IOException io){
            IO.println(io.getMessage());
        }
    }

    public WriterOperation(String File){
        try(FileWriter flw = new FileWriter(File,true);){
            flw.write(text);
        }catch (IOException io){
            IO.println(io.getMessage());
        }
    }
}