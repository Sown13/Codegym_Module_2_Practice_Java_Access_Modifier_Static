package practice1;

public class Student {
    private String name;
    private int age;
    private static String college = "BBDIT";
    Student (String name, int age){
        this.name = name;
        this.age = age;
    }
    static void change(){
        college = "Trường đời";
    }
    void displayInfor(){
        System.out.println(name + " " + age + " years old " + college);
    }
}
