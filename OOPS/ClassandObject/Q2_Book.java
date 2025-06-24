class Q2_Book {
    String title;
    String author;
    double price;

    Q2_Book (String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        Q2_Book  book = new Q2_Book ("Java Programming", "John Doe", 499);
        book.display();
    }
}