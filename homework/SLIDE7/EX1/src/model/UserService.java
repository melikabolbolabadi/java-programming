package model;

import java.util.List;

public class UserService
{
    private UserService () { }
    private static UserService userService = new UserService ();
    public static UserService us () { return userService; }


    public void save(UserEntity userEntity) throws Exception {
        UserRepos userRepository = new UserRepos();

        userEntity.setCurrvol(userEntity.getCurrvol()+userEntity.getNewvol());
        userEntity.setCurrbill(userEntity.getCurrbilll()+userEntity.getNewbill());

        userRepository.insertTable(userEntity);
        userRepository.commit();

    }

    public void ediit(UserEntity userEntity) throws Exception {
        UserRepos userRepository = new UserRepos();

        userEntity.setCurrvol(userEntity.getCurrvol()+userEntity.getNewvol());
        userEntity.setCurrbill(userEntity.getCurrbilll()+userEntity.getNewbill());

        userRepository.update(userEntity);
        userRepository.commit();
    }

    public void deletee(int id) throws Exception
    {
        UserRepos userRepository=new UserRepos ();
        userRepository.delete (id);
        userRepository.commit ();
    }


}
