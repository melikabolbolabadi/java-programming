package Model;

import java.util.List;

public class UserService {
    private UserService () { }
    private static UserService userService = new UserService ();
    public static UserService us () { return userService; }


    public void save(UserEntity userEntity) throws Exception {
        UserRepository userRepository = new UserRepository();
        userEntity.setUsername(userEntity.getUsername());
        userEntity.setPassword(userEntity.getPassword());

        userRepository.insertTable(userEntity);
        userRepository.commit();

    }

    public void ediit(UserEntity userEntity) throws Exception {
        UserRepository userRepository = new UserRepository();
        userEntity.setUsername(userEntity.getUsername());
        userEntity.setPassword(userEntity.getPassword());

        userRepository.update(userEntity);
        userRepository.commit();
    }

    public void deletee(int id) throws Exception
    {
        UserRepository userRepository=new UserRepository ();
        userRepository.delete (id);
        userRepository.commit ();
    }

    public List <UserEntity> issuance() throws Exception{
        List <UserEntity> userEntityList;
        UserRepository userRepository=new UserRepository ();
        userEntityList=userRepository.select();

        return userEntityList;
    }
}
