import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write extends Thread
{
    public void Run()
    {
        Read read=new Read();
        FileOutputStream output=null;

        byte tx[] = new byte[read.getLength()];
        for (int i = 0; i < read.getLength() ; i++)
        {
            tx[i] = (byte) read.getStr().charAt(i);
        }

        try
        {
            output=new FileOutputStream("MyFileOut");
            output.write(tx);
            output.close();

        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
