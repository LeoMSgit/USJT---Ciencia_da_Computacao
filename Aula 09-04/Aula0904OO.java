
package aula0904oo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Aula0904OO {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Instanciar Aluno
        Aluno aluno1 = new Aluno();
        System.out.println("Primeiro aluno criado");
        System.out.println(aluno1.getRa());
        System.out.println(aluno1.getNome());
        System.out.println("");
        // Insatanciar Curso
        Curso curso1 = new Curso();
        System.out.println(curso1.getCodigo());
        System.out.println(curso1.getNome());
        System.out.println(curso1.getPeriodo());
        // Insatanciar Segundo Aluno
        String ra_novo = JOptionPane.showInputDialog(null ,"Digite o RA do Aluno: ");
        String nome_novo = JOptionPane.showInputDialog(null ,"Digite o Nome do Aluno: ");
        System.out.println("");
        Aluno aluno2 = new Aluno(ra_novo, nome_novo);
        System.out.println("Segundo aluno criado");
        System.out.println(aluno2.getRa());
        System.out.println(aluno2.getNome());
        //Instanciar Segundo Curso
        String codigo_novo_curso_str = JOptionPane.showInputDialog(null ,"Digite o Código do Curso: ");
        int codigo_novo_curso = Integer.parseInt(codigo_novo_curso_str);
        String nome_novo_curso = JOptionPane.showInputDialog(null ,"Digite o Nome do Curso: ");
        String periodo_novo = JOptionPane.showInputDialog(null ,"Digite o Período do Cruso: ");
        System.out.println("");
        Curso curso2 = new Curso(codigo_novo_curso, nome_novo_curso, periodo_novo);
        System.out.println("Segundo curso criado");
        System.out.println(curso2.getCodigo());
        System.out.println(curso2.getNome());
        System.out.println(curso2.getPeriodo());
    }
    
}
