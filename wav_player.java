import javax.sound.sampled.*;  //главный пакет
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file=new File("src\\xxxtentacion - Snow.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip =AudioSystem.getClip();
        clip.open(audioStream);
        Scanner sc=new Scanner(System.in);
        clip.start();
        int a=sc.nextInt(); //Ввод с клавиатуры, для того, чтобы программа не завершилась(один из способов - сканер).
    }
}