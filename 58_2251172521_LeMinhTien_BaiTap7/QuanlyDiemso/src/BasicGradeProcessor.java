public class BasicGradeProcessor extends GradeProcessor {
    public BasicGradeProcessor(GradeCalculationImpl implementation) {
        super(implementation);
    }

    @Override
    public double calculateAverage(double[] scores) {
        return implementation.calculate(scores);
    }
}