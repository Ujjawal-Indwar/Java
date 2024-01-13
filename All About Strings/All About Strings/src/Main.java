public class Main {
    public static void main(String[] args) {

        printInformation("UJJAWAL INDWAR");
        printInformation("");
        printInformation("\t \n");

        String greet = "Hello World";
        System.out.printf("In the string below\n"+greet+"\nindex of r = %d %n",greet.indexOf('r'));
        System.out.printf("In the string below\n"+greet+"\nLast index of l = %d %n",greet.lastIndexOf('l'));

        System.out.printf("In the string below\n"+greet+"\nindex of World = %d %n",greet.indexOf("World"));

        System.out.printf("In the string below\n"+greet+"\nindex of l from index 6= %d %n",greet.indexOf('l',6));

        String helloWorldLower = greet.toLowerCase();
        if (greet.equals(helloWorldLower)){
            System.out.println("Values are exactly matched");
        }
        if (greet.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Values match reagarding their cases");
        }

        if (greet.startsWith("Hello")){
            System.out.println("Greeting starts with Hello");
        }
        if (greet.endsWith("World")){
            System.out.println("Greeting ends with World");
        }
        if (greet.contains("World")){
            System.out.println("Greeting contains with World");
        }
        if (greet.contentEquals("Hello World")){
            System.out.println("Exact matching values");
        }
    }
    public  static  void printInformation(String string){

        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()){
            System.out.println("String is empty");
        }

        else if(string.isBlank()){
            System.out.println("String is blank");
        }

        else {
        System.out.printf("First char = %c %n", string.charAt(0));


        System.out.printf("Last char = %c, %n",string.charAt(length-1));
    }
    }
}
