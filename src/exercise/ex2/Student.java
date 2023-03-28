package exercise.ex2;

public class Student {
    private String name = "Son";
    private String classes = "C02";
    public Student(){}
    public Student(String name, String classes){
        this.name = name;
        this.classes = classes;
    }
    protected void setName (String name){
        this.name = name;
    }
    private void setClasses (String classes){
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
