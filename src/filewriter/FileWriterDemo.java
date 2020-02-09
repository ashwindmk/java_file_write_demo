package filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class FileWriterDemo {
    public static void main(String[] args) {
        String data = "This is line 1\nThis is line 2\n";
        try {
            File file = new File("./src/data.txt");
            FileWriter fw = new FileWriter(file);
            fw.write(data);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
