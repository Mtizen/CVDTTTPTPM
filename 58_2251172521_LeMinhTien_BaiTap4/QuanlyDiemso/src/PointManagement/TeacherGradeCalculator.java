package PointManagement;

public class TeacherGradeCalculator extends GradeCalculator {
    @Override
    public double CalculateAverage(double[] scores) throws ArgumentException, InvalidOperationException {
        if (scores == null || scores.length == 0) {
            throw new ArgumentException("Mảng điểm không được rỗng!");
        }
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length; // Không kiểm tra ngưỡng 5, ví dụ đơn giản
    }
}
