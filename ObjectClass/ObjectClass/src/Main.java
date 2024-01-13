// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Student st = new Student("Ujjawal Indwar",30);
        System.out.println(st.toString());

        PrimarySchoolStudent pss = new PrimarySchoolStudent("Boss",31,"Playing");
        System.out.println(pss.toString());

    }

}

class  Student{
    private String name;
    private int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

  /*
  Implicitly called by java
  @Override
    public String toString() {
        return super.toString();
    }*/

    @Override
    public String toString() {
        return name+" is "+age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStudent extends Student{
    private String hobby;

    PrimarySchoolStudent(String name,int age,String hobby){
        super(name,age);
        this.hobby = hobby;

    }
/*
    @Override
    public String toString() {
        return super.toString()+" loves "+hobby;
    }*/
}