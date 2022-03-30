import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
  
    Score(String username, int Score)
    {

        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,200,300,250);
        add(l1);

        JLabel l2 = new JLabel("Thank you !!! " + username + " for playing Quiz");
        l2.setBounds(210,30,700,30);
        l2.setFont(new Font("Railway", Font.PLAIN,26));
        add(l2);

        JLabel l3 = new JLabel("Your Score is " +Score);
        l3.setBounds(390,200,300,30);
        l3.setFont(new Font("Jokerman", Font.PLAIN,26));
        l3.setForeground(new Color(199,21,133));
        add(l3);

        JButton b1 = new JButton("Play Again");
        b1.setBackground(Color.blue);
        b1.setForeground(Color.white);
        b1.setBounds(420,270,120,30);
        b1.addActionListener(this);
        add(b1);

    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new SwapQuiz().setVisible(true);
    }
    public static void main(String args[])
    {
        new Score("",0).setVisible(true);;
    } 
}
