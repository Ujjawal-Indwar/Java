public class ForLoopMiniChal {
    public static void main(String[] args) {
        int amount = 100;
        double rate_i;
        double result;
        for ( rate_i = 7.5; rate_i <10 ; rate_i+=0.25) {
            result=calculation(amount,rate_i);
            System.out.println("At amount $"+amount+" you have to pay at an "+rate_i+"% interest of $"+result);
        }
    }
    public static double calculation(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
