import java.util.Arrays;

//Method Overloading occurs when a class has multiple methods, with the same name,
// but the method are declared with different parameters.
public class MethodOverloading {
    public static void main(String[] args) {


        String name = "Ujj";
        int score = 100;
        System.out.println("New score is "+calculateScore(name,score));
        System.out.println("New score isss " +calculateScore(21));
        System.out.printf("Naya score likho " +calculateScore());
    }
    public static int calculateScore(String naam,int sco){
        System.out.println("Name of player "+naam+" and your score"+sco);
        return 10*sco;

    }

    public static int calculateScore(int scor){
        return calculateScore("U",scor);

    }

    public static int calculateScore(){
        System.out.println("Unnamed player  and no score");
        return 0;

    }

}
