import java.util.Scanner;

public class exc5 {
    // ifcomE05.c

    private static int idade;

    exc5(int idade) {
        exc5.idade = idade;
    }
    
    public static void consoleIf() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a idade: ");
        idade = sc.nextInt();

        if (idade >= 18 && idade <= 65) {
            System.out.println("Esta compreendida entre 18 e 65 anos.");
        } else {
            System.out.println("Nao esta compreendido entre 18 e 65 anos.");
        }

        sc.close();
    }

    public static int getIdade() {
        return idade;
    }

    public static void setIdade(int idade) {
        exc5.idade = idade;
    }
}