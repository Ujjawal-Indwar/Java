// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

Customer c1= new Customer("UI","75","ui@gmail.com");
Customer c2  = new Customer();
Customer c3 = new Customer("GD","gd@gmail.com");

        System.out.println("Firstly");
        System.out.println(c1.getName());
        System.out.println(c1.getCreditLimit());
        System.out.println(c1.getEmail());

        System.out.println("Secondly");
        System.out.println(c2.getName());
        System.out.println(c2.getCreditLimit());
        System.out.println(c2.getEmail());

        System.out.println("Lastly");
        System.out.println(c3.getName());
        System.out.println(c3.getCreditLimit());
        System.out.println(c3.getEmail());
    }
}