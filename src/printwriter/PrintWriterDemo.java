package printwriter;

import java.io.*;

class PrintWriterDemo {
    public static void main(String[] args) {
        String data = "This is line 1\nThis is line 2\n";
        try {
            File file = new File("./src/data.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(data);

            bw.close();
            fw.close();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
