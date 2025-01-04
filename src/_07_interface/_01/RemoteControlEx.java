package _07_interface._01;

public class RemoteControlEx {
    public static void main(String[] args) {
        // interface 도 하나의 타입이므로 변수의 타입으로 사용 가능
        // interface 는 참조 타입이므로 null 대입 가능
        RemoteControl rc;

        // rc 변수에 Television 객체 대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(4);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(15);
        rc.turnOff();

//        Audio audio = new Audio();
//        audio.turnOn();
//        audio.setVolume(15);
//        audio.turnOff();
    }
}
