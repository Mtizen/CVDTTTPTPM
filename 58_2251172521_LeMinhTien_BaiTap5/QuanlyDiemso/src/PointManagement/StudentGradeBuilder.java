package PointManagement;

public class StudentGradeBuilder extends GradeBuilder {
    private StudentGrade grade = new StudentGrade();
    private double[] scores;
    
    public void setScores(double[] scores) {
        this.scores = scores;
    }

    @Override
    public void buildStepA() {
        if (scores != null) {
            grade.setScores(scores);
        } else {
            grade.setScores(new double[]{8.5, 9.0, 7.5}); // Giá trị mặc định nếu không nhập
        }
    }

    @Override
    public void buildStepB() {
        grade.calculateAverage(); // Tính trung bình
    }

    @Override
    public Grade getResult() {
        return grade;
    }
}
