import java.util.Scanner;
public class Add <E> implements addmethods
{
E name,familyname,code;
    E age,grade;
    Scanner scanner=new Scanner(System.in);
    @Override
    public void addname() {
        System.out.println("NAME: ");
        this.name= (E) name;
        name= (E) scanner.next();
    }

    @Override
    public void addfamilyname() {
        System.out.println("FAMILY NAME: ");
        this.familyname= (E) familyname;
        familyname= (E) scanner.next();
    }

    @Override
    public void addcode() {
        System.out.println("CODE: ");
        this.code= (E) code;
        code= (E) scanner.next();
    }

    @Override
    public void addage() {
        System.out.println("AGE: ");
        this.age=age;
        age=(E) scanner.next();
    }

    @Override
    public void addgrade() {
        System.out.println("GRADE: ");
        this.grade=grade;
        grade= (E) scanner.next();
    }
}
