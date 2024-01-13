// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Employee tim = new Employee("Tim","11/11/1","21/5/2005");
        System.out.println(tim);
        System.out.println(tim.getAge());
        System.out.println(tim.collectPay());


        SalariedEmployee sam = new SalariedEmployee("sam","11/11/1995","5/8/2013",500000) ;
        System.out.println(sam);
        System.out.println(sam.getAge());
        System.out.println("sam's Paycheck "+sam.collectPay());

        sam.retire();
        System.out.println("Sam's pension check = $"+sam.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary","5/5/1992","03/03/2012",15);
        System.out.println(mary);
        System.out.println("Mary's paycheck = $"+mary.collectPay());
        System.out.println("Mary's holiday pay = $"+mary.getDoublePay());
    }
}