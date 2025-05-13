package PointManagement;

public class StudentGradeCalculatorFactory extends GradeCalculatorFactory {
    @Override
    public GradeCalculator CreateCalculator() {
        return new StudentGradeCalculator();
    }
}
