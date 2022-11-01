package Methods;

public class Method5 {
    public static void calculateBill(int qty,double price,double transportCharges){
        double total=qty*price;
        double gstAmount=total+total*0.05;
        double finalAmount=gstAmount+transportCharges;

        System.out.println("Total Amount is:"+total);
        System.out.println("GST Amount is:"+gstAmount);
        System.out.println("Final Amount is:"+finalAmount);
    }

    public static void main(String[] args) {
        calculateBill(5,200,40);
    }
}
