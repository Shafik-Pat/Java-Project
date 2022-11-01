package Array;

import java.util.Scanner;

public class ArrayDemo4 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter No of Subjects:");
        int count=sc1.nextInt();

        double[] marks=new double[count];
        System.out.println("Enter Marks of each subject:");
        for(int a=0;a<count;a++){
            marks[a]=sc1.nextDouble();
        }

        double sum=0.0;
        for(int a=0;a<count;a++){
            sum+=marks[a];
        }
        System.out.print("Total Marks Are:");
        System.out.println(sum);

        double per=sum/count;
        System.out.print("Percentage Are:");
        System.out.println(per);
    }
}
