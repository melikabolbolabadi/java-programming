public class main
{
    public static void main(String[] args)
    {

Read read=new Read();
Write write=new Write();

Thread t=new Thread(read , "read");
Thread t2=new Thread(write , "write");
t.start();
t2.start();
        System.out.println(read.getLength());
        System.out.println(read.getStr());

    }
}
