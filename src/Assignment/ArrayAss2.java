package Assignment;

public class ArrayAss2 {
    public static void main(String[] args) {
                int []arr1 = {10,20,30};
                int []arr2 = {40,50,60};

                int a1 = arr1.length;
                int b1 = arr2.length;

                int []result = new int[a1+b1];

                for (int a=0; a<a1; a++){

                    result[a]=arr1[a];
                }
                for (int b=0; b<b1 ; b++){
                    result[a1+b]=arr2[b];
                }
        System.out.print("The Result is:");
                for (int c=0 ; c<result.length ; c++){
                    System.out.print(" "+result[c]);
                }
            }
        }
