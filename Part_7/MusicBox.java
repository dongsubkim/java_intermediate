package Part_7;

public class MusicBox {
    public void playMusicA() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Funk music");
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public void playMusicB() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Sad music");
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public void playMusicC() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Caffe music");
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
