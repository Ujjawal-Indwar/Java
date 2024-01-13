import java.util.Scanner;

public class ReadingUserInputChall {
    public static void main(String[] args) {
        int i = 1;
        double sum = 0;
        boolean validNUM;
        Scanner sc = new Scanner(System.in);


        while (i <= 5) {
            System.out.println("Enter a number #" + i + " : ");
            String nextNumber = sc.nextLine();
            try {
               // int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                i++;
                sum += number;
            } catch (NumberFormatException ex) {
                System.out.println("You should only type no");
            }

        }

        System.out.println("Sum of those nos is = " + sum);
    }

}
