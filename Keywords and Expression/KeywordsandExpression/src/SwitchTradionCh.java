public class SwitchTradionCh {
    public static void main(String[] args) {


        char ch='A';


        /*
        *
        * switch (ch){
            case 'N':
                System.out.println("Nan");
                break;
            case 'A':
                System.out.println("Able");
                break;
            case 'T':
                System.out.println("Tare");
                break;
            case 'O':
                System.out.println("Oboe");
                break;
            default:
                System.out.println("NOT Found");
        }
        *
        * */

        switch (ch) {
            case 'N' -> System.out.println("Nan");
            case 'A' -> System.out.println("Able");
            case 'T' -> System.out.println("Tare");
            case 'O' -> System.out.println("Oboe");
            default -> System.out.println("NOT Found");
        }
    }

}
