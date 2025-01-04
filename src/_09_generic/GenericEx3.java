package _09_generic;

// 사람 객체 간 상속 관계
// Person
// ㄴ Teacher
// ㄴ Student
//     ㄴ WebStudent
//     ㄴ MobileStudent

class Person {
}
class Student extends Person {}
class Teacher extends Person {}
class WebStudent extends Student {}
class MobileStudent extends Student {}

// 등록
// - 특정 종류 (T) 의 Applicant 를 나타내는 클래스
class Applicant<T> {
    public T kind;

    public Applicant(T kind) {
        this.kind = kind;
    }
}

// 과정
class Course {
    // 모든 사람 등록 가능
    public static void registerA(Applicant<?> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) CourseA 등록함");
    }

    // Student 또는 Student 의 자식만 등록 가능
    public static void registerB(Applicant<? extends Student> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) CourseA 등록함");
    }

    // Teacher 나 Student 가 아닌 Person 만 등록 가능
    public static void registerC(Applicant<? super Teacher> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) CourseA 등록함");
    }
}

public class GenericEx3 {
    public static void main(String[] args) {
        // 모든 사람이 신청 가능한 CourseA
        Course.registerA(new Applicant<Person>(new Person()));
        Course.registerA(new Applicant<Teacher>(new Teacher()));
        Course.registerA(new Applicant<Student>(new Student()));
        Course.registerA(new Applicant<WebStudent>(new WebStudent()));
        Course.registerA(new Applicant<MobileStudent>(new MobileStudent()));

        // CourseB
        // Course.registerB(new Applicant<Person>(new Person())); // X
        // Course.registerB(new Applicant<Teacher>(new Teacher())); // X
        Course.registerB(new Applicant<Student>(new Student()));
        Course.registerB(new Applicant<WebStudent>(new WebStudent()));
        Course.registerB(new Applicant<MobileStudent>(new MobileStudent()));

        // CourseC
         Course.registerC(new Applicant<Person>(new Person()));
         Course.registerC(new Applicant<Teacher>(new Teacher()));
//        Course.registerC(new Applicant<Student>(new Student())); // X
//        Course.registerC(new Applicant<WebStudent>(new WebStudent())); // X
//        Course.registerC(new Applicant<MobileStudent>(new MobileStudent())); // X
    }
}
