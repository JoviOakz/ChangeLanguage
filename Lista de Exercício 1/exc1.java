import java.util.Scanner;

public class exc1 {
    // exercicio9aulapratica.c

    private static int cod1, cod2;
    private static float lanche, bebida, pagar;

    exc1(int cod1, int cod2, float lanche, float bebida, float pagar) {
        exc1.cod1 = cod1;
        exc1.cod2 = cod2;
        exc1.lanche = lanche;
        exc1.bebida = bebida;
        exc1.pagar = pagar;
    }

    public static void consoleLanche() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o codigo do seu sanduiche: ");
        cod1 = sc.nextInt();

        System.out.print("Qual o codigo da sua bebida: ");
        cod2 = sc.nextInt();

        switch (cod1) {
            case 100:
                lanche = 1.20f;
                System.out.println("R$ 1.20");
                break;

            case 101:
                lanche = 1.30f;
                System.out.println("R$ 1.30");
                break;

            case 102:
                lanche = 1.50f;
                System.out.println("R$ 1.50");
                break;

            case 103:
                lanche = 1.70f;
                System.out.println("R$ 1.70");
                break;

            default:
                System.out.println("COD INCORRETO");
        }

        switch (cod2) {
            case 201:
                bebida = 1.20f;
                System.out.println("R$ 1.20");
                break;

            case 202:
                bebida = 1.50f;
                System.out.println("R$ 1.50");
                break;

            case 203:
                bebida = 0.70f;
                System.out.println("R$ 0.70");
                break;

            default:
                System.out.println("COD INCORRETO");
        }

        pagar = lanche + bebida;

        System.out.println("TOTAL A PAGAR: " + pagar);

        sc.close();
    }

    public static int getCod1() {
        return cod1;
    }

    public static void setCod1(int cod1) {
        exc1.cod1 = cod1;
    }

    public static int getCod2() {
        return cod2;
    }

    public static void setCod2(int cod2) {
        exc1.cod2 = cod2;
    }

    public static float getLanche() {
        return lanche;
    }

    public static void setLanche(float lanche) {
        exc1.lanche = lanche;
    }

    public static float getBebida() {
        return bebida;
    }

    public static void setBebida(float bebida) {
        exc1.bebida = bebida;
    }

    public static float getPagar() {
        return pagar;
    }

    public static void setPagar(float pagar) {
        exc1.pagar = pagar;
    }
}