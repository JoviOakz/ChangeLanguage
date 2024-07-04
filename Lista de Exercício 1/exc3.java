import java.util.Scanner;

public class exc3 {
    // whilepratica05.c

    private static int num_pessoas;
	private static char sexo;
	private static Double alt, resp;

    exc3(int num_pessoas, char sexo, Double alt, Double resp) {
        exc3.num_pessoas = num_pessoas;
        exc3.sexo = sexo;
        exc3.alt = alt;
        exc3.resp = resp;
    }

    public static void consoleWhilePratcic() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a altura da pessoa?");
        alt = sc.nextDouble();

        while (alt > 0) {
            System.out.println("Qual o sexo da pessoa?(M)Homens/(F)Mulheres");
            String letter = sc.next();
            sexo = letter.charAt(0);

            num_pessoas++;

            if (sexo == 'M') {
                resp = (72.7f * alt) - 58;
            } else {
                resp = (62.1f * alt) - 44.7f;
            }

            System.out.println("Seu peso ideal é de: " + resp + " kilos");

            System.out.println("Qual a altura da pessoa?");
            alt = sc.nextDouble();
        }

        System.out.println(num_pessoas + " participantes");

        sc.close();
    }

    public static int getNum_pessoas() {
        return num_pessoas;
    }

    public static void setNum_pessoas(int num_pessoas) {
        exc3.num_pessoas = num_pessoas;
    }

    public static char getSexo() {
        return sexo;
    }

    public static void setSexo(char sexo) {
        exc3.sexo = sexo;
    }

    public static Double getAlt() {
        return alt;
    }

    public static void setAlt(Double alt) {
        exc3.alt = alt;
    }

    public static Double getResp() {
        return resp;
    }

    public static void setResp(Double resp) {
        exc3.resp = resp;
    }
}