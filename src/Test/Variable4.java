package Test;

public class Variable4 {
    public static void main(String[] args) {
        int qty=5;
        double price=200;

        //Total Amount
        double total=qty*price;

        //Apply 10per Discount
        double disAmt=total*0.1;

        //After Discount
        double finalAmt=total-disAmt;

        System.out.println("Total Amount Is:"+total);
        System.out.println("Final Amount Is:"+finalAmt);

    }
}
