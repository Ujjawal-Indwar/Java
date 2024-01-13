public class WhileLoopChallenge {
    public static void main(String[] args) {
        int startnum=4;
        int endnum=20;
        int evencount=0;
        int oddcount=0;
        while(startnum<=endnum){
            startnum++;
            if (!isEvenNumber(startnum)){
                oddcount++;
                continue;
            }
            System.out.println("Even number is "+startnum);
            evencount++;
            if (evencount>=5)break;
        }
        System.out.println("Total even no is "+evencount);
        System.out.println("Total odd no is "+oddcount);
    }
    public static boolean isEvenNumber(int num){
            if (num%2==0){
                return true;
            }
            else return false;

        }
          }
