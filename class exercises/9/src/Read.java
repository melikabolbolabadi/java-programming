import java.io.FileInputStream;
import java.io.IOException;

public class Read extends Thread
{
    public int test;
   public String str="";
 public   int length=0;
    public void Run()
    {
        FileInputStream  input=null;

        try
        {
            input=new FileInputStream("MyFile.txt");

            while ((test=input.read()) != -1)
            {
                str += (char) test;
                test=input.read();
                length++;
            }
            input.close();

        }catch (IOException e)
            {
            System.out.println(e.getMessage());
            }

    }
    public Read setStr(String str)
    {
     this.str=str;
     return this;
    }

    public String getStr(){return str; }

    public Read setLength(int length)
    {
        this.length=length;
        return this;
    }

    public int getLength(){return length; }
}
