package entities;

public class Student {
    public String name;
    public double nota1, nota2, nota3;

    public double finalGrade() {
        return nota1 + nota2 + nota3;
    }

    public double missingPoints() {
        if (finalGrade() < 60.00) {
            return 60.00 - finalGrade();
        } else {
            return 0.0;
        }
    }

    public String toString() {
        return "FINAL GRADE = "
                + String.format("%.2f", finalGrade());
    }
}
