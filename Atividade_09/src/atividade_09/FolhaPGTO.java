/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_09;

/**
 *
 * @author Pedro Ferreira Martins <'11201100435'>
 * @author Raphael Ninomiya <'112111009981'>
 */
public class FolhaPGTO {

    public static void main(String[] args) {
      
        Mensalista men1, men2;
        Horista hora1, hora2;
        
        // Empregados mensalistas
        
        // Empregado 1:
        men1 = new Mensalista("Jose", "Rua dos Marimbundas", "Junior");
        men1.calcularSalario();
        men1.calcularInss();
        System.out.println("Nome: " + men1.getNome());
        System.out.println("EnderecoNome: " + men1.getEnd());
        System.out.println("Salario: " + men1.getSalar());
        System.out.println("Desconto Inss: " + men1.getINSS() + "%");
        men1.Calc_IRPF();
        System.out.println();
        
        // Empregado 2:
        men2 = new Mensalista("Ana", "Rua Confim", "Senior");
        men2.calcularSalario();
        men2.calcularInss();
        System.out.println("Nome: " + men2.getNome());
        System.out.println("EderecoNome: " + men2.getEnd());
        System.out.println("Salario: " + men2.getSalar());
        System.out.println("Desconto Inss: " + men2.getINSS() + "%");
        men2.Calc_IRPF();
        System.out.println();
        
        // Empregados Horistas
        
        // Empregado 1:
        hora1 = new Horista("Carlos", "Rua Parece Ironia", 20);
        hora1.CalcSalario();
        System.out.println("Nome: " + hora1.getNome());
        System.out.println("EnderecoNome: " + hora1.getEnd());
        System.out.println("Salario: " + hora1.getSalar());
        System.out.println("Desconto Inss: " + hora1.getINSS() + "%");
        hora1.Calc_IRPF();
        System.out.println();
        
        // Empregado 2:
        hora2 = new Horista("Cristina", "Rua da Beirada", 100);
        hora2.CalcSalario();
        System.out.println("Nome: " + hora2.getNome());
        System.out.println("EnderecoNome: " + hora2.getEnd());
        System.out.println("Salario: " + hora2.getSalar());
        System.out.println("Desconto Inss: " + hora2.getINSS() + "%");
        hora2.Calc_IRPF();
        System.out.println();
    }
}
