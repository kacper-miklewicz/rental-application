package pl.pjatk.kmiklewicz;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RentalStorage {
    List<Rental> rentals = new ArrayList<>();

    public RentalStorage() {
        this.rentals.add(new Rental(new User("1"), new Car("Ford", "Focus", 1, CarType.STANDARD)));
        this.rentals.add(new Rental(new User("2"), new Car("Fiat", "Punto", 2, CarType.STANDARD)));
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void addRental(Rental rental) {
        this.rentals.add(rental);
    }
}
