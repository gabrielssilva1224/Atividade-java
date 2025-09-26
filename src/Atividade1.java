import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário atual: R$ ");
        double salario = sc.nextDouble();
        double percentual = 0;

        if (salario <= 280.00) {
            percentual = 20;
        } else if (salario > 280.00 && salario <= 700.00) {
            percentual = 15;
        } else if (salario > 700.00 && salario <= 1500.00) {
            percentual = 10;
        } else {
            percentual = 5;
        }
        double aumento = salario * (percentual / 100);
        double novoSalario = salario + aumento;
        double inflacao = 3.8;
        double aumentoReal = aumento - (salario * (inflacao / 100));

        System.out.println("\n--- Resultado ---");
        System.out.println("Salário antes do reajuste: R$ " + salario);
        System.out.println("Percentual aplicado: " + percentual + "%");
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário: R$ " + novoSalario);
        System.out.println("Aumento real (descontando inflação): R$ " + aumentoReal);

        sc.close();
    }
}
