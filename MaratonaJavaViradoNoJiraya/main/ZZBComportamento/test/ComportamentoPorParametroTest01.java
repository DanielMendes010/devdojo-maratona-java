package ZZBComportamento.test;

import ZZBComportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args){
        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println(filterCarByColor(cars, "black"));
        System.out.println(filterByYearCar(cars, 2014));
    }

    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars){
            if (car.getColor().equals("green")){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterRedCar(List<Car> cars){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars){
            if (car.getColor().equals("green")){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars){
            if (car.getColor().equals(color)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterByYearCar(List<Car> cars, int year){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars){
            if (car.getYear() < year){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

}
