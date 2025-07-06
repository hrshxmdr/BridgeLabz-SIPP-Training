class Q10_Student {
    String name;
    int rollNumber;
    int marks;

    Q10_Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 50)
            return "C";
        else
            return "F";
    }

    void display() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Marks: " + marks + ", Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Q10_Student student = new Q10_Student("Bob", 123, 82);
        student.display();
    }
}