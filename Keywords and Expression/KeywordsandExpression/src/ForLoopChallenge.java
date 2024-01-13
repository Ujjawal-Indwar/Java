public class ForLoopChallenge {
    public static void main(String[] args) {
        int count=0;
        for(int i=10;i<=50;i++){
            if (isPrime(i)){
                System.out.println(i+" is a prime number");
                count++;
                if (count==3){
                    System.out.println("Found 3 prime no---Exiting for loop");
                    break;
                }
            }
        }
           }
    public static boolean isPrime(int wholeNO) {

        if (wholeNO <= 2) {
            return wholeNO == 2;
        }
        for (int divisor = 2; divisor <=wholeNO/2; divisor++) {

            if(wholeNO%divisor==0){

                return false;

            }
        }

        return true;
}
}
