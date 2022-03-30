import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SwapQuiz extends JFrame implements ActionListener{
    JButton b1, b2;
    JTextField t1;
    SwapQuiz()
    {
        setBounds(220,200,1200,500);  //dleft, //dup , //length, //width
        getContentPane().setBackground(Color.white);
        setLayout(null);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("login.jpeg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0,0,600,500);
        add(l1);

        JLabel l2 = new JLabel("SwapQuiz");
        l2.setFont(new Font("Georgia", Font.BOLD, 40));
        l2.setForeground(Color.BLUE);
        l2.setBounds(825, 40, 330,50);
        add(l2);

        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Georgia", Font.BOLD, 18));
        l3.setForeground(Color.BLUE);
        l3.setBounds(850, 130, 300,20);
        add(l3);

        t1 = new JTextField();
        t1.setBounds(780, 180, 280, 30);
        t1.setFont(new Font("Times New Roman", Font.BOLD,28));
        add(t1);

        b1 = new JButton("Rules");
        b1.setBounds(780, 270, 120, 30);
        b1.setFont(new Font("Tahoma", Font.PLAIN,16));
        b1.setBackground(Color.GREEN);
        b1.setForeground(Color.red);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Exit");
        b2.setBounds(936, 270, 120, 30);
        b2.setFont(new Font("Tahoma", Font.PLAIN,16));
        b2.setBackground(Color.red);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
       if(ae.getSource()==b1)
       {
            String name = t1.getText();
            this.setVisible(false);
            new Rules(name);
       } 
       else{
           System.exit(0);
       }
    }
    public static void main(String agrs[])
    {
        new SwapQuiz();
    }
}