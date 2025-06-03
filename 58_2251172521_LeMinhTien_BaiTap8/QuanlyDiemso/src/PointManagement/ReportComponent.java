package PointManagement;

public class ReportComponent implements Component {
    protected GradeMediator mediator;

    @Override
    public void setMediator(GradeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendNotification() {
        System.out.println("ReportComponent gửi thông báo.");
        mediator.notify(this);
    }

    @Override
    public void operationA() {
        System.out.println("ReportComponent thực hiện operationA: Tạo báo cáo điểm.");
    }

    @Override
    public void operationB() {
        // Không cần triển khai vì chỉ dùng operationA
    }
}