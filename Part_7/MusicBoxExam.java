package Part_7;

public class MusicBoxExam {
    public static void main(String[] args) {
        MusicBox box = new MusicBox();

        MusicPlayer a = new MusicPlayer(1, box);
        MusicPlayer b = new MusicPlayer(2, box);
        MusicPlayer c = new MusicPlayer(3, box);

        a.start();
        b.start();
        c.start();
    }
}
