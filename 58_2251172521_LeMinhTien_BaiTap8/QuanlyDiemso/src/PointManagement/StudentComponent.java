package PointManagement;

public class StudentComponent implements Component {
    protected GradeMediator mediator;

    @Override
    public void setMediator(GradeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendNotification() {
        System.out.println("StudentComponent gửi thông báo.");
        mediator.notify(this);
    }

    @Override
    public void operationA() {
        System.out.println("StudentComponent thực hiện operationA: Xem điểm số.");
    }

    @Override
    public void operationB() {
        // Không cần triển khai vì chỉ dùng operationA
    }
}
