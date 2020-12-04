package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JButton implements ActionListener
{
public JFrame jFrame=new JFrame("Sign in");
public JLabel jLabel1,jLabel2;
    public JTextField    textField1=new JTextField(15);
    public JTextField   textField2=new JTextField(5);
public JButton button;
public Login ()
{
    jFrame.setSize(500,300);
    jFrame.setLayout(null);
    jFrame.setVisible(true);

    jLabel1=new JLabel("User neme: ");
    jLabel2=new JLabel("password: ");

    button=new JButton(" DONE ! ");

    jLabel1.setBounds(50,50,200,30);
    jLabel2.setBounds(50,100,200,30);

    textField1.setBounds(250,50,200,30);
    textField2.setBounds(250,100,200,30);
    button.setBounds(150,150,100,30);


    jFrame.add(jLabel1);
    jFrame.add(jLabel2);
    jFrame.add(textField1);
    jFrame.add(textField2);
    jFrame.add(button);
    button.addActionListener(this::actionPerformed);

}
    @Override
    public void actionPerformed(ActionEvent e)
    {
if (e.getSource().equals(button))
{
    System.out.println("DONE ! seccessfull ! ");
}
    }
}
