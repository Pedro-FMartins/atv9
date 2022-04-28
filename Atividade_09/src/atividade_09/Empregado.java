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
public class Empregado {

    protected String nome;
    protected String endereco;
    protected double salario;
    protected double Calc_IRPF;

    // Construtor
    public Empregado(String nome, String endereco) {

        this.nome = nome;
        this.endereco = endereco;
    }

    // Métodos de acesso:
    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getEnd() {

        return endereco;
    }

    public void setEnd(String endereco) {

        this.endereco = endereco;
    }

    public double getSalar() {

        return salario;
    }

    public void setSalar(double salario) {

        this.salario = salario;
    }

    public void Calc_IRPF() {

        double desc_irpf;

        if (salario < 1903.98) {

            desc_irpf = 0;
            System.out.println("Não haverá desconto IRPF no salário.");
        } else if (1903.99 < salario & salario < 2826.65) {

            desc_irpf = (double) (salario - (salario * 0.075));
            System.out.println("Salario com desconto IRPF: " + desc_irpf + " reais.");
        } else if (2826.66 < salario & salario < 3751.05) {

            desc_irpf = (double) (salario - (salario * 0.15));
            System.out.println("Salario com desconto IRPF: " + desc_irpf + " reais.");
        } else if (3751.06 < salario & salario < 4664.68) {

            desc_irpf = (double) (salario - (salario * 0.225));
            System.out.println("Salario com desconto IRPF: " + desc_irpf + " reais.");
        } else {

            desc_irpf = (double) (salario - (salario * 0.275));
            System.out.println("Salario com desconto IRPF: " + desc_irpf + " reais.");
        }
    }

    public double getIRPF() {
        return Calc_IRPF;
    }

    public double calcularInss() {
        double desconto;
        
        if (salario < 1903.98) {
            desconto = 0;
        } else if (1903.99 < salario & salario < 2826.65) {
            desconto = 7.5;
        } else if (2826.66 < salario & salario < 3751.05) {
            desconto = 15;
        } else if (3751.06 < salario & salario < 4664.68) {
            desconto = 22.5;
        } else {
            desconto = 27.5;
        }
        return desconto;
    }
    
    public double getINSS(){
        return calcularInss();
    }
}
