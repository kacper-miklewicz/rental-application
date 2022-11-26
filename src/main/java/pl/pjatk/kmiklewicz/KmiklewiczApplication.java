package pl.pjatk.kmiklewicz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class KmiklewiczApplication {
    private final CarService carService;

    public KmiklewiczApplication(CarService carService) {
        this.carService = carService;

        System.out.println(this.carService.getAllCars());
        System.out.println(this.carService.getAllRentals());
        System.out.println(carService.rentCar(new User("2"), 3, LocalDate.of(2022, 11, 20), LocalDate.of(2022,11,25)));
    }

    public static void main(String[] args) {
        SpringApplication.run(KmiklewiczApplication.class, args);
    }
}
