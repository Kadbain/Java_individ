package patterns.builder;

/**
 * Created by Ps1X on 29.05.2017.
 */
public class Builder {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new SubaruEvolutionBuilder());
        Car car = director.BuildCar();
        System.out.println(car);
        director.setBuilder(new FordMustangBuilder());
        Car car2 = director.BuildCar();
        System.out.println(car2);
    }
}

enum Transmission {
    MANUAL, AUTO
}

class Car {
    String make;
    Transmission transmission;
    int maxSpeed;

    public void setMake(String make) {
        this.make = make;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
abstract class CarBuilder {
    Car car;
    void createCar() {car = new Car();}
    abstract void biuldMake();
    abstract void biuldTransmission();
    abstract void biuldMaxSpeed();
    Car getCar() {return car;}
}
class FordMustangBuilder extends CarBuilder {

    void biuldMake() {
car.setMake("Ford Mustang");
    }
    void biuldTransmission() {
car.setTransmission(Transmission.MANUAL);
    }
    void biuldMaxSpeed() {
car.setMaxSpeed(400);
    }
}
class SubaruEvolutionBuilder extends CarBuilder {

    void biuldMake() {
        car.setMake("Subaru Evolution");
    }
    void biuldTransmission() {
car.setTransmission(Transmission.AUTO);
    }
    void biuldMaxSpeed() {
car.setMaxSpeed(280);
    }
}
class Director {
    CarBuilder carBuilder;
    void setBuilder (CarBuilder builder) {carBuilder = builder;}
    Car BuildCar() {
        carBuilder.createCar();
        carBuilder.biuldMake();
        carBuilder.biuldTransmission();
        carBuilder.biuldMaxSpeed();
        Car car = carBuilder.getCar();
        return car;
    }
}
