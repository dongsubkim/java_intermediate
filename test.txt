package Part_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CharIOExam2 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            br = new BufferedReader(new FileReader("Part_5/CharIOExam2.java"));
            pw = new PrintWriter(new FileWriter("test.txt"));
            String line = null;
            while ((line = br.readLine()) != null) {
                pw.println(line);
            }
        } catch (Exception e) {
        } finally {
            pw.close();
            try {
                br.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
