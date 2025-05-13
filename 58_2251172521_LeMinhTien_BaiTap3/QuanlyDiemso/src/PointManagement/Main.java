package PointManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeCalculatorFactory factory = new StudentGradeCalculatorFactory();
        GradeCalculator calculator = factory.CreateCalculator();
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

                double average = calculator.CalculateAverage(scores);
                System.out.println("Trung bình: " + average);
            } catch (ArgumentException e) {
                System.out.println("Lỗi: " + e.getMessage());
            } catch (InvalidOperationException e) {
                System.out.println("Lỗi: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Lỗi không xác định: " + e.getMessage());
                scanner.nextLine();
            } 
        }
        
        scanner.close();
    }
}