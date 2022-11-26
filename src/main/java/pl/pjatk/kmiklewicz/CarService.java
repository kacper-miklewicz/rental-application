package pl.pjatk.kmiklewicz;


import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Component
public class CarService {
    private final CarStorage carStorage;
    private final RentalStorage rentalStorage;

    public CarService(CarStorage carStorage, RentalStorage rentalStorage) {
        this.carStorage = carStorage;
        this.rentalStorage = rentalStorage;
    }

    public List<Car> getAllCars() {
        return this.carStorage.getCars();
    }

    public List<Rental> getAllRentals() {
        return this.rentalStorage.getRentals();
    }

    public RentalInfo rentCar(User user, int vin, LocalDate startDate, LocalDate endDate) {
        for (Rental rental : getAllRentals()) {
            if (rental.getCar().getVin() == vin) {
                return null;
            }
        }

        for (Car car : getAllCars()) {
            if (car.getVin() == vin) {
                getAllRentals().add(new Rental(user, car));
                long days = ChronoUnit.DAYS.between(startDate, endDate);

                double price = switch (car.getType()) {
                    case PREMIUM -> days * 10;
                    case STANDARD -> days * 5;
                };

                return new RentalInfo(price, startDate, endDate);
            }
        }

        return null;
    }
}
