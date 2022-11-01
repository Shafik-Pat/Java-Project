package Test;

public class Variable7 {
    public static void main(String[] args) {
        int p=15,q=25,r=35,s=45;
        System.out.println(p+"\t"+q+"\t"+r+"\t"+s);
        q=s;
        p=r;
        r=q;
        s=p;
        System.out.println(p+"\t"+q+"\t"+r+"\t"+s);

    }
}
