import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    JButton b1,b2;
    String username;
    Rules(String username)
    {
        this.username = username;
        setBounds(460,200,800,500);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel l1 = new JLabel("Welcome " + username + " to SwapQuiz");
        l1.setFont(new Font("Georgia", Font.BOLD,28));
        l1.setForeground(new Color(30,144,255));
        l1.setBounds(20,0,600,50);
        add(l1);

        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Tahoma", Font.PLAIN,16));
        l2.setBounds(20,50,650,250);
        l2.setText(
                "<html>"+
                "Rules :-" + "<br><br>" +
                "1. Do not look outside." + "<br><br>" +
                "2. Keep Concerntrate on Quiz." + "<br><br>" +
                "3. Don't dare to do copy." + "<br><br>" +
                "4. Give answers within time." + "<br><br>" +
                "5. You can use Lifeline once." + "<br><br>" +
                "6. All the best." + "<br><br>" +
            "<html>"
        );
        add(l2);

        b1 = new JButton("Back");
        b1.setBounds(150,330,100,30);
        b1.setFont(new Font("Tahoma", Font.PLAIN,16));
        b1.setBackground(Color.red);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Start");
        b2.setBounds(550,330,100,30);
        b2.setFont(new Font("Tahoma", Font.PLAIN,16));
        b2.setBackground(Color.GREEN);
        b2.setForeground(Color.red);
        b2.addActionListener(this);
        add(b2);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
            this.setVisible(false);
            new SwapQuiz().setVisible(true);
        }
        else if(ae.getSource() == b2)
        {
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }


    public static void main(String args[])
    {

        new Rules("");
    }
}
