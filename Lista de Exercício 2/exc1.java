import java.util.Scanner;

public class exc1 {
    // listalaco1.c

    private static int idade = 0;
	private static Double sal;

    exc1(int idade, Double sal) {
        exc1.idade = idade;
        exc1.sal = sal;
    }

    public static void consoleListalaco() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a idade: ");
        idade = sc.nextInt();
        System.out.print("Informe seu salario: ");
        sal = sc.nextDouble();

        for (int i = 0; i < 10; i++) {
            System.out.println(idade + " anos e ganha " + sal + " reais.");
        }
        
        sc.close();
    }

    public static int getIdade() {
        return idade;
    }

    public static void setIdade(int idade) {
        exc1.idade = idade;
    }

    public static Double getSal() {
        return sal;
    }

    public static void setSal(Double sal) {
        exc1.sal = sal;
    }
}