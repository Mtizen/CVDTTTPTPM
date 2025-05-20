package PointManagement;

public class TeacherGradeCalculatorFactory extends GradeCalculatorFactory {
    @Override
    public GradeCalculator createStudentCalculator() {
        return null; // Không hỗ trợ StudentCalculator trong factory này
    }

    @Override
    public GradeCalculator createTeacherCalculator() {
        return new TeacherGradeCalculator();
    }
}
