package practicals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
class GFG {
    public static void main(String[] args)
            throws FileNotFoundException
    {
        FileInputStream GFG = null;
        try {
            GFG = new FileInputStream(
                    "/files/java/GFG.txt");
        }

        catch (FileNotFoundException e) {

            System.out.println("File does not exist");
        }
    }
}
