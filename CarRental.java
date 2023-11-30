public class CarRental {
    private ArrayList<Car> cars;

    public CarRental() {
        cars = new ArrayList<>();

        cars.add(new Car("Toyota","CHR",100));
        cars.add(new Car("Ford", "Focus", 80));
        cars.add(new Car("BMW", "3 Series", 150));
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public Car findMostExpensiveCar() {
        Car mostExpensiveCar = cars.get(0);
        for (Car car : cars) {
            if (car.getRentalPrice() > mostExpensiveCar.getRentalPrice()) {
                mostExpensiveCar = car;
            }
        }
        return mostExpensiveCar;
    }

    public Car findMostPopularCar() {
        if (cars.isEmpty()) {
            System.out.println("Brak samochodów w bazie");
        }

        Car mostPopularCar = cars.get(0);
        for (Car car : cars) {
            if (car.getRentals() > mostPopularCar.getRentals()) {
                mostPopularCar = car;
            }
        }
        return mostPopularCar;
    }

    public void removeCar(String make, String model) {
        cars.removeIf(car -> car.getMake().equals(make) && car.getModel().equals(model));
    }


    public void displayAllCars() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public ArrayList<Car> getCars() {
        return new ArrayList<>(cars);
    }
}
