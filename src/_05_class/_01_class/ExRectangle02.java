package _05_class._01_class;

import java.util.ArrayList;
import java.util.Scanner;

public class ExRectangle02 {

    // 필드 (변수)
    private int width;
    private int height;

    public ExRectangle02(int width) {
        this.width = width;
    }

    public int area() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

class Main {
    public static void main(String[] args) {
        // ExRectangle02 객체를 담는 ArrayList 생성
        ArrayList<ExRectangle02> rectangles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("가로와 세로 길이를 띄어쓰기 기준으로 입력해주세요 (0 입력 시 종료) : ");

            int width = scanner.nextInt();
            int height = scanner.nextInt();
            if(width == 0 && height == 0) {
                break;
            }

            // 입력 받은 값으로 Rectangle 객체 생성
            ExRectangle02 rectangle = new ExRectangle02(width);
            rectangle.setHeight(height);
            rectangles.add(rectangle);
        }

        System.out.println("\n 입력된 Rectangle 정보: ");
        for (ExRectangle02 rectangle : rectangles) {
            System.out.println("가로 길이는: " + rectangle.getWidth());
            System.out.println("세로 길이는: " + rectangle.getHeight());
            System.out.println("넓이는: " + rectangle.area());
            System.out.println("==========================");
        }

        scanner.close();
    }
}
