package tasks.one;

import static methods.check.year.CheckYear.checkYear;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        checkYear(year);
    }
}