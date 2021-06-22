package Part_5;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteExam1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("Part_5/ByteExam1.java");
            fos = new FileOutputStream("byte.txt");

            int readDate = -1;
            while ((readDate = fis.read()) != -1) {
                fos.write(readDate);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
