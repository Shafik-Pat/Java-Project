package Array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        double[] arr;
        arr = new double[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }
    }
}
