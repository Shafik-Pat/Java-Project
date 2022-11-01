package Scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter name");
        String subject=sc1.nextLine();
        System.out.println("Subject is:"+subject);

    }
}
