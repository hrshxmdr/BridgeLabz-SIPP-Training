public class Product {
    private static double discount = 10.0; // in percent

    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity, int productID) {
        this.productName = this.productName = productName;
        this.price = this.price = price;
        this.quantity = this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }
}