class Q7_MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void displayTicket() {
        System.out.println("Movie: " + movieName + ", Seat: " + seatNumber + ", Price: " + price);
    }

    public static void main(String[] args) {
        Q7_MovieTicket ticket = new Q7_MovieTicket();
        ticket.bookTicket("Avengers", "B12", 300);
        ticket.displayTicket();
    }
}