import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;

public class MAIN
{
public static void main(String[] args)
{
    Scanner scanner=new Scanner(System.in);

    System.out.println("enter student name: ");
        String name=scanner.next();
        System.out.println("enter student number: ");
        int number=scanner.nextInt();
        System.out.println("enter student average: ");
        int average=scanner.nextInt();

    Map<Integer,Info> map=new HashMap<Integer, Info>();
    Info in = new Info(number,average,name);
     map.put(1,in);

    for (Map.Entry<Integer,Info> m: map.entrySet())
    {
        System.out.println(" student "+m.getKey()+" details: ");
        Info inf=m.getValue();
        System.out.println(inf.name+"\n"+inf.stuno+"\n"+inf.stuave);
    }
}
}
