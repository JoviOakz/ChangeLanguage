import java.util.Scanner;

public class exc3 {
    // internetifcomfor.c

    private static int sx, _homens = 0;
    private static Double alt, maior, menor, _mulheres = 0.00, media_mulher = 0.00, alt_mulheres = 0.00;

    exc3(int sx, int _homens, Double alt, Double maior, Double menor, Double _mulheres, Double media_mulher, Double alt_mulheres) {
        exc3.sx = sx;
        exc3._homens = _homens;
        exc3.alt = alt;
        exc3.maior = maior;
        exc3.menor = menor;
        exc3._mulheres = _mulheres;
        exc3.media_mulher = media_mulher;
        exc3.alt_mulheres = alt_mulheres;
    }
    
    public static void consoleInternetIf() {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            System.out.print("Digite o genero: ");
            sx = sc.nextInt();

            System.out.println("Informe a altura: ");
            alt = sc.nextDouble();

            if (i == 1) {
                maior = alt;
                menor = alt;
            } else if (alt > maior) {
                maior = alt;
            } else {
                menor = alt;
            }

            if (sx == 0) {
                alt_mulheres += alt;
                _mulheres++;
            } else {
                _homens++;
            }

            if (_mulheres > 0) {
                media_mulher = alt_mulheres / _mulheres;
                System.out.println("Medua -> Mulheres: " + media_mulher);
            } else {
                System.out.println("Nenhuma mulher inserida para obter uma media!");
            }

            System.out.println("Quantidade -> Homens: " + _homens);
            System.out.println(menor + " menor altura e maior altura " + maior);
        }

        sc.close();
    }

    public static int getSx() {
        return sx;
    }

    public static void setSx(int sx) {
        exc3.sx = sx;
    }

    public static int get_homens() {
        return _homens;
    }

    public static void set_homens(int _homens) {
        exc3._homens = _homens;
    }

    public static Double getAlt() {
        return alt;
    }

    public static void setAlt(Double alt) {
        exc3.alt = alt;
    }

    public static Double getMaior() {
        return maior;
    }

    public static void setMaior(Double maior) {
        exc3.maior = maior;
    }

    public static Double getMenor() {
        return menor;
    }

    public static void setMenor(Double menor) {
        exc3.menor = menor;
    }

    public static Double get_mulheres() {
        return _mulheres;
    }

    public static void set_mulheres(Double _mulheres) {
        exc3._mulheres = _mulheres;
    }

    public static Double getMedia_mulher() {
        return media_mulher;
    }

    public static void setMedia_mulher(Double media_mulher) {
        exc3.media_mulher = media_mulher;
    }

    public static Double getAlt_mulheres() {
        return alt_mulheres;
    }

    public static void setAlt_mulheres(Double alt_mulheres) {
        exc3.alt_mulheres = alt_mulheres;
    }
}