package tasks.task_two;

import static methods.check.version.CheckVersion.checkVersion;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Какая у вас операционаая система?\n0 - iOS\n1 - Android\nВведите данные: ");
        int clientOS = scanner.nextInt();
        System.out.print("Введите год выпуска вышего телефона: ");
        int clientDeviceYear = scanner.nextInt();
        checkVersion(clientOS, clientDeviceYear);
    }
}
