import java.util.Scanner;

public class Add<E> implements AddMethods
{
    public E name,faname,stno;
    Scanner scanner=new Scanner(System.in);
    @Override
    public void setname() {
        name= (E) scanner.next();
    }

    @Override
    public void setfathername() {
        faname= (E) scanner.next();
    }

    @Override
    public void setstuno() {
        stno= (E) scanner.next();
    }

    @Override
    public E getname() {
        return name;
    }

    @Override
    public E getfathername() {
        return faname;
    }

    @Override
    public E getstuno() {
        return stno;
    }
}
