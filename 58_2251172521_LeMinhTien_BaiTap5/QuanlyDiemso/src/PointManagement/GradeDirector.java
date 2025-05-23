package PointManagement;

public class GradeDirector {
    private GradeBuilder builder;

    public GradeDirector(GradeBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(GradeBuilder builder) {
        this.builder = builder;
    }
    
    public Grade construct(boolean isSimple) {
        if (isSimple) {
            builder.buildStepA();
        } else {
            builder.buildStepA();
            builder.buildStepB();
        }
        return builder.getResult();
    }
}
