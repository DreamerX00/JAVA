package InputOutputOperations;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamOperations {
    static void main() {
        try(FileInputStream fi = new FileInputStream("src/InputOutputOperations/FileInputOutputStream.bin")){
            IO.println(fi.skip(2));
            for(byte value : (fi.readAllBytes())){
                IO.print((char)value);
            }
            IO.println();
            IO.println(fi.getChannel());
            IO.println(fi.getFD());
        } catch (IOException io){
            IO.println(io.getMessage());
        }

    }
}
