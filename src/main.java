import javax.swing.*;
import java.awt.*;


public class Main{
    public static void main(String[] args){
        JFrame frame =new JFrame();
        frame.setVisible(true);
        frame.setBounds(1920/2-375-250,1080/2-375,750,750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JPanel redPanel=new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        frame.add(redPanel);

        JPanel bluePanel=new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        frame.add(bluePanel);

        JPanel greenPanel=new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        frame.add(greenPanel);
    }
}