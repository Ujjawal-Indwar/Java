// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        /*
        //Private fields=== so cannot access
        car.make = "Tesla";
        car.model = "model X";
        System.out.println("make - "+car.make);
        System.out.println("model - "+car.model);
        */

        // Using Getter to access the private fields

        //using this keyword to change private field object make
        car.setMake("KIA");
        car.setColor("yellow");
        car.setConvertable(false);
        car.setDoors(4);
        car.setModel("Urus");
        System.out.println("make = "+car.getMake());
        System.out.println("model = "+car.getModel());
        car.describeCar();
    }
}