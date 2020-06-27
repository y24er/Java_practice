import model.Student;

public class Main {
    public static void main(String[] args) {
        Student stu = new Student("Jessie",18,"女","160202103572");
        System.out.println("name:" + stu.getName() + "\nage:" + stu.getAge() + "\ngender:" + stu.getGender() + "\nIDNo:" + stu.getIDNo());
    }
}
