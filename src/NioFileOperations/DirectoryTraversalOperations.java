package NioFileOperations;

import java.io.IOException;
import java.nio.file.*;

public class DirectoryTraversalOperations {
    static void main() {
        Path dir = Paths.get("src/CollectionFrameWork");
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
            stream.forEach(filestream -> IO.println(filestream.getFileName()));
        }catch (IOException io){
            IO.println(io.getMessage());
        }
    }
}
