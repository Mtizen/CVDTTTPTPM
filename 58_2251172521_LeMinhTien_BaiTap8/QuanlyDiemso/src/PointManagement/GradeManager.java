package PointManagement;

import java.util.Scanner;

public class GradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentComponent student = new StudentComponent();
        TeacherComponent teacher = new TeacherComponent();
        ReportComponent report = new ReportComponent();
        NotificationComponent notification = new NotificationComponent();
        GradeCoordinator mediator = new GradeCoordinator(student, teacher, report, notification);

        boolean continueLoop = true;
        while (continueLoop) {
            try {
                System.out.println("Chọn hành động (1: Xem điểm/ Báo cáo, 2: Nhập điểm/ Gửi thông báo, 0 để thoát): ");
                int choice = scanner.nextInt();

                if (choice == 0) {
                    System.out.println("Kết thúc chương trình.");
                    continueLoop = false;
                    continue;
                }

                if (choice == 1) {
                    student.sendNotification();
                    report.sendNotification();
                } else if (choice == 2) {
                    teacher.sendNotification();
                    notification.sendNotification();
                } else {
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
                }

            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
