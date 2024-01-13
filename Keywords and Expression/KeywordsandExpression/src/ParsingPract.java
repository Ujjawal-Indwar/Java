public class ParsingPract {
    public static void main(String[] args) {

        int curYear=2023;
        getInputFromConsole(curYear);
    }
    public static String getInputFromConsole(int cy1){
        String name=System.console().readLine("Hi what's your name? ");
        System.out.println("Hey "+name+" thanks for being");

        return "";
    }
}
