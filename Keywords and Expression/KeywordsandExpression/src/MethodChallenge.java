public class MethodChallenge {
    public static void main(String[] args) {

        int score_u;
        score_u = calculateHighScore(5000);
        displayHighScorePosition("ujjawal", score_u);

        score_u = calculateHighScore(500);
        displayHighScorePosition("jo", score_u);

        score_u = calculateHighScore(50);
        displayHighScorePosition("bhi", score_u);

        doSome(30);
    }

    public static void displayHighScorePosition(String name, int score) {
        System.out.println(name + " managed to get into position " + score + " on the high score list\n");
    }

    public static int calculateHighScore(int scores) {
        int position = 4;
        if (scores >= 1000) {
            position = 1;
        } else if (scores >= 500) {
            position = 2;
        } else if (scores >= 100) {
            position = 3;
        }
        return position;
    }


    public static void doSome(int age){
        if(age>18){
            return ;
        }
    }
}
