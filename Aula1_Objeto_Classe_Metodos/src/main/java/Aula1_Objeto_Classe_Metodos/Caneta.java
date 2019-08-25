/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula1_Objeto_Classe_Metodos;

/**
 *
 * @author xastre
 */
public class Caneta {
    
    /*********************
     * Atributos
     */
    
    public String cor_corpo;
    private String cor_tinta;

    /*********************
     * Métodos
     */
    
    /*********************
     * Construtor Simples
     */
    
    public Caneta() {
        System.out.println("Construtor da caneta ....");
    }
    
    
    /*********************
     * Getters and Setters
     *
     */

    public String getCor_corpo() {
        return cor_corpo;
    }

    public String getCor_tinta() {
        return cor_tinta;
    }

    public void setCor_corpo(String cor_corpo) {
        this.cor_corpo = cor_corpo;
        System.out.println("Atribuimos cor: "+this.cor_corpo+" nesta caneta.");
    }

    public void setCor_tinta(String cor_tinta) {
        this.cor_tinta = cor_tinta;
    }

}
