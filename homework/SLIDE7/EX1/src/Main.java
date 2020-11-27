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
        System.out.println("enter current bill : ");
        double currvol = scanner.nextDouble();
        long currbill = scanner.nextLong();
        System.out.println("enter new volume 1)2G-1000T 2)5G-2000T 3)10G-5000T 4)25G-10000T : ");
        int n=scanner.nextInt();
        double newvol = 0;
        long newbill = 0;
        switch (n)
        {
            case 1:
                newvol=2.0;
                newbill=1000;
                break;
            case 2:
                newvol=5.0;
                newbill=2000;
                break;
            case 3:
                newvol=10.0;
                newbill=5000;
                break;
            case 4:
                newvol=25.0;
                newbill=10000;
                break;
        }

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
            UserService.us().ediit(new UserEntity().setId(id).setUsername(uname).setPassword(pass).setCurrvol(currvol).setnewvol(newvol).setCurrbill(currbill).setNewbill(newbill));
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
