package _07_interface._02;

public class Suv implements Car {
    @Override
    public void changeGear(int gear) {
        System.out.println("기어 변경 : " + gear);
    }

    @Override
    public void moveForward() {
        System.out.println("전진");
    }

    @Override
    public void moveBackWard() {
        System.out.println("후진");
    }

    @Override
    public void powerOn() {
        System.out.println("시동 ON");
    }

    @Override
    public void powerOff() {
        System.out.println("시동 OFF");
    }
}
