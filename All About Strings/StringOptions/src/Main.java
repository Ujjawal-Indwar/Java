public class Main {
    public static void main(String[] args) {

        String helloWorld = "Hello"+"World";
        helloWorld.concat("and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello"+"World");
        helloWorldBuilder.append(" and Goodbye");


        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("i".repeat(77));

        StringBuilder emptyStart30 = new StringBuilder(30);
        emptyStart30.append("i".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart30);

        StringBuilder builderPlus = new StringBuilder("Hello"+" World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16,'g');
        System.out.println(builderPlus);

        builderPlus.replace(16,17,"G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength( 7);
        System.out.println(builderPlus);



    }

    public static void printInformation(String string){
        System.out.println("String = "+string);
        System.out.println("Length = "+string.length());
    }


    public static void printInformation(StringBuilder builder){
        System.out.println("StringBuilder = "+builder);
        System.out.println("BuilderLength = "+builder.length());
        System.out.println("BuilderCapacity = "+builder.capacity());
    }



}
