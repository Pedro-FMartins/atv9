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
public class Mensalista extends Empregado {
    
    private String cargo;
    
    // Construtor
    public Mensalista(String n, String e, String c){
        super(n, e);
        cargo = c;
    }
    
    // Métodos de acesso
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public String getCargo(){
        return (cargo);
    }
    
    public void calcularSalario(){
        if(cargo.equals("Junior")){
            salario = 2500;
        } else if(cargo.equals("Pleno")){
            salario = 3500;
        } else if(cargo.equals("Senior")){
            salario = 5500;
        }
        else{
            System.out.println("Opção inválida!");
        }
    }
}
