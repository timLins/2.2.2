package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDAO  {


    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Mazda",120,"Black"));
        cars.add(new Car("Lamborghini",300,"White"));
        cars.add(new Car("Mercedes",170,"Brown"));
        cars.add(new Car("Tractor",20,"Blue"));
        cars.add(new Car("Ferrari",220,"Yellow"));
    }

    public List<Car> index(int count) {

        List<Car> countOfCar = new ArrayList<>();
        if (count < cars.size()) {
            for ( int i = 0; i < count; i++ ) {
                countOfCar.add(cars.get(i));
            }
            return countOfCar;
        }
        else return cars;}


//    public List<Car> show (int count ) {
//        List<Car> countOfCar = new ArrayList<>();
//        if (count < cars.size()) {
//            for ( int i = 0; i < count; i++ ) {
//                countOfCar.add(cars.get(i));
//            }
//            return countOfCar;
//        }
//        return cars;
//    }
}
