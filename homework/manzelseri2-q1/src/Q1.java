import java.util.Scanner;
class Square
{
    int side;
    int primeter()
    {
        return 4*side;
    }
    int area()
    {
        return side*side;
    }
}
 class Rectangle
 {
     int length,width;
     int primeter()
     {
         return (length+width)*2;
     }
     int area()
     {
         return length*width;
     }
 }
public class Q1
{
public static void main(String[] args)
{
Scanner mi=new Scanner(System.in);
Square square =new Square();
Rectangle rectangle=new Rectangle();
System.out.println("enter side of square: ");
square.side=mi.nextInt();
System.out.println("enter length and width of rectangle : ");
rectangle.length=mi.nextInt();
rectangle.width=mi.nextInt();
    System.out.println("for the square: primeter= "+square.primeter()+" & area= "+square.area());
    System.out.println("for the rectangle: primeter= "+rectangle.primeter()+" & area= "+rectangle.area());
}
}
