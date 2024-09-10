import java.util.Scanner;

public class Main_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double con = 11.91;
        int yan;
        double answer, a;
        boolean flag = true;
        while (flag) {
            System.out.print("Ввод: ");
            yan = in.nextInt();
            if (yan < 0) {
                System.out.print("Ошибка ввода");
                flag = false;
            }
            answer = con * yan;
            a = yan % 10;
            if (a == 1) {
                System.out.print(yan + " китайский юань в рублях = " + answer);
            } else if (a > 1 & a < 5) {
                System.out.print(yan + " китайских юаня в рублях = " + answer);
            } else if (a == 0 | a > 4) {
                System.out.print(yan + " китайских юаней в рублях = " + answer);
            }
            System.out.print('\n');
        }
        in.close();
    }
}
