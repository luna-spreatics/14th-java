package _05_class._04_final;

import java.util.Scanner;

public class Circle {
    // final 필드
    private final double radius;

    // 원주율 상수 -> 대문자로 작성
    private static final double PI = 3.14159265;

    public Circle (double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원의 반지름을 입력하세요: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("원의 반지름 : " + radius);
        System.out.println("원의 넓이 : " + circle.calculateArea());

        scanner.close();
    }
}