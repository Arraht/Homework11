package methods.check.year;

public class CheckYear {
    public static void checkYear(int numbers) {
        if (numbers % 4 == 0 && numbers % 100 != 0) {
            System.out.println(numbers + " год является високосным");
        } else {
            System.out.println(numbers + " год не является високосным");
        }
    }
}