package PointManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeBuilder builder = new StudentGradeBuilder();
        GradeDirector director = new GradeDirector(builder);
        boolean continueLoop = true;   
        
        while (continueLoop) {
            try {
                System.out.println("Nhập số lượng điểm (nhập 0 để thoát): ");
                int n = scanner.nextInt();
                
                if (n == 0) {
                    System.out.println("Kết thúc chương trình.");
                    continueLoop = false;
                    continue;
                }
                
                if (n < 0) {
                    System.out.println("Số lượng điểm không được âm! Vui lòng nhập lại.");
                    continue;
                }
                
                double[] scores = new double[n];
                System.out.println("Nhập " + n + " điểm số:");
                for (int i = 0; i < n; i++) {
                    System.out.print("Điểm thứ " + (i + 1) + ": ");
                    scores[i] = scanner.nextDouble();
                }
                
                StudentGradeBuilder studentBuilder = new StudentGradeBuilder();
                studentBuilder.buildStepA(); // Đặt điểm
                studentBuilder.setScores(scores); // Thay vì giá trị mặc định
                studentBuilder.buildStepB(); // Tính trung bình
                Grade grade = studentBuilder.getResult();
                System.out.println("Trung bình: " + grade.getAverage());
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}
