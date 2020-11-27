import model.UserEntity;
import model.UserService;

import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter id : ");
        int id = scanner.nextInt();
        System.out.println("enter user name : ");
        String uname = scanner.next();
        System.out.println("enter pass word : ");
        String pass = scanner.next();
        System.out.println("enter current volume : ");
        double currvol = scanner.nextDouble();
        System.out.println("enter new volume : ");
        double newvol = scanner.nextDouble();
        System.out.println("enter current bill : ");
        long currbill = scanner.nextLong();
        System.out.println("enter new bill : ");
        long newbill = scanner.nextLong();
        try {
            UserService.us().save(new UserEntity().setId(id).setUsername(uname).setPassword(pass).setCurrvol(currvol).setnewvol(newvol).setCurrbill(currbill).setNewbill(newbill));
        } catch (Exception e) {
            System.out.println("save failed ! " + e.getMessage());
        }


        System.out.println("enter new volume to edit : ");
        double upnewvol = scanner.nextDouble();
        System.out.println("enter new to edit : ");
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


        }
    }
}
