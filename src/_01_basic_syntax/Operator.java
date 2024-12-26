package _01_basic_syntax;

public class Operator {
    public static void main(String[] args) {
        int x, y;
        float a,b;

        // 대입 연산자 ( = )
        x = 10;
        y = 20;
        a = 5.0f;
        b = 10.0f;

        // 산술 연산자 : 숫자형 데이터에 대해서 산술 연산 가능
        System.out.println("==== x, y ====");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x + y = " + (x+y));
        System.out.println("x - y = " + (x-y));
        System.out.println("x * y = " + (x*y));
        System.out.println("y / x = " + (y/x));
        System.out.println("x % y = " + (x%y));


        System.out.println("b / a = " + (b/a));

        // 증가, 감소 연산자
        // ++, --

        // 산술 대입 연산자
        // +=, -=, *=, /=

        // 비교 연산자
        // >, <, >=, <=, ==, !=

        // 논리 연산자
        // &&, ||, !

        // 삼항 연산자
    }
}
