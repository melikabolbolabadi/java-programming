public class BuilderCreat
{
    private String username;
    private String realname;
    private String password;
    private String address;
    private String grade;
    private String phonenumber;
    private int age;
public static class Builder
{
    private String username;
    private String realname;
    private String password;
    private String address;
    private String grade;
    private String phonenumber;
    private int age;
    public Builder(String username)
    {
        this.username=username;
    }
    public Builder setname(String realname)
    {
        this.realname=realname;
        return this;
    }
    public Builder setpass(String password)
    {
        this.password=password;
        return this;
    }
    public Builder setaddress(String address)
    {
        this.address=address;
        return this;
    }
    public Builder setgrade(String grade)
    {
        this.grade=grade;
        return this;
    }
    public Builder setphone(String phonenumber)
    {
        this.phonenumber=phonenumber;
        return this;
    }
    public Builder setage(int age)
    {
        this.age=age;
        return this;
    }
    public BuilderCreat Build()
    {
       BuilderCreat builderCreat=new BuilderCreat();
       builderCreat.username=this.username;
       builderCreat.realname=this.realname;
       builderCreat.password=this.password;
       builderCreat.grade=this.grade;
       builderCreat.address=this.address;
       builderCreat.phonenumber=this.phonenumber;
       builderCreat.age=this.age;
       return  builderCreat;
    }
}
}
