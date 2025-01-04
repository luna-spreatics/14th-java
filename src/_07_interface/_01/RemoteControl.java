package _07_interface._01;

// interface 선언
public interface RemoteControl {
    // 추상 메서드 선언
    // - 실행부 ({}) 가 없는 메서드
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    // 상수 필드
    // - 인터페이스에 선언된 필드는 모두 "public static final" 특성을 가지고 있음
    //    생략하더라도 컴파일러가 자동으로 해당 특성을 추가함
    // int MY_CONSTANT = 10;

    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
}

