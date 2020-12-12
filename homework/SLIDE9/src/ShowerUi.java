import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowerUi extends JButton implements ActionListener
{
    JFrame jFrame=new JFrame("show infos");
    JLabel jLabel1,jLabel2,jLabel3;

    public ShowerUi()
    {
        Ui ui=new Ui();
        jFrame.setSize(500,300);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

        jLabel1=new JLabel(ui.text1.getText());
        jLabel2=new JLabel(ui.text2.getText());
        jLabel3=new JLabel(ui.text3.getText());
        jLabel1.setBounds(50,50,200,30);
        jLabel2.setBounds(50,100,200,30);
        jLabel3.setBounds(50,150,200,30);

        jFrame.add(jLabel1);
        jFrame.add(jLabel2);
        jFrame.add(jLabel3);


    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
