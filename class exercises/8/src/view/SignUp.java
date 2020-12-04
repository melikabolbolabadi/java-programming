package view;

import Model.UserEntity;
import Model.UserService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JButton implements ActionListener
{
    JFrame jFrame=new JFrame("Sign UP");
    JLabel jLabel1,jLabel2,jLabel3,jLabel4,jLabel5;
    JTextField textField1,textField2,textField3,textField4,textField5;
    JButton button;
    public SignUp ()
    {
        jFrame.setSize(500,500);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

        jLabel1=new JLabel("id : ");
        jLabel2=new JLabel("full name : ");
        jLabel3=new JLabel("user name :");
        jLabel4=new JLabel("password : ");
        jLabel5=new JLabel("email : ");

        jLabel1.setBounds(50,50,200,30);
        jLabel2.setBounds(50,100,200,30);
        jLabel3.setBounds(50,150,200,30);
        jLabel4.setBounds(50,200,200,30);
        jLabel5.setBounds(50,250,200,30);

        textField1=new JTextField(3);
        textField2=new JTextField(20);
        textField3=new JTextField(10);
        textField4=new JTextField(5);
        textField5=new JTextField(30);

        textField1.setBounds(250,50,200,30);
        textField2.setBounds(250,100,200,30);
        textField3.setBounds(250,150,200,30);
        textField4.setBounds(250,200,200,30);
        textField5.setBounds(250,250,200,30);

        button=new JButton(" Sign Up ! ");
        button.setBounds(150,300,100,30);

        jFrame.add(jLabel1);
        jFrame.add(jLabel2);
        jFrame.add(jLabel3);
        jFrame.add(jLabel4);
        jFrame.add(jLabel5);
        jFrame.add(textField1);
        jFrame.add(textField2);
        jFrame.add(textField3);
        jFrame.add(textField4);
        jFrame.add(textField5);
        jFrame.add(button);

        button.addActionListener(this::actionPerformed);

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
if (e.getSource().equals(button))
{

    try {
        UserService.us().save(new UserEntity().setId(Integer.parseInt(textField1.getText())).setFullname(textField2.getText()).setUsername(textField3.getText()).
                setPassword(textField4.getText()).setEmail(textField5.getText()));
    } catch (Exception f) {
        System.out.println("save failed ! " + f.getMessage());
    }
}
    }
}
