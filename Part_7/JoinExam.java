package Part_7;

public class JoinExam {
    public static void main(String[] args) {
        MyThread3 thread = new MyThread3();
        thread.start();

        System.out.println("start");
        try {
            thread.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
