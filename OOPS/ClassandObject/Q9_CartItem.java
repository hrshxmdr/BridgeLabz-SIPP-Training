import java.util.ArrayList;

class Q9_CartItem {
    String itemName;
    double price;
    int quantity;

    Q9_CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}

class ShoppingCart {
    ArrayList<Q9_CartItem> items = new ArrayList<>();

    void addItem(String name, double price, int quantity) {
        items.add(new Q9_CartItem(name, price, quantity));
    }

    void removeItem(String name) {
        items.removeIf(item -> item.itemName.equals(name));
    }

    void displayTotal() {
        double total = 0;
        for (Q9_CartItem item : items) {
            total += item.price * item.quantity;
        }
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 50000, 1);
        cart.addItem("Mouse", 500, 2);
        cart.displayTotal();
        cart.removeItem("Mouse");
        cart.displayTotal();
    }
}