package PointManagement;

public class TeacherGradeBuilder extends GradeBuilder {
    private TeacherGrade grade = new TeacherGrade();
    private double[] scores;
    
    public void setScores(double[] scores) {
        this.scores = scores;
    }

    @Override
    public void buildStepA() {
        if (scores != null) {
            grade.setScores(scores);
        } else {
            grade.setScores(new double[]{9.0, 8.5, 9.5});
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
