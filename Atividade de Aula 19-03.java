//1) Monte um programa que realiza as seguintes operações:
//- Se o valor for negativo, apresente o valor absoluto
//- Se o valor for maior que 0 e menor ou igual a 20
//- Se o valor for maior que 20, monstrar o valor
//- Se o valor for zero, monstrar o valor

package com.mycompany.aula1903;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Aula1903 {
    public static void main(String[] args) {
                
        String input = JOptionPane.showInputDialog(null ,"Insira um número: ");
        double Numero = Double.parseDouble(input);
        
        if (Numero < 0){
            JOptionPane.showMessageDialog(null ,"O resultado é " + Numero*-1);}
        else{
            {if (Numero > 0 && Numero <= 20){
            JOptionPane.showMessageDialog(null ,"O resultado é " + Numero*2);}
            else if (Numero > 20) {
            JOptionPane.showMessageDialog(null ,"O resultado é " + Numero);}
            else {
            JOptionPane.showMessageDialog(null,"Zero");}
        }
}
}
}
