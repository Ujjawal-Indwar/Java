import java.util.Arrays;

public class SwitchPrg {
    public static void main(String[] args) {
        int i = 2;

        System.out.println("Traditional Switch");
//Traditional Switch
        switch (i) {
            case 1:
                System.out.printf("1");
                break;
            case 2:
                System.out.printf("2");
                break;
            case 3:
                System.out.println("args 3");
                break;
            case 4:
                System.out.println("args = 4");
                break;
            default:
                System.out.printf("default");
                break;
        }

        System.out.println("\nEnhanced Switch");
//Enhanced Switch
        switch (i) {
            case 1 -> System.out.println("val 1");
            case 2 -> System.out.println("args = 2 ");
            case 3 -> System.out.println("args = 3 ");
            default -> System.out.println("default");
        }

        System.out.println("month quarter "+getQuarter("January"));


    }
    public static String getQuarter(String month){

        /*
        //Traditional switch
        switch (month){
            case "January":
            case "February":
            case "March":
                return "1st";
            case "April":
            case "May":
            case "June":
                return "2nd";
            case "July":
            case "August":
            case "September":
                return "3rd";
            case "October":
            case "November":
            case "December":
                return "4th";
            default:return "Invalid Input Enter the correct input";
        }*/

        return switch (month) {
            case "January", "February", "March" -> {
                yield "1st";
            }
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> {
                String wrong_Res="Bad Input";
                yield wrong_Res;
            }

        };
    }
}