package Block;

public class BlockDemo2 {

    static int j=40;
    static int k=80;

    static{
        int j=70;
        System.out.println(j+k);
    }

    static{
        int k=100;
        System.out.println(k+j);
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}
