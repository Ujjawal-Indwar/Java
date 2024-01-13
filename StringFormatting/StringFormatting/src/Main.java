import java.awt.*;

public class Main {
    public static void main(String[] args) {

        String bulletPoint = "Print Bullet Points: \n"+
                "\t\u2022 First Point\n"+
                "\t\t\u2022 Second Point";
        System.out.println(bulletPoint);

        String textBlock = """
                Print Bullet Points:
                    \u2022 Frist Point
                        \u2022 Second Pont
                """;
        System.out.println(textBlock);

        int age = 30;
        System.out.printf("Your age is %d",age);
        int curYr=2023;
        System.out.printf("\nYou are of Age  %d and the year born is %d",age,(curYr-age));

        for (int i = 1; i <= 100000; i*=10) {
            System.out.printf("Print %6d%n",i);

        }
        String formattedString = String.format("Your age is %d",age);
        System.out.println(formattedString);

        formattedString = "Your age i$ %d".formatted(age);
        System.out.println(formattedString);

    }
}
