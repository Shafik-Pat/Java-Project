package Array;

import java.util.Scanner;

public class ArrayDemo3 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter no. of courses:");
        int size=sc1.nextInt();

        String[] courses=new String[size];

        System.out.println("Enter Course Names:");
        for (int a=0;a<size;a++){
           courses[a]=sc1.next();
        }

        System.out.println("Selected Corses");
        for (int a=0;a<size;a++){
            System.out.println(courses[a]);
        }

    }
}
