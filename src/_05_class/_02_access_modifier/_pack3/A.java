package _05_class._02_access_modifier._pack3;

// 필드와 메서드의 접근 제한자
public class A {
    public int field1;
    int field2;
    private int field3;

    public A() {
        // 클래스 내부이므로 접근 제한자의 영향 받지 않음
        field1 = 1;
        field2 = 1;
        field3 = 1;

        method1();
        method2();
        method3();
    }

    public void method1() {}
    void method2() {} // default
    private void method3() {}
}
