package seminars.second.hw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void carInstanceIsVehicle() {
        Vehicle car = new Car("Toyota", "Camry", 2022);
        assertInstanceOf(Vehicle.class, car);
    }

    @Test
    void carHasFourWheels() {
        Car car = new Car("Toyota", "Camry", 2022);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    void motorcycleInstanceIsVehicle() {
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023);
        assertInstanceOf(Vehicle.class, motorcycle);
    }

    @Test
    void motorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    void carCanTestDriveAtSixty() {
        Car car = new Car("Toyota", "Camry", 2022);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    void motorcycleCanTestDriveAtSeventyFive() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    void carCanPark() {
        Car car = new Car("Toyota", "Camry", 2022);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    void motorcycleCanPark() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}