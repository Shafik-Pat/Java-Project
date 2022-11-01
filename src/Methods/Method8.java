package Methods;

public class Method8 {

    public static double calculateSalary(double basicSal,double hra){
        double total=basicSal+hra;
        return total;
    }

    public static void incrementSal() {
        double salary = calculateSalary(12000, 5000);
        System.out.println("Total Salary is:"+salary);

        //Increment Salary
        double incSal = salary + salary * 0.25;
        System.out.println("Incremented Salary is:"+incSal);
    }

    public static void main(String[] args) {
        incrementSal();
    }
}
