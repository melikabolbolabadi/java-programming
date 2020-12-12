public class UserEntity
{

        public int id;
        public String username,password;

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

    }
