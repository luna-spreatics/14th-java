package _07_interface._last_ex;

public class Car extends Vehicle {

    public Car(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println(getName() + "이(가) 도로를 따라 이동 중");
    }
}
