package _10_collection._set;

public class Course {
    private int id;
    private String title;

    public Course(String title, int id) {
        this.title = title;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Course {" + "title='" + title+ "', id='" + id + "'}";
    }

    // hashCode 란?
    // - hashCode: 객체의 메모리 주소를 기반으로 한 정수 값의 해시 코드
    // - hashCode() 메서드 : Object 클래스에 정의되어 있으며, 객체의 해시 코드를 반환하는 역할
    // - 클래스에서 hashCode() 재정의 : 객체의 내부 상태를 기반으로 한 고유한 해시 코드를 생성 가능
    // => id, title 값이 같으면 동일한 hashCode 리턴
    @Override
    public int hashCode() {
        // title 은 String 이므로 hashCode() 메서드 사용
        // id 는 int 이므로 정수 값의 해시 코드에 더하기 연산
        return title.hashCode() + id;
    }

    // id, title 값이 같으면 true 리턴
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Course target) {
            return target.id == id && target.title.equals(title);
        } else {
            return false;
        }
    }

}
