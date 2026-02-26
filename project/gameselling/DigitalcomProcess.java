package gameselling;

import java.util.Scanner;

public class DigitalcomProcess {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User us = new User();

        System.out.print(" give user id  :");
        String id = sc.next();
        System.out.print(" give   password  :");
        String pass = sc.next();


        if(!us.IsAuthenticated(id,pass)) {
            System.out.println("not valid user sorry ! first register , thanku ");
            System.out.println("you want to register or not (true /false) : ");
            boolean str = sc.nextBoolean();

            if (true) {
                System.out.println("RegisterUser \n ");
                System.out.print(" give user id to  add :");
                id = sc.next();
                System.out.print(" give   password to add :");
                pass = sc.next();
                us.addUser(id, pass);
                System.out.println("added succssfuly : ");

            } else {
                System.out.print("exit successfully");
                System.exit(100);
            }
        }
            int i =6;
            while( i != 4) {
                System.out.print("\n give your choice  :\n  1) RegisterUser \n 2) ViewGames  \n  3) searchByName \n  4) Exit\n  \ngive your choice : ");
                i =sc.nextInt();
                switch (i) {

                    case 1:{
                        System.out.print(" give new user id to  add :");
                        id = sc.next();
                        System.out.print(" give new user password to add :");
                        pass = sc.next();
                        us.addUser(id,pass);
                        System.out.println("successfuly done ");
                        break;}

                    case 2:{

                        System.out.println(GameService.viewAll());

                        break;}
                    case 3:

                        System.out.print(" give suthor name  :");
                        String auth = sc.next();
                        System.out.println(GameService.authorSearch(auth));

                        break;
                    case 4:
                        break;
                }
                if(i==4){
                    break;
                }
            }
            System.out.print("exit successfully");














//
//
//
//
//                    case 1:{
//        System.out.print(" give new user id to  add :");
//        id = sc.next();
//        System.out.print(" give new user password to add :");
//        pass = sc.next();
//        us.addUser(id,pass);
//        break;}
//
//                    case 2:{
////                    System.out.print(" give user id to  add :");
////                      id = sc.next();
////                    System.out.print(" give   password to add :");
////                     pass = sc.next();
////                    if(us.IsAuthenticated(id,pass)){
//        System.out.println(com.GameService.viewAll());
////                    }else{
////                        System.out.println("not valid user sorry ! first register , thanku ");
////                    }
//        break;}
//                    case 3:
////                    System.out.print(" give user id to  add :");
////                     id = sc.next();
////                    System.out.print(" give   password to add :");
////                     pass = sc.next();
////                    if(us.IsAuthenticated(id,pass)){
//                            System.out.print(" give suthor name  :");
//    String auth = sc.next();
//                        System.out.println(com.GameService.authorSearch(auth));
////                    }else{
////                        System.out.println("not valid user sorry ! first register , thanku ");
////                    }
//                        break;
//                    case 4:
//                            break;
//}
//                if(i==4){
//        break;
//        }
//        }
//        System.out.print("exit successfully");
//        }else{
//                System.out.println("not valid user sorry ! first register , thanku ");
//            System.out.println("you want to register or not (true /false) : ");
//boolean str =sc.nextBoolean();
//            if(true){
//                    System.out.println("RegisterUser \n ");
//                System.out.print(" give user id to  add :");
//id = sc.next();
//                System.out.print(" give   password to add :");
//pass = sc.next();
//                us.addUser(id,pass);
//            }
//                    else{
//                    System.out.print("exit successfully");
//                System.exit(100);
//            }
//                    }
//
//
//
//int i =6;
//        while( i != 4) {
//        System.out.print("\n give your choice  :\n  1) RegisterUser \n 2) ViewGames  \n  3) searchByName \n  4) Exit\n  \ngive your choice : ");
//i =sc.nextInt();
//            switch (i) {
//
//        case 1:{
//        System.out.print(" give new user id to  add :");
//id = sc.next();
//                    System.out.print(" give new user password to add :");
//pass = sc.next();
//                us.addUser(id,pass);
//                break;}
//
//                        case 2:{
////                    System.out.print(" give user id to  add :");
////                      id = sc.next();
////                    System.out.print(" give   password to add :");
////                     pass = sc.next();
////                    if(us.IsAuthenticated(id,pass)){
//                        System.out.println(com.GameService.viewAll());
////                    }else{
////                        System.out.println("not valid user sorry ! first register , thanku ");
////                    }
//        break;}
//        case 3:
////                    System.out.print(" give user id to  add :");
////                     id = sc.next();
////                    System.out.print(" give   password to add :");
////                     pass = sc.next();
////                    if(us.IsAuthenticated(id,pass)){
//        System.out.print(" give suthor name  :");
//String auth = sc.next();
//                        System.out.println(com.GameService.authorSearch(auth));
////                    }else{
////                        System.out.println("not valid user sorry ! first register , thanku ");
////                    }
//        break;
//        case 4:
//        break;
//        }
//        if(i==4){
//        break;
//        }
//        }
//        System.out.print("exit successfully");
//        System.exit(100);
//
//    }

}}
