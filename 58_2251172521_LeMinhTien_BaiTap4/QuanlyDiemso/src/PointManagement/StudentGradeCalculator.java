package PointManagement;

public class StudentGradeCalculator extends GradeCalculator {
    @Override
    public double CalculateAverage(double[] scores) throws ArgumentException, InvalidOperationException {
        if (scores == null || scores.length == 0) {
            throw new ArgumentException("Mảng điểm không được rỗng!");
        }
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        double average = sum / scores.length;
        if (average < 5) {
            throw new InvalidOperationException("Trung bình điểm nhỏ hơn 5, không hợp lệ!");
        }
        return average;
    }
}