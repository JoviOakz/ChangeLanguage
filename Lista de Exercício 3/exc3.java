import java.util.Scanner;

public class exc3 {
    // exer12funcoes.c
    
    private static int num, res;
	
    exc3(int num, int res) {
        exc3.num = num;
        exc3.res = res;
    }

    public static void consoleExer12() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        num = sc.nextInt();

        res = quad(num);

        System.out.println("O quadrado de " + num + " eh: " + res);

        sc.close();
    }

    public static int quad(int num) {
        return num * num;
    }
    
    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        exc3.num = num;
    }

    public static int getRes() {
        return res;
    }

    public static void setRes(int res) {
        exc3.res = res;
    }
}