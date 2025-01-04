package _07_interface._last_ex;

public class Airplane extends Vehicle implements Flyable {
    public Airplane(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void fly() {
        System.out.println(getName() + "이(가) 고도 10000 피트 비행중");
    }

    @Override
    public void move() {
        System.out.println(getName() + "이(가) " + getMaxSpeed() + "로 하늘을 날아가는 중");
    }
}
