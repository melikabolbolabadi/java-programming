package Model;
public class UserEntity
{

public int id;
public String fullname, username,password ,email;

public UserEntity setId(int id)
{
    this.id=id;
    return this;
}

public int getId()
{
    return id;
}

    public UserEntity setFullname(String fullname)
    {
        this.fullname=fullname;
        return this;
    }

    public String getFullname()
    {
        return fullname;
    }

    public UserEntity setUsername(String username)
    {
        this.username=username;
        return this;
    }

    public String getUsername()
    {
        return username;
    }

    public UserEntity setPassword(String password)
    {
        this.password=password;
        return this;
    }

    public String getPassword()
    {
        return password;
    }

    public UserEntity setEmail(String email)
    {
        this.email=email;
        return this;
    }

    public String getEmail()
    {
        return email;
    }
}
