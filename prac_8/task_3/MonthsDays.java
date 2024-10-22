import java.util.Scanner;

public class MonthsDays {
    //Функция вычисления високосного года
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число от 1 до 12: ");
        try {
            int input = Integer.parseInt(scanner.nextLine());
            if (input < 1 || input > 12) {
                throw new ArrayIndexOutOfBoundsException();
            }
            //Модифицированная часть
            if (input == 2) {
                System.out.print("Месяц: " + months[input - 1] + "\nВведите год: ");
                int year = Integer.parseInt(scanner.nextLine());
                if (isLeapYear(year)) {
                    System.out.println("Количество дней: 29");
                }
                else {
                    System.out.println("Количество дней: 28");
                }
            }
            else {
                System.out.println("Месяц: " + months[input - 1]);
                System.out.println("Количество дней: " + dom[input - 1]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Недопустимое число: ввод должен быть целым числом.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Недопустимое число: введите число от 1 до 12.");
        }
    }
}
