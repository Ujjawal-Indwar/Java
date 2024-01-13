public class MethodOverloadingChal {
    public static void main(String[] args) {

        int foot=5;
        int inches=8;
        System.out.println("1st method is "+convertToCentimeters(inches));
        System.out.println(" 2nd method is  " +convertToCentimeters(foot,inches));


    }
    public static double convertToCentimeters(int inches){
        return inches*2.54;
    }
    public static double convertToCentimeters(int feet, int inch){
        int totalinches = (feet*12)+inch;
        System.out.printf("Total inches "+totalinches);
        return convertToCentimeters(totalinches);
    }

}
