import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite o valor da sua hora de trabalho: ");
    float valordahora = new Scanner(System.in).nextFloat();
    System.out.println("Digite quantas horas voce trabalha por dia: ");
    int horastrabalhadas = new Scanner(System.in).nextInt();
    int quantidadededias = 22; //estimativa de dias úteis em um mês
    System.out.printf("O seu salario, em um mes, eh de: %.2f", (valordahora * horastrabalhadas) * quantidadededias);
    }
}
