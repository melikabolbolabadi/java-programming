package model;
public class UserEntity
{

    public int id;
    public String username,password;
    public double currvol,newvol;
    public long currbill,newbill;

    public UserEntity setId(int id)
    {
        this.id=id;
        return this;
    }

    public int getId()
    {
        return id;
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

    public UserEntity setCurrvol(double currvol)
    {
        this.currvol=currvol;
        return this;
    }

    public double getCurrvol()
    {
        return currvol;
    }


    public UserEntity setnewvol(double newvol)
    {
        this.newvol=newvol;
        return this;
    }

    public double getNewvol()
    {
        return newvol;
    }

    public UserEntity setCurrbill(long currbill)
    {
        this.currbill=currbill;
        return this;
    }

    public long getCurrbilll()
    {
        return currbill;
    }

    public UserEntity setNewbill(long newvol)
    {
        this.newvol=newvol;
        return this;
    }

    public long getNewbill()
    {
        return newbill;
    }
}
