package org.example.bean.Interface;
import org.example.bean.service.library;
import java.util.Scanner;

public class main {


    static void main(String[] args) {
        System.out.println(" give your option for operation :");
        Scanner sc= new Scanner(System.in);
        library li= new library();
        System.out.println("1. from insert  \n 2. read \n 3. update\n 4. delete \n 5 exit");

while(true){
    System.out.print("give your choice :");
    int ch = sc.nextInt();
        switch (ch){
            case 1:
                li.create();
                break;
            case 2:li.read();
                break;
            case 3:li.update();
                break;
            case 4:li.delete();
                break;
            case 5: System.exit(0);
        }}
    }
}
