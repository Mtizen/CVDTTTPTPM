package PointManagement;

public class StudentGradeCalculatorFactory extends GradeCalculatorFactory {
    @Override
    public GradeCalculator createStudentCalculator() {
        return new StudentGradeCalculator();
    }

    @Override
    public GradeCalculator createTeacherCalculator() {
        return null; // Không hỗ trợ TeacherCalculator trong factory này
    }
}
