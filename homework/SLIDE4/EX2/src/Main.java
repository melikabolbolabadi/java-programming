import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main
{
    public static <E> void main(String[] args)
    {
Add add=new Add();
add.addname();
add.addfamilyname();
add.addcode();
add.addage();
add.addgrade();
        List<E> arr=new ArrayList<E>();
arr.add((E) add.name);
arr.add((E) add.familyname);
arr.add((E) add.code);
arr.add((E) add.age);
arr.add((E) add.grade);
        Iterator itr=arr.iterator();

        System.out.println(" the user's informations: ");
        while (itr.hasNext())
        {
            System.out.println(itr.next()+"\n ");
        }
    }
}
