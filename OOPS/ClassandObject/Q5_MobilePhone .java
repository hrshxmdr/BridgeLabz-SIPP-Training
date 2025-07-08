class Q5_MobilePhone {
    String brand;
    String model;
    double price;

     Q5_MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }

    public static void main(String[] args) {
         Q5_MobilePhone phone = new  Q5_MobilePhone("Samsung", "Galaxy S21", 69999);
        phone.display();
    }
}