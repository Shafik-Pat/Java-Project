package Block;

import java.util.Scanner;

public class AtmSimulator {
    static Scanner sc1=new Scanner(System.in);
    static int accountBalance=5000;
    static int pin;

    static{
        System.out.println("Select Language:");
        System.out.println("1:English\t2:Marathi");
        int choice=sc1.nextInt();

        if(choice==1){
            System.out.println("Language Selected English");
        }
        else if(choice==2){
            System.out.println("Language Selected Marathi");
        }
        else{
            System.exit(0);
        }
    }

    static{
        System.out.println("Enter Pin");
        pin=sc1.nextInt();
    }

    public static void main(String[] args) {
        if (pin == 5432) {
            System.out.println("1:Withdraw Cash\n2:Check Balance\n3:Change Pin");
            int choice = sc1.nextInt();
            if (choice == 1) {
                System.out.println("Enter Amount");
                double Amt = sc1.nextDouble();
                withdraw(Amt);
            } else if (choice == 2) {
                checkBalance();

            } else if (choice == 3) {
                System.out.println("Enter New Pin");
                int newPin = sc1.nextInt();
                changePin(newPin);
            } else {
                System.out.println("Invalid Choice");
            }
        } else {
            System.out.println("Invalid Pin");
        }
    }

     static void withdraw(double amt) {
         if (amt <= accountBalance) {
             accountBalance -= amt;
             System.out.println(amt + " Rs. Debited From your Account");
         } else {
             System.out.println("Insufficient Balance");
         }
     }
         static void checkBalance(){
                System.out.println("Account Balance is:"+accountBalance);
            }

         static void changePin(int newPin){
             pin=newPin;
                System.out.println("Pin Changed");

            }
        }


