import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double con = 11.91;
        int yan;
        double answer;
        System.out.print("Ввод: ");
        yan = in.nextInt();
        if (yan < 0) {
            System.out.print("Ошибка ввода");
        }
        answer = con * yan;
        System.out.print(answer);
        in.close();
    }
}
