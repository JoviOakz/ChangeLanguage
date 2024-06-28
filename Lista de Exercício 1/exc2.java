import java.util.Scanner;

public class exc2 {
    // inssIR.c

    private static int codigo = 0, depen = 0, salarios = 0, cont = 0;
    private static float rendamensal = 0, valorinss = 0, valorfinalinss = 0, somasal = 0, valorimposto = 0,
            valorfinal = 0;
    private static float inssanual = 0, iranual = 0, resultado12salario = 0, valorcalculoIR = 0;

    exc2(int codigo, int depen, int salarios, int cont, float rendamensal, float valorinss, float valorfinalinss,
            float somasal, float valorimposto, float valorfinal, float inssanual, float iranual,
            float resultado12salario, float valorcalculoIR) {
        exc2.codigo = codigo;
        exc2.depen = depen;
        exc2.salarios = salarios;
        exc2.cont = cont;
        exc2.rendamensal = rendamensal;
        exc2.valorinss = valorinss;
        exc2.valorfinalinss = valorfinalinss;
        exc2.somasal = somasal;
        exc2.valorimposto = valorimposto;
        exc2.valorfinal = valorfinal;
        exc2.inssanual = inssanual;
        exc2.iranual = iranual;
        exc2.resultado12salario = resultado12salario;
        exc2.valorcalculoIR = valorcalculoIR;
    }

    public static void consoleInss() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual seu codigo: ");
        codigo = sc.nextInt();

        while (codigo > 0) {
            System.out.print("Quantos dependentes voce tem: ");
            depen = sc.nextInt();

            for (cont = 0; cont < 12; cont++) {
                System.out.print("Digite o " + (cont + 1) + "º salario bruto do ano: ");
                rendamensal = sc.nextInt();

                if (rendamensal <= 1399.12) {
                    valorinss = rendamensal * 0.08f;
                    System.out.println("INSS mensal: R$" + valorinss);
                } else if (rendamensal >= 1399.13) {
                    valorinss = rendamensal * 0.09f;
                    System.out.println("INSS mensal: R$" + valorinss);
                } else if (rendamensal >= 2331.89 && rendamensal < 4663.75) {
                    valorinss = rendamensal * 0.11f;
                    System.out.println("INSS mensal: R$" + valorinss);
                } else {
                    valorinss = 513.01f;
                    System.out.println("INSS mensal: R$" + valorinss);
                }

                valorfinalinss = rendamensal - valorinss;
                valorcalculoIR = valorfinalinss - (depen * 189.59f);

                if (valorcalculoIR <= 1903.98) {
                    valorfinal = valorfinalinss;
                    System.out.println("IR mensal: R$0,0");
                    System.out.println("Salario liquido: R$" + valorfinal);
                } else if (valorcalculoIR >= 1903.99) {
                    valorimposto = (valorcalculoIR * 0.075f) - 142.8f;
                    valorfinal = valorfinalinss - valorimposto;
                    System.out.println("IR mensal: R$" + valorimposto);
                    System.out.println("Salario liquido: R$" + valorfinal);
                } else if (valorcalculoIR >= 2826.66) {
                    valorimposto = (valorcalculoIR * 0.15f) - 354.8f;
                    valorfinal = valorfinalinss - valorimposto;
                    System.out.println("IR mensal: R$" + valorimposto);
                    System.out.println("Salario liquido: R$" + valorfinal);
                } else if (valorcalculoIR >= 3751.06 && valorcalculoIR <= 4664.68) {
                    valorimposto = (valorcalculoIR * 0.225f) - 636.13f;
                    valorfinal = valorfinalinss - valorimposto;
                    System.out.println("IR mensal: R$" + valorimposto);
                    System.out.println("Salario liquido: R$" + valorfinal);
                } else {
                    valorimposto = (valorcalculoIR * 0.275f) - 869.36f;
                    valorfinal = valorfinalinss - valorimposto;
                    System.out.println("IR mensal: R$" + valorimposto);
                    System.out.println("Salario liquido: R$" + valorfinal);
                }

                inssanual = valorinss * 12;
                iranual = valorimposto * 12;
                resultado12salario = valorfinal * 12;
            }

            System.out.println("INSS anual: R$" + inssanual);
            System.out.println("IR anual: R$" + iranual);
            System.out.println("Salario liquido: R$" + resultado12salario);
            System.out.println("");

            System.out.println("Qual o seu codigo");
            codigo = sc.nextInt();
        }

        sc.close();
    }

    public static int getCodigo() {
        return codigo;
    }

    public static void setCodigo(int codigo) {
        exc2.codigo = codigo;
    }

    public static int getDepen() {
        return depen;
    }

    public static void setDepen(int depen) {
        exc2.depen = depen;
    }

    public static int getSalarios() {
        return salarios;
    }

    public static void setSalarios(int salarios) {
        exc2.salarios = salarios;
    }

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        exc2.cont = cont;
    }

    public static float getRendamensal() {
        return rendamensal;
    }

    public static void setRendamensal(float rendamensal) {
        exc2.rendamensal = rendamensal;
    }

    public static float getValorinss() {
        return valorinss;
    }

    public static void setValorinss(float valorinss) {
        exc2.valorinss = valorinss;
    }

    public static float getValorfinalinss() {
        return valorfinalinss;
    }

    public static void setValorfinalinss(float valorfinalinss) {
        exc2.valorfinalinss = valorfinalinss;
    }

    public static float getSomasal() {
        return somasal;
    }

    public static void setSomasal(float somasal) {
        exc2.somasal = somasal;
    }

    public static float getValorimposto() {
        return valorimposto;
    }

    public static void setValorimposto(float valorimposto) {
        exc2.valorimposto = valorimposto;
    }

    public static float getValorfinal() {
        return valorfinal;
    }

    public static void setValorfinal(float valorfinal) {
        exc2.valorfinal = valorfinal;
    }

    public static float getInssanual() {
        return inssanual;
    }

    public static void setInssanual(float inssanual) {
        exc2.inssanual = inssanual;
    }

    public static float getIranual() {
        return iranual;
    }

    public static void setIranual(float iranual) {
        exc2.iranual = iranual;
    }

    public static float getResultado12salario() {
        return resultado12salario;
    }

    public static void setResultado12salario(float resultado12salario) {
        exc2.resultado12salario = resultado12salario;
    }

    public static float getValorcalculoIR() {
        return valorcalculoIR;
    }

    public static void setValorcalculoIR(float valorcalculoIR) {
        exc2.valorcalculoIR = valorcalculoIR;
    }
}