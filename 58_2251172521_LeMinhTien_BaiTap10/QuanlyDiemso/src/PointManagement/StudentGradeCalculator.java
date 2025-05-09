package PointManagement;

public class StudentGradeCalculator extends GradeCalculator {
    @Override
    public double CalculateAverage(double[] scores) throws ArgumentException, InvalidOperationException {
        double average = super.CalculateAverage(scores);
        if (average < 5) {
            throw new InvalidOperationException("Trung bình điểm nhỏ hơn 5, không hợp lệ!");
        }
        return average;
    }
}
