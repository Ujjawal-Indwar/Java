public class PrimeNo {
    public static void main(String[] args) {
        System.out.println("0 is " + (isPrime(0) ? "" : "NOT") + " a prime number");
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT") + " a prime number");
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT") + "a prime number");
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT") + "a prime number");

        System.out.println("8 is "+(isPrime(8)?"":"NOT")+"a prime  number");
        System.out.println("1567 is "+(isPrime(1567)?"":"NOT")+"a prime number");
    }

    public static boolean isPrime(int wholeNO) {
        if (wholeNO <= 2) {
            return wholeNO == 2;
        }


        for (int divisor = 2; divisor < wholeNO/2; divisor++) {

               if(wholeNO%divisor==0){
                   return false;
               }
        }
        return true;
    }
}
