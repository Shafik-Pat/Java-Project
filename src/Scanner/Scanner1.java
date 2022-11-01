package Scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter your Name:");
        String s=sc1.next();
        System.out.println("Hello "+s);
    }
}
