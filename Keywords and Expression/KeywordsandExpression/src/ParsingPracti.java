import java.util.Scanner;

public class ParsingPracti {
    public static void main(String[] args) {
        int curYear = 2023;
        try {
            System.out.println(getInputFromConsole(curYear));

        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(curYear));
        }

    }

    //in Terminal console=====  java src/ParsingPracti.java
    public static String getInputFromConsole(int curYear) {

        String name = System.console().readLine("Hi what's your name");
        System.out.println("Hey " + name + " thanks for being");
        String DOBy = System.console().readLine("Enter your DOB");
        int age = curYear - Integer.parseInt(DOBy);

        return "So you are of " + age + " " + name;

    }

    public static String getInputFromScanner(int curYear) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name \n");
//        String name = sc.nextLine();
//        System.out.println("Hey " + name + " thanks for being");
//        System.out.println("Enter your DOB");
//        String DOBy = sc.nextLine();
//        int age = curYear - Integer.parseInt(DOBy);
//
//
//        return "So you are of " + age + " " + name;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name \n");
        String name = sc.nextLine();
        System.out.println("Hey " + name + " wassup!!!!");

        System.out.println("Enter your DOB");
        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter your year of birth >" + (curYear - 125) + " and <=" + curYear);
            try {
                age = checkData(curYear, sc.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Only number are allowed");
            }
        } while (!validDOB);
        return "So you are of " + age + " " + name;
    }

    public static int checkData(int currentYr, String doB) {
        int dateOfB = Integer.parseInt(doB);
        int minYr = currentYr - 125;

        if ((dateOfB < minYr) || (dateOfB > currentYr)) {

            return -1;
        }
        return (currentYr - dateOfB);
    }
}
