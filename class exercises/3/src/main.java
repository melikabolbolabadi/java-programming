public class main
{

    public static void main(String[] args ) throws SearchException
    {
        int a = 0;
        project project=new SearchUsers();
        project.getuser1info();
        project.getuser2info();
        if (project.searchexception(a)==2) throw new SearchException("duplicate user! ");
        else  System.out.println("fine it is registered! ");
    }
}
