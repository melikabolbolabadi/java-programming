public class main
{
    public static void main(String[] args) throws CreatException
    {
int a;
Project project=new Project();
project.getstr();
System.out.println(project.check());
try {
    project.checkit(project.check());
}catch (CreatException e)
{
    e.printStackTrace();
}
    }
}
