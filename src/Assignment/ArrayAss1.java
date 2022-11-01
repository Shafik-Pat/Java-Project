package Assignment;

import java.util.Scanner;

public class ArrayAss1 {
    public static void main(String[] args) {

        Scanner sc1=new Scanner(System.in);
        int[] array={10,20,30,40,50};
        System.out.println("Enter a Element");
        int num=sc1.nextInt();

        for (int i=0;i<array.length;i++){
            if(array[i]==num){
                System.out.println(i);
            }
        }

    }
}
