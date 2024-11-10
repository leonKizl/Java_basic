package files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("text.txt");
        writer.write("Hello pidor\n");
        writer.write("23\nfrsfe\nsfe");
        writer.close();


    }
}
