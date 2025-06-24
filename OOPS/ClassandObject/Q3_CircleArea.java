class Q3_Circle {
    double radius;

    Q3_Circle (double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.printf("Area: %.2f, Circumference: %.2f\n", area(), circumference());
    }

    public static void main(String[] args) {
        Q3_Circle  c = new Q3_Circle (5);
        c.display();
    }
}