public class Check extends User
{
    public void checkname() throws CreatException
    {
        if (name1.equals(name)) System.out.println("alright! ");
        else throw new CreatException("doesnt match! ");
    }
    public void checkusername() throws CreatException
    {
        if (username1.equals(username)) System.out.println("alright! ");
       else throw new CreatException("doesnt match! ");
    }
    public void checkpassword() throws CreatException
    {
        if (password1.equals(password))
            System.out.println("alright! ");
        else throw new CreatException("doesnt match! ");
    }

}
