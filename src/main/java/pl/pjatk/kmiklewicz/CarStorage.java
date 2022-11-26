package pl.pjatk.kmiklewicz;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;


@Component
public class CarStorage {
    private List<Car> cars = new ArrayList<>();

    public CarStorage() {
      this.cars.add(new Car("Ford", "Focus", 1, CarType.STANDARD));
      this.cars.add(new Car("Fiat", "Punto", 2, CarType.STANDARD));
      this.cars.add(new Car("BMW", "M3", 3, CarType.PREMIUM));
      this.cars.add(new Car("Audi", "A3", 4, CarType.PREMIUM));
      this.cars.add(new Car("Opel", "Corsa", 5, CarType.STANDARD));
    }

    public List<Car> getCars() {
        return this.cars;
    }
}

