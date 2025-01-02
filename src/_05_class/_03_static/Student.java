package _05_class._03_static;

public class Student {
    // 1. 필드 정의
    private String name;
    private String studentId;
    private int grade;

    // 클래스 변수로 총 학생 수 추적
    private static int totalStudents = 0;

    public Student(String name, String studentId, int grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
        totalStudents++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("\n=== 학생 정보 ===");
        System.out.println("이름: " + name);
        System.out.println("학번: " + studentId);
        System.out.println("학년: " + grade);
    }

    public static int getTotalStudents(){
        return totalStudents;
    }
}

class Main {
    public static void main(String[] args) {
        // 3명의 학생 생성
        Student std1 = new Student("김민지", "20241010", 1);
        Student std2 = new Student("박지은", "20251010", 1);
        Student std3 = new Student("이은지", "20251210", 1);

        std1.displayInfo();
        std2.displayInfo();
        std3.displayInfo();

        System.out.println("총 학생 수는 " + Student.getTotalStudents() + "명 입니다.");
    }
}