import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        Add add=new Add();
        System.out.println("name : ");
        add.setname();
        System.out.println("father name : ");
        add.setfathername();
        System.out.println("student number : ");
        add.setstuno();
        System.out.println("ENTER 5 LESSON'S GRADE : ");
        int grade[]=new int[5];
        List<Integer> list = new ArrayList<>();
        for (int i: grade)
        {
            i=scanner.nextInt();
            list.add(i);
        }

        System.out.println("name : "+add.getname()+"\nfather name : "+add.getfathername()+"\nstudent number : "+add.getstuno());
        System.out.println("5 lesson grades: ");
        Iterator itr=list.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next()+",,");
        }
    }
}
