public class Car {
    private String make;
    private String model;
    private double rentalPrice;
    private int rentals;

    public Car(String make, String model, double rentalPrice) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
        this.rentals = 0;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public int getRentals() {
        return rentals;
    }

    public void rent() {
        rentals++;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", rentalPrice=" + rentalPrice +
                ", rentals=" + rentals +
                '}';
    }
}
