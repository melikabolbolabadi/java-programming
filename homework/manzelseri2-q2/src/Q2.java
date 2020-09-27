import java.util.Scanner;
class Gpa
{
    Scanner mi=new Scanner(System.in);
    int n;
    public int tedaddars()
    {
      return  n=mi.nextInt();
    }
    int gradesum=0,coesum=0;
    void recieve(int[] lessgrade, int[] lesscoe,int coesum,int gradesum,int ave)
    {
        gradesum=0;coesum=0;
        lessgrade=new int[n];
        lesscoe=new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("enter grade of lesson "+i+" :");
            lessgrade[i]=mi.nextInt();
            System.out.println("enter Coefficient of this lesson: ");
            lesscoe[i]=mi.nextInt();
            coesum+=lesscoe[i];
            gradesum+=(lesscoe[i]*lessgrade[i]);
        }
        ave=gradesum/coesum;
        System.out.println("your average is : "+ave);
        if (ave<14.00) System.out.println("fail! ");
    else System.out.println("not fail !");
    }

}

public class Q2
{
    public static void main(String[] args)
    {
        Scanner mi=new Scanner(System.in);
        Gpa gpa=new Gpa();
        System.out.println("how many lessons do you have? ");
        int n=gpa.tedaddars();
        int[] lesscoe=new int[n];int[] lessgrade=new int[n];
        int coesum=0,gradesum=0,ave=0;
        gpa.recieve(lessgrade,lesscoe,coesum,gradesum,ave);


    }
}
