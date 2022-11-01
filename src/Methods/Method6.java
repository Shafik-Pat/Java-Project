package Methods;

public class Method6 {
    static void convertKMtoMeter(double kMeter){
        double meter=kMeter*1000;
        System.out.println("Kilometer to Meter is:"+meter);
    }

    static void convertMetertoKM(double meter){
        double kMeter=meter/1000;
        System.out.println("Meter to Kilometer is:"+meter);
    }

    public static void main(String[] args) {
        convertKMtoMeter(5);
        convertMetertoKM(2000);
    }
}
