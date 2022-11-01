package OOps;

public class MainApp1 {
    public static void main(String[] args) {
        Laptop l1=new Laptop();
        l1.getInfo();
        Laptop.h1.getType();//for non-static object of hdd use laptop object l1.
    }
}
