package InputOutputOperations;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class FileOutputStreamOperations {
    static void main() {
        try(FileOutputStream fo = new FileOutputStream("src/InputOutputOperations/FileInputOutputStream.bin",false)){
/*            Random rd = new Random();
//            for (int i = 0; i<100;i++){
//                int random = rd.nextInt(Byte.MIN_VALUE,Byte.MAX_VALUE);
//                fo.write(random);
//            }
*/
            fo.write(("This String Is Converted And Stored In A Binary File").getBytes(StandardCharsets.UTF_8));
            fo.flush();
            IO.println("File Created !!!");
        }catch (IOException io){
            IO.println(io.getMessage());
        }
    }
}
