package _05_class._05_inheritance;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(20, "코딩온");
        student.setSchool("코딩대");
        System.out.println(student.getName() + "의 학교는 " + student.getSchool());
    }
}
