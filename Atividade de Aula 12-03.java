//Exercício 1) Passar o código a seguir para a linguagem Java

//Algoritmo ExEntrada
//Declarar
//nome : alfanumérico;
//Início
//Mostrar(“Qual é o seu nome?”);
//Ler (nome)
//Mostrar ( “Já sei o seu nome ! É ”, nome);
//Fim.

//R: import java.util.Scanner;

public class ExEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Já sei o seu nome! É " + nome);
    }
}



//Python: 
//Nome = input(“Qual é o seu nome?”)
//print(“Já sei o seu nome ! É {}”.format(Nome))


//Exercício 2) A loja Compre Mais está vendendo seus produtos em 5 (cinco) prestações sem juros.
//Faça um programa que receba um valor de uma compra e mostre o valor das prestações.
//R: 
import java.util.Scanner;

public class Prestacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        float valorCompra = scanner.nextFloat();

        float valorPrestacao = valorCompra / 5;

        System.out.println("O valor de cada prestação é: " + valorPrestacao);
    }
}




//Python:
//X = float(input("Digite o valor total da compra: ")) 
//print("O valor de R${} é dividido em 5 prestações de R${} sem juros.".format(X, float(X/5)))





//Exercício 3) Complemente o primeiro exercício, lendo o seu último nome e mostrando o primeiro e último nome.
//R: 
//import java.util.Scanner;

public class ExEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu primeiro nome?");
        String Nome1= scanner.nextLine();

        System.out.println("Qual é o seu último nome?");
        String Nome2 = scanner.nextLine();

        System.out.println("Já sei o seu nome! É: " + Nome1 + " " + Nome2);

     }
}


//Python:
//Nome1 = input("Qual é o seu primeiro nome?") 
//Nome2 = input("E seu sobrenome?") 
//print("Já sei o seu nome ! É {} {}".format(Nome1, Nome2))
