package PointManagement;

import java.util.List;

public class AdvancedAnalyticsService {
    public double computeWeightedAverage(List<ScoreEntry> entries) {
        if (entries == null || entries.isEmpty()) {
            throw new IllegalArgumentException("Danh sách điểm không được rỗng!");
        }
        double weightedSum = 0;
        double totalWeight = 0;
        for (ScoreEntry entry : entries) {
            weightedSum += entry.getScore() * entry.getWeight();
            totalWeight += entry.getWeight();
        }
        if (totalWeight == 0) {
            throw new IllegalArgumentException("Tổng trọng số không được bằng 0!");
        }
        return weightedSum / totalWeight;
    }
}
