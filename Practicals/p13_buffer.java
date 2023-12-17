package Practicals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p13_buffer {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while (true) {
                line = reader.readLine();
                if (line.equalsIgnoreCase("STOP")) {
                    break;
                }
                System.out.println("You typed: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

