public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "21/07/1993";
        int startingIndex = birthDate.indexOf("1993");
        System.out.println("starting index = "+startingIndex);
        System.out.println("Birth Year = "+birthDate.substring(startingIndex));

        System.out.println("Month = "+birthDate.substring(3,5));

        String newDate = String.join("/","21","07","1993");
        System.out.println("newDate ="+newDate);

        newDate = "21";
        newDate = newDate.concat("/");
        newDate = newDate.concat("07");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1993");

        System.out.println("newDate = "+newDate);

        newDate = "21"+"/"+"07"+"/"+"1993";
        System.out.println("newDate = "+newDate);

        //Method Chaining
        newDate = "21".concat("/").concat("07").concat("/").concat("1993");
        System.out.println("newDate = "+newDate);

        System.out.println(newDate.replace('/','-'));
        System.out.println(newDate.replace("2","00"));

        System.out.println(newDate.replaceFirst("/","-"));
        System.out.println(newDate.replaceAll("/","---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("XYZ\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));


        System.out.println("    XYZ\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }

}
