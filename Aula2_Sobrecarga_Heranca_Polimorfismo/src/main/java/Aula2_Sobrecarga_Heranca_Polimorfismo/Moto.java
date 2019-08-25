/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula2_Sobrecarga_Heranca_Polimorfismo;

/**
 *
 * @author xastre
 */
public class Moto extends Motor{
    
    /****************************
     * Classe Moto usada para exemplificar os conseitos de Polimorfismo
     * em conjunto com a classe Carro
     */

    
    /***************************
     * Construtor vazio
     */
    public Moto() {
    }
    
    /***************************
     * Implementado o Polimorfismo na visão da Moto
     * 
     */
    public void qtdCilindros(int cilindros)
    {
        System.out.println("Cilindros da Moto: "+cilindros);
    }
    
    public void roncoDoMotor()
    {
        System.out.println("Moto da MOTO roncando: Rooommm Rooommmmm ...");
    }
    
    
}
