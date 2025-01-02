package _05_class._02_access_modifier._pack4;

import _05_class._02_access_modifier._pack3.A;

public class C {
    public static void main(String[] args) {
        A a = new A();

        // 필드 변경
        a.field1 = 11; // o
        // a.field2 = 22; // x : default 이기 때문에 다른 패키지에서는 에러
        // a.field3 = 33; // x : private 이기 때문에 컴파일 에러

        a.method1();
        // a.method2(); // x
        // a.method3(); // x
    }
}
