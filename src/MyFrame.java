import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton btn;
    JPanel panel;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setBounds(255,255,500,500);
        this.setLayout(null);

        btn=new JButton();
        btn.setBounds(200,100,100,50);
        this.add(btn);
        btn.addActionListener(this);
        btn.setText("I'm button!");
        btn.setFocusable(false);
        btn.setFont(new Font("Comic Sans",Font.ITALIC,14 ));
        btn.setForeground(new Color(0,166,0));

        panel=new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setBounds(0,300,500,100);
        panel.setVisible(false);
        this.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            System.out.println("Poo");
            panel.setVisible(true);
        }
    }
}
