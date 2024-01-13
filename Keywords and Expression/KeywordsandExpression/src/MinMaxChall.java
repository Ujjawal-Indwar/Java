import java.util.Scanner;

public class MinMaxChall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maxnum=0,minnum=0;
        int loopCount = 0;

        boolean val = true;
        while(val){
            System.out.println("Enter a  no \n");
            String num=sc.nextLine();
            try{

                double validnum = Double.parseDouble(num);

                if(loopCount == 0 || validnum>maxnum){
                    maxnum=validnum;
                }
                if (loopCount==0 || validnum<minnum){
                    minnum=validnum;
                }
                loopCount++;

            }  catch (NumberFormatException ex) {
                System.out.println("You should only type no");
                break;

            }

        }
        System.out.println("maximum no is "+maxnum);
        System.out.println("minimum no is "+minnum);



    }
}
