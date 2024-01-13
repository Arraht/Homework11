package tasks.task_three;

import static methods.calculate.CalculateDays.calculateDays;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Дистанция: ");
        int deliveryDistance = scanner.nextInt();
        calculateDays(deliveryDistance);
    }
}