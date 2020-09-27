import java.util.Scanner;
public class Q3
{
    public static void main(String[] args )
    {
        Scanner mi=new Scanner(System.in);
       int e=3,f=4;
        System.out.println("enter a & b for this equation==> ax+by="+e+" :");
        int a=mi.nextInt(),b=mi.nextInt();
        System.out.println("enter c & d for this equation==> cx+dy="+f+" :");
        int c=mi.nextInt(),d=mi.nextInt();

    if (a/c==b/d)
    {
        if (a/c==e/f)
            System.out.println("INFINIT ANSWER !!!! ");
        else
            System.out.println("NO ANSWER !!! ");
    }
    else
    {
        System.out.println(" X = "+(e*d-b*f)/(a*d-b*c));
        System.out.println(" Y = "+(a*f-e*c)/(a*d-b*c));
    }

    }
}
