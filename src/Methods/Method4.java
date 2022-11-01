package Methods;

public class Method4 {
    public static void triangle(double b,double h){
        double tri=0.5*b*h;
        System.out.println("Area of Triangle is:"+tri);
    }

    public static void circle(double r){
        double cir=3.14*r*r;
        System.out.println("Area of Circle is:"+cir);
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        triangle(5,10);
        circle(5);
    }
}
