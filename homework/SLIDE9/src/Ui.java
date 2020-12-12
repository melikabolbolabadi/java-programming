import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ui extends JButton implements ActionListener
{
JFrame frame=new JFrame("Information");
JLabel label1,label2,label3;
JTextField text1,text2,text3;
JButton button;

public Ui()
{
    frame.setSize(500,300);
    frame.setLayout(null);
    frame.setVisible(true);

    label1=new JLabel("id:");
    label2=new JLabel("user name  : ");
    label3=new JLabel("password : ");
    label1.setBounds(50,50,200,30);
    label2.setBounds(50,100,200,30);
    label3.setBounds(50,150,200,30);

    text1=new JTextField(10);
    text2=new JTextField(5);
    text3=new JTextField(30);
    text1.setBounds(250,50,200,30);
    text2.setBounds(250,100,200,30);
    text3.setBounds(250,150,200,30);

    button=new JButton("regist!");
    button.setBounds(150,300,100,30);

    frame.add(label1);
    frame.add(label2);
    frame.add(label3);
    frame.add(text1);
    frame.add(text2);
    frame.add(text3);
    frame.add(button);

    button.addActionListener(this::actionPerformed);
}
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource().equals(button))
        {
            System.out.println(" registered ! ");
        }

    }
}
