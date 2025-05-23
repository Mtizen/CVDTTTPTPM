package PointManagement;

public class StudentGrade implements Grade {
    private double[] scores;
    private double average;

    @Override
    public void setScores(double[] scores) {
        this.scores = scores;
    }

    @Override
    public void calculateAverage() {
        if (scores != null && scores.length > 0) {
            double sum = 0;
            for (double score : scores) {
                sum += score;
            }
            average = sum / scores.length;
        }
    }
    
    @Override
    public double getAverage() {
        return average;
    }
}
