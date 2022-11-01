package Assignment;

import java.util.Scanner;

public class StringAss2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a String");
        String s1 = sc1.nextLine();
        String[] s2=s1.split(" ");
        System.out.println("Length of total strings is:"+s2.length);
    }
}
