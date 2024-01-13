public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;


    public Worker(){

    }
    public Worker(String name,String birthDate){
        this.name = name;
        this.birthDate = birthDate;

    }


    public int getAge(){
        int currDate = 2025;
        int endDate = Integer.parseInt(birthDate.substring(6));
        return (currDate-endDate);
    }
    public double collectPay(){

        int pay=0;
        return pay;
    }

    public void terminate(String endDate){

        this.endDate= endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
