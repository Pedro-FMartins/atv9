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
public class Horista extends Empregado{
    
    private double horas;
    
    // Construtor
    public Horista(String n, String e, double h){
        super(n, e);
        horas = h;
    }
    
    // Métodos de acesso
    public void setHoras(double h){
        this.horas = h;
    }
    
    public double getHoras(){
        return horas;
    }
    
    public void CalcSalario(){
        salario = horas * 50;
    }
}
