import java.util.Scanner;

public class exc4 {
    // listacondicional1.c

    private static String sexo;
	private static String nome;
	private static int idade;

    exc4(String sexo, String nome, int idade) {
        exc4.sexo = sexo;
        exc4.nome = nome;
        exc4.idade = idade;
    }

    public static void consoleListacondi() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual seu nome? ");
        nome = sc.nextLine();

        System.out.print("Qual sua idade? ");
        idade = sc.nextInt();

        System.out.print("Informe seu sexo (M - masculino / F - feminino): ");
        sexo = sc.nextLine();

        System.out.println("O nome fornecido foi: " + nome);
        System.out.println("A idade fornecida foi: " + idade);

        if (sexo == "M") {
            System.out.println("O sexo fornecido foi: Masculino");

            if (idade >= 18 && idade <= 65) {
                System.out.println(nome + " está entre 18 e 65 anos de idade");
            }
        } else {
            System.out.println("O sexo fornecido foi: Feminino");

            if (idade >= 18 && idade <= 65) {
                System.out.println(nome + " está entre 18 e 65 anos de idade");
            }
        }

        sc.close();
    }

    public static String getSexo() {
        return sexo;
    }

    public static void setSexo(String sexo) {
        exc4.sexo = sexo;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        exc4.nome = nome;
    }

    public static int getIdade() {
        return idade;
    }

    public static void setIdade(int idade) {
        exc4.idade = idade;
    }
}