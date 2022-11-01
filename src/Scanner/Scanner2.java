package Scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter first num:");
        int num1=sc1.nextInt();

        System.out.println("Enter second num:");
        int num2=sc1.nextInt();

        addition(num1,num2);
        subtraction(num1,num2);
        multiplication(num1,num2);
        division(num1,num2);
    }

    public static void addition(int n1,int n2){
        int add=n1+n2;
        System.out.println("Addition is:"+add);
    }

    public static void subtraction(int n1,int n2){
        int sub=n1-n2;
        System.out.println("Subtraction is:"+sub);
    }

    public static void multiplication(int n1,int n2){
        int mul=n1*n2;
        System.out.println("Multiplication is:"+mul);
    }

    public static void division(int n1,int n2){
        int div=n1/n2;
        System.out.println("Division is:"+div);
    }
}
