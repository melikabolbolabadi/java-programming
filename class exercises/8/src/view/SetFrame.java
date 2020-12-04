package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetFrame extends JButton implements ActionListener
{
public JFrame jFrame=new JFrame("account login");
JButton button1,button2;
public SetFrame()
{
    jFrame.setSize(500,300);
    jFrame.setLayout(null);
    jFrame.setVisible(true);
    button1=new JButton("Sign in");
    button2=new JButton("Sign up");

    button1.setBounds(70,100,100,50);
    button2.setBounds(170,100,100,50);

    jFrame.add(button1);
    jFrame.add(button2);

    button1.addActionListener((ActionListener) this);
    button2.addActionListener((ActionListener) this);
}

    @Override
    public void actionPerformed(ActionEvent e) {
if (e.getSource().equals(button1))
{
Login login=new Login();
}
if ((e.getSource().equals(button2)))
{
    SignUp signUp =new SignUp();
}
    }
}
