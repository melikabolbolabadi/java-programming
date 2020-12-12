public class Main
{
    public static void main(String[] args)
    {
First first=new First();
Second second=new Second();
Thread th1=new Thread(first,"first");
Thread th2=new Thread(second,"second");
th1.start();
th2.start();
Ui ui=new Ui();
    }
}
