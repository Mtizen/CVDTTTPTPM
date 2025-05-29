import java.util.Scanner;

public class GradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            try {
                System.out.println("Chon phuong thuc tinh diem (1: Don gian, 2: Co trong so, 0 de thoat): ");
                int choice = scanner.nextInt();

                if (choice == 0) {
                    System.out.println("Ket thuc chuong trinh.");
                    continueLoop = false;
                    continue;
                }

                GradeCalculationImpl impl;
                if (choice == 1) {
                    impl = new SimpleCalculationImpl();
                } else if (choice == 2) {
                    impl = new WeightedCalculationImpl();
                } else {
                    System.out.println("Lua chon khong hop le! Vui long chon lai.");
                    continue;
                }

                GradeProcessor processor = new BasicGradeProcessor(impl);

                System.out.println("Nhap so luong điem: ");
                int n = scanner.nextInt();

                if (n < 0) {
                    System.out.println("So luong diem khong đuoc am! Vui long nhap lai.");
                    continue;
                }

                double[] scores = new double[n];
                System.out.println("Nhap " + n + " diem so:");
                for (int i = 0; i < n; i++) {
                    System.out.print("Điem thu " + (i + 1) + ": ");
                    scores[i] = scanner.nextDouble();
                }

                double average = processor.calculateAverage(scores);
                System.out.println("Trung binh: " + average);

            } catch (IllegalArgumentException e) {
                System.out.println("Loi: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Loi khong xac dinh: " + e.getMessage());
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}