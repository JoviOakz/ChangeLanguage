import java.util.Scanner;

public class exc4 {
    // sistematabuadas.c

    private static int num_tabuada = 0;
	
	exc4(int num_tabuada) {
        exc4.num_tabuada = num_tabuada;
    }
    
    public static void consoleTabuada() {
        Scanner sc = new Scanner(System.in);
        System.out.println("____________________________________________________");
        System.out.println("_________________SISTEMA DE TABUADA_________________");
        System.out.println("____________________________________________________");
        System.out.print("Digite o número da tabuada que gostaria de consultar: ");
        num_tabuada = sc.nextInt();
        System.out.println(num_tabuada + " foi o numero digitado");

        while (num_tabuada < 99) {
            for (int i = 0; i < 10; i++) {
                System.out.println((i + 1) + " x " + num_tabuada + " = " + ((i + 1) * num_tabuada));
            }

            System.out.println("Digite o número da tabuada que gostaria de consultar: ");
            System.out.println("Ou pressione 99 para sair.");
            num_tabuada = sc.nextInt();
            System.out.println(num_tabuada + " foi o numero digitado");
        }

        sc.close();
    }

    public static int getNum_tabuada() {
        return num_tabuada;
    }

    public static void setNum_tabuada(int num_tabuada) {
        exc4.num_tabuada = num_tabuada;
    }
}