import java.util.Scanner;

public class exc2 {
    // EX1.c

    public static final Double hora = 10.00;
    public static final Double horaextra = 15.00;

    private static Double horas_normais = 0.0, horas_extras = 0.0, horasnorm_resul = 0.0, horasext_resul = 0.0, resul = 0.0, poup = 0.0;

    exc2(Double horas_normais, Double horas_extras, Double horasnorm_resul, Double horasext_resul, Double resul, Double poup) {
        exc2.horas_normais = horas_normais;
        exc2.horas_extras = horas_extras;
        exc2.horasnorm_resul = horasnorm_resul;
        exc2.horasext_resul = horasext_resul;
        exc2.resul = resul;
        exc2.poup = poup;
    }
	
    public static void consoleEX1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Infome o numero de horas normais trabalhadas no ano: ");
        horas_normais = sc.nextDouble();
        
        System.out.print("Informe o numero de horas extras trabalhadas no ano: ");
        horas_extras = sc.nextDouble();

        horasnorm_resul = horas_normais * hora;
        horasext_resul = horas_extras * horaextra;
        resul = horasnorm_resul + horasext_resul;

        poup = resul * 0.08f;

        System.out.println("______________________________________________________");
        System.out.println("Valor de horas normais: " + horas_normais);
        System.out.println("Valor de horas extras: " + horas_extras);
        System.out.println("Total de ganho no ano = " + resul);
        System.out.println("Valor a guardar na poupança = " + poup);
        System.out.println("______________________________________________________");
        
        sc.close();
    }

    public static Double getHoras_normais() {
        return horas_normais;
    }

    public static void setHoras_normais(Double horas_normais) {
        exc2.horas_normais = horas_normais;
    }

    public static Double getHoras_extras() {
        return horas_extras;
    }

    public static void setHoras_extras(Double horas_extras) {
        exc2.horas_extras = horas_extras;
    }

    public static Double getHorasnorm_resul() {
        return horasnorm_resul;
    }

    public static void setHorasnorm_resul(Double horasnorm_resul) {
        exc2.horasnorm_resul = horasnorm_resul;
    }

    public static Double getHorasext_resul() {
        return horasext_resul;
    }

    public static void setHorasext_resul(Double horasext_resul) {
        exc2.horasext_resul = horasext_resul;
    }

    public static Double getResul() {
        return resul;
    }

    public static void setResul(Double resul) {
        exc2.resul = resul;
    }

    public static Double getPoup() {
        return poup;
    }

    public static void setPoup(Double poup) {
        exc2.poup = poup;
    }
}