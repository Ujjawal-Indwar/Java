public class Customer {
    private String name;
    private String creditLimit;
    private String email;

    public Customer(String name,String creditLimit,String email){

        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;

        System.out.println("first");
        System.out.println("Name = "+name);
        System.out.println("CreditLimit = "+creditLimit);
        System.out.println("Email = "+email);

        System.out.println();

    }
    public Customer(){
        this("Default Constructor","dc@gmail.com");
        System.out.println("second");
        System.out.println("Constructor with no argument");
        System.out.println();
    }
    public Customer(String name,String email){
        this(name,"1389",email);
        System.out.println("third");
            System.out.println("Last Constructor");
        System.out.println();
    }
    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
