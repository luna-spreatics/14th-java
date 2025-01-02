package _05_class._03_static;

// 정적 (static) 멤버
// - 객체를 생성할 필요 없이 클래스 통해서 바로 접근 가능
// - 클래스가 메모리에 로딩되면 정적 멤버 바로 사용 가능
// - 클래스 이름과 함께 (.) 연산자로 접근 가능
// - 정적 메소드와 정적 블록은 객체가 없어도 실행 가능하므로 내부에 인스턴스 필드나 메서드 사용 불가능
// - 객체 자신의 참조인 this 도 사용 불가능
// - 정적 필드는 객체 생성 없이도 사용 가능하므로 생성자에서 초기화 작업을 하지 않음

public class Calculator {
    static double pi = 3.141592;

    // 외부에서 주어진 값으로 처리하므로 정적 메서드로 처리하는 것이 유리
    static int plus(int x, int y) {
        return x + y;
    }
}