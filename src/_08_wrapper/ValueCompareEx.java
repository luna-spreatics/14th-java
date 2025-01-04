package _08_wrapper;

// 포장 값 비교
// - 포장 객체는 내부 값을 비교하기 위해 ==, != 연산자 사용 불가능
// - 내부 값을 비교하는게 아니라 포장 객체의 번지를 비교하기 때문
// - 따라서, equals() 메소드로 내부 값을 비교해야 함

// - byte, short, int : -128 ~ 127
// - boolean : true, false
// - char : \u0000 ~ \u007f
// 위 범위에 포함되는 값은 포장 객체 공유 (참조 값 같음)
public class ValueCompareEx {
    public static void main(String[] args) {
        // - 128 ~ 127 범위
        Integer obj1 = 10;
        Integer obj2 = 10;
        System.out.printf("%d == %d : %b%n", obj1, obj2, obj1 == obj2);
        System.out.printf("%d equals %d : %b%n", obj1, obj2, obj1.equals(obj2));

        // - 128 ~ 127 초과
        Integer obj3 = 1000;
        Integer obj4 = 1000;
        System.out.printf("%d == %d : %b%n", obj3, obj4, obj3 == obj4); // false
        System.out.printf("%d equals %d : %b%n", obj3, obj4, obj3.equals(obj4));

        // char \u0000 ~ \u007f
        Character char1 = 'A';
        Character char2 = 'A';
        System.out.printf("%c == %c : %b%n", char1, char2, char1 == char2); // true
        System.out.printf("%c equals %c : %b%n", char1, char2, char1.equals(char2));

        Character char3 = '\u0101';
        Character char4 = '\u0101';
        System.out.printf("%c == %c : %b%n", char3, char4, char3 == char4); // false
        System.out.printf("%c equals %c : %b%n", char3, char4, char3.equals(char4));
    }


}
