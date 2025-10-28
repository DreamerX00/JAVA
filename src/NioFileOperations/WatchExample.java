package NioFileOperations;

import java.io.IOException;
import java.nio.file.*;

public class WatchExample {
    public static void main(String[] args) {
        Path dir = Paths.get("src/CollectionFrameWork");

        try {
            WatchService watchService = FileSystems.getDefault().newWatchService();

            // Register BEFORE calling take()
            dir.register(watchService,
                    StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_DELETE,
                    StandardWatchEventKinds.ENTRY_MODIFY);

            System.out.println("Watching directory: " + dir);

            // Continuous loop
            while (true) {
                WatchKey key = watchService.take(); // blocks until event occurs

                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();
                    Path fileName = (Path) event.context();

                    if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
                        System.out.println("File Created: " + fileName);
                    } else if (kind == StandardWatchEventKinds.ENTRY_DELETE) {
                        System.out.println("File Deleted: " + fileName);
                    } else if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
                        System.out.println("File Modified: " + fileName);
                    }
                }

                boolean valid = key.reset();
                if (!valid) {
                    System.out.println("WatchKey no longer valid, exiting...");
                    break;
                }
            }
        } catch (IOException | InterruptedException e) {
            IO.println(e.getMessage());
        }
    }
}