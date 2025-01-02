package _05_class._02_access_modifier._pack5;

public class PersonEx {
    public static void main(String[] args) {
        // 객체 생성
        Person p1 = new Person("minion");

        // p1.age = 3 // x : 필드 직접 변경 불가능
        p1.setAge(4); // o
        System.out.println(p1.getName() + "의 나이는 " + p1.getAge());

        p1.setAge(-6);
        System.out.println(p1.getName() + "의 나이는 " + p1.getAge());
    }
}
