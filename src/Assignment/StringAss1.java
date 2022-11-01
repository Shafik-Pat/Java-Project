package Assignment;

import java.util.Scanner;

public class StringAss1 {
        public static void main(String[] args) {
            Scanner sc1 = new Scanner(System.in);

            System.out.println("ENTER STRING");
            String str = sc1.next();

            char []data= str.toCharArray();
            char ch1 = ' ',ch2=' ';
            int a;

            for ( a=0 ; a<data.length ; a++){
                ch1=data[0];
                ch2=data[data.length-1];
            }
            String newstr = ch2+str+ch1;
            System.out.println(newstr);
        }
    }

