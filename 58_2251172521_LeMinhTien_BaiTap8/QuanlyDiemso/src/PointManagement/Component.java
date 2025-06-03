package PointManagement;

public interface Component {
    void setMediator(GradeMediator mediator);
    void sendNotification();
    void operationA();
    void operationB();
}
