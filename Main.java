public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CarRental rental = new CarRental();
        boolean quit = false;

        while (!quit) {
            System.out.println("Wybierz opcję: ");
            System.out.println("1 - Dodaj samochód");
            System.out.println("2 - Pokaż najdroższy samochód");
            System.out.println("3 - Pokaż najchętniej wynajmowany samochód");
            System.out.println("4 - Usuń samochód");
            System.out.println("5 - Wyświetl wszystkie samochody");
            System.out.println("0 - Zakończ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addCar(rental);
                    break;
                case 2:
                    System.out.println("Najdroższy samochód: " + rental.findMostExpensiveCar());
                    break;
                case 3:
                    System.out.println("Najchętniej wynajmowany samochód: " + rental.findMostPopularCar());
                    break;
                case 4:
                    removeCar(rental);
                    break;
                case 5:
                    displayCars(rental);
                    break;
                case 0:
                    quit = true;
                    break;
            }
        }
    }

    private static void removeCar(CarRental rental) {
        System.out.println("Podaj markę samochodu do usunięcia: ");
        String make = scanner.nextLine();
        System.out.println("Podaj model samochodu do usunięcia: ");
        String model = scanner.nextLine();

        rental.removeCar(make, model);
        System.out.println("Usunięto samochód: " + make + " " + model);
    }
    private static void displayCars(CarRental rental) {
        rental.displayAllCars();
    }

    private static void addCar(CarRental rental) {
        System.out.println("Podaj markę samochodu: ");
        String make = scanner.nextLine();
        System.out.println("Podaj model samochodu: ");
        String model = scanner.nextLine();
        System.out.println("Podaj cenę wynajmu: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Car car = new Car(make, model, price);
        rental.addCar(car);
        System.out.println("Dodano samochód: " + car);
    }
}

