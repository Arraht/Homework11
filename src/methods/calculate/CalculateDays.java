package methods.calculate;

public class CalculateDays {
    public static int calculateDays(int numbers) {
        int deliveryDays = 1;
        if (numbers < 20 && numbers > 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (numbers >= 20 && numbers < 60) {
            deliveryDays++;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (numbers >= 60 && numbers <= 100) {
            deliveryDays += 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }
        return numbers;
    }
}