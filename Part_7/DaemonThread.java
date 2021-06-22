package Part_7;

public class DaemonThread implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Daemon Thread is running");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonThread());
        thread.setDaemon(true);
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Main end");
    }
}
