import java.util.Scanner;

public class exc5 {
    // listacondicional3.c

    private static Double salbruto = 0.0, desc = 0.0, respliq = 0.0, salmin = 998.0;
    
    exc5(Double salbruto, Double desc, Double respliq) {
        exc5.salbruto = salbruto;
        exc5.desc = desc;
        exc5.respliq = respliq;
    }
    
    public static void consoleListacondi3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o salario bruto: ");
        salbruto = sc.nextDouble();

        System.out.print("Informe o imposto a ser pago: ");
        desc = sc.nextDouble();

        desc *= salbruto;
        respliq = salbruto - desc;

        if (desc <= salmin) {
            System.out.println("O salario liquido e: " + respliq + " e seus impostos estao menores que um salario minimo");
        } else {
            System.out.println("O salario liquido e: " + respliq + " e seus impostos estao maiores que um salario minimo");
        }

        sc.close();
    }

    public static Double getSalbruto() {
        return salbruto;
    }

    public static void setSalbruto(Double salbruto) {
        exc5.salbruto = salbruto;
    }

    public static Double getDesc() {
        return desc;
    }

    public static void setDesc(Double desc) {
        exc5.desc = desc;
    }

    public static Double getRespliq() {
        return respliq;
    }

    public static void setRespliq(Double respliq) {
        exc5.respliq = respliq;
    }

    public static Double getSalmin() {
        return salmin;
    }

    public static void setSalmin(Double salmin) {
        exc5.salmin = salmin;
    }
}