package PointManagement;

public abstract class GradeCalculator {
    public double CalculateAverage(double[] scores) throws ArgumentException, InvalidOperationException {
        if (scores == null || scores.length == 0) {
            throw new ArgumentException("Mảng điểm không được rỗng!");
        }
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
}