package Java;
import java.util.ArrayList;

class Car {
    Integer id;
    String license;
    String driver;
    Integer passenger;

    void printDataCar(){
        System.out.println("El auto: " + license + " Driver: " + driver);
    }
}
class Acount {
    Integer id;
    String name;
    String document;
    String email;
    String password;
}
class Payment {
    Integer id;
}
class Route {
    Integer id;
    ArrayList<Double> start;
    ArrayList<Double> end;
}

class Main {
    public static void main(String[] args) {
        System.out.print("Hola mundo");
        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "Andres Herrera";
        car.printDataCar();
    }
}