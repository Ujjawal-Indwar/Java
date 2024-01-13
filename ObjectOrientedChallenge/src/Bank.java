// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Bank {
    public static void main(String[] args) {


        //BankAcct swiss = new BankAcct("u21",10000,"Ujjawal Indwar","ui@gmail.com","(087)9787852");
        BankAcct swiss = new BankAcct();

        System.out.println(swiss.getAcctNum());
        System.out.println(swiss.getBalance());
        System.out.println(swiss.getCustName());
        System.out.println(swiss.getEmail());
        System.out.println(swiss.getPhNo());

       /*
        swiss.setBalance(10000);
        swiss.setAcctNum("u236");
        swiss.setCustName("Ujjawal Indwar");
        swiss.setEmail("ui@gmail.com");
        swiss.setPhNo("(084)869789");
*/
        swiss.withdrawFunds(100);
        swiss.depositeFunds(500);
        swiss.withdrawFunds(50);
        BankAcct axis = new BankAcct("Axis", "axis@gmail.com", "89646");
        System.out.println("New Account\nCustName = "+axis.getCustName()+"\nph no = "+axis.getPhNo());

    }
}