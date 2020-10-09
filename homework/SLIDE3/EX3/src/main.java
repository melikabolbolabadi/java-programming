public class main
{
    public static void main(String[] args) throws CreatException
    {

Project project=new Project();
project.getstr();
project.check();
try {
    project.checkit(project.check());
}catch (CreatException e)
{
    e.printStackTrace();
}
    }
}
