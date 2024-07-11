import java.util.Scanner;

public class exc5 {
    // recursividade1aula.c

    private static int num;

    exc5(int num) {
        exc5.num = num;
    }

    public static void consoleRecursividade() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Selecione um numero: ");
        num = sc.nextInt();

        teste(num);

        sc.close();
    }

    public static void teste(int num) {
        System.out.println(num);
        teste(num);
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        exc5.num = num;
    }
}