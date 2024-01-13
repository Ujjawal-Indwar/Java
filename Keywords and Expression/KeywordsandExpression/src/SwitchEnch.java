public class SwitchEnch {
    public static void main(String[] args) {

        printWeekDay(3);


    }
    public static void printWeekDay(int i){

        /*
        * String dayofWeek = switch(i){
        *      case 0 -> "Sunday";
        * };//variable dayofWeek so ;
        * */

        /*
        * String dayofWeek = switch(i){
         *      case 0 -> {yeild "Sunday";}     //yeild is used because of return and {}
         * }
        * */

        /*
        switch (i){
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Invalid input");

        }*/

            String day= switch (i){
                case 0 -> "Sunday";
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                default -> "Invalid input";

            };

        System.out.println(i+" stands for "+day);
    }

}
