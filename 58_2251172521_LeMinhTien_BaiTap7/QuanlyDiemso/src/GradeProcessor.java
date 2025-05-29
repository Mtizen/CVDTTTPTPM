public abstract class GradeProcessor {
    protected GradeCalculationImpl implementation;

    public GradeProcessor(GradeCalculationImpl implementation) {
        this.implementation = implementation;
    }

    public abstract double calculateAverage(double[] scores);
}