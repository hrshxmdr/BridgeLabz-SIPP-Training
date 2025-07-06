public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Generic";
        this.rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateCost() {
        return rentalDays * 1000.0;
    }
}
