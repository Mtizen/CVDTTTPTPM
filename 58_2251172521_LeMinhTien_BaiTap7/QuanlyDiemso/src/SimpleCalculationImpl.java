public class SimpleCalculationImpl implements GradeCalculationImpl {
    @Override
    public double calculate(double[] scores) {
        if (scores == null || scores.length == 0) {
            throw new IllegalArgumentException("Mảng điểm không được rỗng!");
        }
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
}