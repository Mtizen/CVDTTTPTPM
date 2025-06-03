package PointManagement;

public class TeacherComponent implements Component {
    protected GradeMediator mediator;

    @Override
    public void setMediator(GradeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendNotification() {
        System.out.println("TeacherComponent gửi thông báo.");
        mediator.notify(this);
    }

    @Override
    public void operationA() {
        // Không cần triển khai vì chỉ dùng operationB
    }

    @Override
    public void operationB() {
        System.out.println("TeacherComponent thực hiện operationB: Nhập điểm số.");
    }
}
