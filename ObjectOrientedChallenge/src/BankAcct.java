import java.math.BigInteger;

public class BankAcct {
    private String acctNum;
    private double balance;
    private String custName;
    private String email;
    private String phNo;

    public BankAcct(){
        this("u21ind",11111,"ui","default mail",
                "007");
        System.out.println("Just an empty constructor");
    }
    public BankAcct(String acctNum, double balance, String custName, String mail, String pno){
        System.out.println("Parametrized Constructor");
        //setAcctNum(acctNum);  this might not work in inheritance
        this.acctNum = acctNum;
        this.balance = balance;
        this.custName = custName;
        email = mail;
        phNo = pno;
    }

    public BankAcct(String custName, String email, String phNo) {
        this("11111",1254876,custName,email,phNo);
        /*
        this.custName = custName;
        this.email = email;
        this.phNo = phNo;

         */
    }

    public void depositeFunds(double depositeAmt){
        balance += depositeAmt;
        System.out.println("Deposite of $"+depositeAmt+" made in your acct no "+acctNum+" new balance is "+balance);
    }

    public void withdrawFunds(double withdrawAmt){
        if ((balance-withdrawAmt)<0){
            System.out.println("Insufficient funds! your  balance is "+balance);
        }
        else {
            balance-=withdrawAmt;
            System.out.println("withdrawn amount is "+withdrawAmt+"$ so now your balance is $"+balance);
        }
    }
    public String getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

}
