class Q6_Item {
    int itemCode;
    String itemName;
    double price;

    Q6_Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void display(int quantity) {
        double totalCost = price * quantity;
        System.out.println("Q6_Item Code: " + itemCode + ", Name: " + itemName + ", Price: " + price + ", Quantity: " + quantity + ", Total Cost: " + totalCost);
    }

    public static void main(String[] args) {
        Q6_Item item = new Q6_Item(101, "Notebook", 20);
        item.display(5);
    }
}