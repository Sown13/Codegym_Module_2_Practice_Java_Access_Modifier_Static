package practice1;

public class TestStaticMethod {
    public static void main(String[] args) {
        System.out.println("Before change");
        Student s1 = new Student("Son", 29);
        s1.displayInfor();
        System.out.println("After change");
        Student.change();
        s1.displayInfor();
    }
}
