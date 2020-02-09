package fileoutputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class FileOutputStreamDemo {
    public static void main(String[] args) {
        String data = "This is line 1\nThis is line 2\n";
        try {
            File file = new File("./src/data.txt");
            OutputStream os = new FileOutputStream(file);
            os.write(data.getBytes());
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
