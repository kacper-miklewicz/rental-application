package pl.pjatk.kmiklewicz;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CarTests {
    private Car car = new Car("Fiat", "Punto", 1, CarType.PREMIUM);

    @Test
    void carMakeShouldBeFiat() {
        // When
        String make = car.getMake();

        // Then
        assertThat(make).isEqualTo("Fiat");
    }

    @Test
    void carModelShouldBePunto() {
        // When
        String model = car.getModel();

        // Then
        assertThat(model).isEqualTo("Punto");
    }

    @Test
    void carVinShouldBe1() {
        // When
        int vin = car.getVin();

        // Then
        assertThat(vin).isEqualTo(1);
    }

    @Test
    void carTypeShouldBePremium() {
        // When
        CarType carType = car.getType();

        // Then
        assertThat(carType).isEqualTo(CarType.PREMIUM);
    }
}
