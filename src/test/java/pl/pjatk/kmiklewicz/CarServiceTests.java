package pl.pjatk.kmiklewicz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

public class CarServiceTests {
    private final CarService carService = new CarService(new CarStorage(), new RentalStorage());

    @Test
    void shouldReturnNullWhenTryingToRentOccupiedCar() {
        // Given
        User user = new User("1");
        int vin = 2;
        LocalDate startDate = LocalDate.of(2022,11,25);
        LocalDate endDate = LocalDate.of(2022,11,30);

        // When
        RentalInfo rentalInfo = carService.rentCar(user, vin, startDate, endDate);

        // Then
        assertThat(rentalInfo).isNull();

    }

    @Test
    void shouldReturnNullWhenTryingToRentCarThatDoesntExist() {
        // Given
        User user = new User("1");
        int vin = 23123123;
        LocalDate startDate = LocalDate.of(2022,11,25);
        LocalDate endDate = LocalDate.of(2022,11,30);

        // When
        RentalInfo rentalInfo = carService.rentCar(user, vin, startDate, endDate);

        // Then
        assertThat(rentalInfo).isNull();

    }

    @Test
    void shouldReturnGoodPriceWhenCarTypePremium() {
        // Given
        User user = new User("1");
        int vin = 3;
        LocalDate startDate = LocalDate.of(2022,11,25);
        LocalDate endDate = LocalDate.of(2022,11,30);

        RentalInfo rentalInfo = carService.rentCar(user, vin, startDate, endDate);

        // When
        double price = rentalInfo.getPrice();

        // Then
        assertThat(price).isEqualTo(50);
    }

    @Test
    void shouldReturnGoodPriceWhenCarTypeStandard() {
        // Given
        User user = new User("1");
        int vin = 5;
        LocalDate startDate = LocalDate.of(2022,11,25);
        LocalDate endDate = LocalDate.of(2022,11,30);

        RentalInfo rentalInfo = carService.rentCar(user, vin, startDate, endDate);

        // When
        double price = rentalInfo.getPrice();

        // Then
        assertThat(price).isEqualTo(25);
    }
}
