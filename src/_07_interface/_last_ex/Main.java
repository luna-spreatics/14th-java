package _07_interface._last_ex;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];

        Car car = new Car("자동차", 100);
        vehicles[0] = car;

        Airplane airplane = new Airplane("비행기", 10000);
        vehicles[1] = airplane;

        // for 문 반복 출력
        for(Vehicle vehicle : vehicles) {
            System.out.printf("\n=== %s Vehicle 정보 ===\n", vehicle.getName());
            vehicle.move();

            // Flyable 구현한 인스턴스인 경우에는 fly() 메서드도 호출
            if(vehicle instanceof Flyable) {
                ((Flyable) vehicle).fly();
            }
        }
    }
}
