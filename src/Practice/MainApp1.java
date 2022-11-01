package Practice;


import java.util.Scanner;
public class MainApp1 {
            public static void main(String[] args) {
                Scanner sc1=new Scanner(System.in);


                System.out.println("Enter what you want:");
                System.out.println("Enter item:1:MOBILE\n2:AC\n3:REFRIGERATOR\n4:AIR PODS");
                int choice=sc1.nextInt();
                Demo1 d1=new Demo1();

                if(choice==1){
                    d1.mobile();
                }else if (choice==2){
                    d1.ac();
                }else if (choice==3){
                    d1.refrigerator();
                }
                else if (choice==4){
                    d1.airPods();
                }else {
                    System.out.println("Invalid Choice");
                }
            }
    }

