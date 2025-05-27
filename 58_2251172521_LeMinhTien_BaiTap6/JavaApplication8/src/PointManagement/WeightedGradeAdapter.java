package PointManagement;

import java.util.ArrayList;
import java.util.List;

public class WeightedGradeAdapter implements GradeCalculator {
    private AdvancedAnalyticsService service;

    public WeightedGradeAdapter(AdvancedAnalyticsService service) {
        this.service = service;
    }

    @Override
    public double calculateAverage(double[] scores) {
        if (scores == null || scores.length == 0) {
            throw new IllegalArgumentException("Mảng điểm không được rỗng!");
        }

        List<ScoreEntry> entries = new ArrayList<>();
        double[] defaultWeights = {0.2, 0.3, 0.5};
        for (int i = 0; i < scores.length; i++) {
            double weight = defaultWeights[Math.min(i, defaultWeights.length - 1)];
            entries.add(new ScoreEntry(scores[i], weight));
        }

        return service.computeWeightedAverage(entries);
    }
}
