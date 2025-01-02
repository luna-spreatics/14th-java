package _05_class._02_access_modifier._pack3;

public class B {
    public static void main(String[] args) {
        A a = new A();

        // 필드 변경
        a.field1 = 11; // o
        a.field2 = 22; // o
        // a.field3 = 33; // x : private 이기 때문에 컴파일 에러

        a.method1();
        a.method2();
        // a.method3(); // x
    }
}
