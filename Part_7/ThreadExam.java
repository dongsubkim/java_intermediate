package Part_7;

public class ThreadExam {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("*");
        MyThread t2 = new MyThread("-");

        t1.start();
        t2.start();

        System.out.println("Main end");
    }
}
