public class WeightedCalculationImpl implements GradeCalculationImpl {
    @Override
    public double calculate(double[] scores) {
        if (scores == null || scores.length == 0) {
            throw new IllegalArgumentException("Mảng điểm không được rỗng!");
        }
        double[] weights = {0.2, 0.3, 0.5}; // Trọng số: kiểm tra miệng, giữa kỳ, cuối kỳ
        double weightedSum = 0;
        double totalWeight = 0;
        for (int i = 0; i < scores.length; i++) {
            double weight = weights[Math.min(i, weights.length - 1)];
            weightedSum += scores[i] * weight;
            totalWeight += weight;
        }
        if (totalWeight == 0) {
            throw new IllegalArgumentException("Tổng trọng số không được bằng 0!");
        }
        return weightedSum / totalWeight;
    }
}