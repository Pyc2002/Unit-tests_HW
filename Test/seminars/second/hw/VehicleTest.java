package seminars.second.hw;

import org.junit.jupiter.api.Test;
import second.hw.Car;
import second.hw.Main;
import second.hw.Motorcycle;
import second.hw.Vehicle;
import second.model.Product;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;



class VehicleTest {

    public static Car getCar() {
        return new Car("Dodge", "Ram", 2010);
    }

    public static Motorcycle getMotorcycle() {
        return new Motorcycle("Suzuki", "Bandit400", 2020);
    }

    @Test
    public void testCarIsInstanceOfVehicle() {
        assertTrue(getCar() instanceof Vehicle);
    }
    @Test
    public void testCarIs4Wheels() {
        assertThat(getCar().getNumWheels()).isEqualTo(4);
    }
    @Test
    public void testMotorcycleIs2Wheels() {
        assertThat(getMotorcycle().getNumWheels()).isEqualTo(2);
    }
    @Test
    public void testCarMakeSpeed60() {
        Car car = getCar();

        car.testDrive();

        assertThat(car.getSpeed()).isEqualTo(60);
    }
    @Test
    public void testMotorcycleMakeSpeed60() {
        Motorcycle motorcycle = getMotorcycle();

        motorcycle.testDrive();

        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    public void testCarMakePark() {
        Car car = getCar();

        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
        car.park();

        assertThat(car.getSpeed()).isEqualTo(0);
    }
    @Test
    public void testMotorcyclePark() {
        Motorcycle motorcycle = getMotorcycle();

        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
        motorcycle.park();

        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}