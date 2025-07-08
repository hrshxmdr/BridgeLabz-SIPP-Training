class Q4_Employee {
    String name;
    int id;
    double salary;

    Q4_Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Q4_Employee emp = new Q4_Employee("Alice", 1001, 50000);
        emp.displayDetails();
    }
}