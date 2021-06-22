package Part_5;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class CharIOExam1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(line);
    }
}
