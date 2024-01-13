public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of digits in number 1234 is "+sumDigits(1234));

        System.out.println("The sum of digits in number -125 is "+sumDigits(-125));
        System.out.println("The sum of digits in number 4 is "+sumDigits(4));
        System.out.println("The sum of digits in number 3213 is "+sumDigits(3213));
    }
    public static int sumDigits(int num){
        int sum=0;
        if(num<0){
            return -1;
        }
        while (num>9){
            sum+=(num%10);
            num=num/10;
        }
        sum+=num;
        return sum;
    }
}
