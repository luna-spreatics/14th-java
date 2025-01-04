package _07_interface._02;

// 인터페이스는 인터페이스를 상속 받을 수 있음
// - extends : 인터페이스가 인터페이스를 상속 받을 때
public interface Car extends Move, Power {
    void changeGear(int gear);
}
