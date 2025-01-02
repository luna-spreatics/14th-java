package _05_class._01_class;

import java.util.Scanner;

public class ExRectangle01 {

    // 필드 (변수)
    public int width;
    public int height;

    public ExRectangle01(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("가로와 세로 길이를 띄어쓰기 기준으로 입력해주세요 : ");

        int width = scanner.nextInt();
        int height = scanner.nextInt();

        // 입력 받은 값으로 Rectangle 객체 생성
        ExRectangle01 rectangle = new ExRectangle01(width, height);
        System.out.println("사각형의 넓이 : " + rectangle.area());

        scanner.close();
    }
}
