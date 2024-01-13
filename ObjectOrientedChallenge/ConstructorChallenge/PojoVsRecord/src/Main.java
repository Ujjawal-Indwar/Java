// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            LPAStudent s = new LPAStudent("S030"+i,
                    switch (i){
                case 1 -> "Marry";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
            },
                    "05/05/1990",
                    "Java Masterclass");
            System.out.println(s);

            Student pojoStudent =  new Student("S0032","Ann","3/3/1991","Java Master");
            LPAStudent recordStudent =  new LPAStudent("S0033","Bill","3/3/1991","Java Master");

            System.out.println(pojoStudent);
            System.out.println(recordStudent);

           pojoStudent.setClassList(pojoStudent.getClassList()+", Java OCP exam 089");
           /*
           err becoz records are immutable so no setter
           recordStudent.setClassList(recordStudent.getClassList()" Java OCP exam 089");
*/

            System.out.println(pojoStudent.getName()+" is taking "+pojoStudent.getClassList());
            System.out.println(recordStudent.name()+" is taking "+recordStudent.classList());
        }
    }
}