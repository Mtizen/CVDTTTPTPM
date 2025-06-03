package PointManagement;

import java.util.ArrayList;
import java.util.List;

public class GradeCoordinator implements GradeMediator {
    private List<Component> components = new ArrayList<>();

    public GradeCoordinator(Component componentA, Component componentB, Component componentC, Component componentD) {
        this.components.add(componentA);
        this.components.add(componentB);
        this.components.add(componentC);
        this.components.add(componentD);
        for (Component component : components) {
            component.setMediator(this);
        }
    }

    @Override
    public void notify(Object sender) {
        if (sender instanceof StudentComponent || sender instanceof ReportComponent) {
            reactOnA();
        } else if (sender instanceof TeacherComponent || sender instanceof NotificationComponent) {
            reactOnB();
        }
    }

    @Override
    public void operationA() {
        System.out.println("Thực hiện operationA: Cập nhật điểm hoặc báo cáo.");
    }

    @Override
    public void operationB() {
        System.out.println("Thực hiện operationB: Nhập điểm hoặc gửi thông báo.");
    }

    private void reactOnA() {
        System.out.println("Phản hồi từ Mediator: Kích hoạt operationA.");
        operationA();
    }

    private void reactOnB() {
        System.out.println("Phản hồi từ Mediator: Kích hoạt operationB.");
        operationB();
    }
}