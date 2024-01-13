package methods.check.version;

import java.time.LocalDate;

public class CheckVersion {
    public static void checkVersion(int numbersOne, int numbersTwo) {
        int currentYear = LocalDate.now().getYear();
        if (numbersOne == 0 && numbersTwo < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке: www//http..");
        } else if (numbersOne == 1 && numbersTwo < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке: www//http..");
        } else if (numbersOne == 0 && numbersTwo > currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке: www//http..");
        } else if (numbersOne == 1 && numbersTwo > currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке: www//http..");
        } else if (numbersOne == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке: www//http..");
        } else if (numbersOne == 1) {
            System.out.println("Установите версию приложения для Android по ссылке: www//http..");
        } else {
            System.out.println("Какие-то данные введены неверно!");
        }
    }
}