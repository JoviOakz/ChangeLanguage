import java.util.Scanner;

public class exc2 {
    // EX_04.c

    private static int num;

    exc2(int num) {
        exc2.num = num;
    }

    public static void consoleEX_04() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um numero para ir ate 100");
        num = sc.nextInt();

        calc(num);

        sc.close();
    }

    public static void calc(int num) {
        if (num < 100) {
            System.out.println(num);
            num++;
        }
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        exc2.num = num;
    }
}