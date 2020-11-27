import Model.UserEntity;
import Model.UserService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter id : ");
        int id = scanner.nextInt();
        System.out.println("enter full name : ");
        String fname = scanner.next();
        System.out.println("enter user name : ");
        String uname = scanner.next();
        System.out.println("enter pass word : ");
        String pass = scanner.next();
        System.out.println("enter email : ");
        String email = scanner.next();

        try {
            UserService.us().save(new UserEntity().setId(id).setFullname(fname).setUsername(uname).setPassword(pass).setEmail(email));
        } catch (Exception e) {
            System.out.println("save failed ! " + e.getMessage());
        }


        System.out.println("enter user name to edit : ");
        String upuname = scanner.next();
        System.out.println("enter pass word to edit : ");
        String uppass = scanner.next();
        try {
            UserService.us().ediit(new UserEntity().setId(id).setFullname(fname).setUsername(upuname).setPassword(uppass).setEmail(email));
        } catch (Exception e) {
            System.out.println("edit failed ! " + e.getMessage());
        }

        System.out.println("enter id to delete row : ");
        {
            int reid = scanner.nextInt();
            try {
                UserService.us().deletee(reid);
            } catch (Exception e) {
                System.out.println("delete failed ! " + e.getMessage());
            }

            try {
                List<UserEntity> userEntityList = UserService.us().issuance();
                for (UserEntity userEntity : userEntityList) {
                    System.out.println(userEntity.getId());
                    System.out.println(userEntity.getFullname());
                    System.out.println(userEntity.getUsername());
                    System.out.println(userEntity.getPassword());
                    System.out.println(userEntity.getEmail());
                }
            } catch (Exception e) {
                System.out.println("issuance faled ! " + e.getMessage());
            }
        }
    }
}