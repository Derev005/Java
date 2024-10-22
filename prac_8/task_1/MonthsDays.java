import java.util.Scanner;

public class MonthsDays {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 12: ");
        try {
            int input = Integer.parseInt(scanner.nextLine());
            if (input < 1 || input > 12) {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.println("Месяц: " + months[input - 1]);
            System.out.println("Количество дней: " + dom[input - 1]);
        } catch (NumberFormatException e) {
            System.out.println("Недопустимое число: ввод должен быть целым числом.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Недопустимое число: введите число от 1 до 12.");
        }
    }
}
