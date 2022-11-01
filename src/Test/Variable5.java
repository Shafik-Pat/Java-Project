package Test;

public class Variable5 {
    public static void main(String[] args) {
        double basicSalary=12000;
        double HRA=500;
        double pf=800;
        double incentive=3000;
        double proTax=200;

        //Net Salary
        double netSal=basicSalary+HRA+incentive-pf-proTax;

        //Gross Salary
        double grossSalary=basicSalary+HRA+incentive;

        System.out.println("Net Salary Is:"+netSal);
        System.out.println("Goss Salary Is:"+grossSalary);
    }
}
