package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Io {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("./src/io/input.txt");
            out = new FileOutputStream("./src/io/output.txt");
            int c;
            while ((c = in.read()) != -1) {
//                System.out.println(c);
                out.write(c);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }
}
