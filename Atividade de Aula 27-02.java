//1) Desenvolver um programa Java para entrar com dois números do tipo real e fazer as operações aritméticas. No final mostrar os resultados.

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double Numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double Numero2 = scanner.nextDouble();

        double soma = Numero1 + Numero2;
        double subtracao = Numero1 - Numero2;
        double multiplicacao = Numero1 * Numero2;
        double divisao = Numero1 / Numero2;

        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da subtração é: " + subtracao);
        System.out.println("O resultado da multiplicação é: " + multiplicacao);
        System.out.println("O resultado da divisão é: " + divisao);
