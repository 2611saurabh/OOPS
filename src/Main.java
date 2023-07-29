public class Main {
    public static void main(String[] args) {
        Car car = new Car();
//        car.make = "Swfit";
//        car.model = "MAruti";
//        car.color = "Red";
        System.out.println("make = "+car.getMake());
        System.out.println("model = "+car.getModel());
        car.describeCar();

    }
}