/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_Objeto_Classe_Metodos;

/**
 *
 * @author xastre
 */
public class Condutor {
    
    /*************************
     * Atributos
     */

    public String nome;
    public int idade;
    public String nacionalidade;
    
    /************************
     * Métodos
     */
    
    
    /**********************
     * Construtores
     */
    public Condutor() {
        
    }

    public Condutor(String nome) {
        this.nome = nome;
    }

    public Condutor(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }
    
    
    /**********************
     * Funções Getters e Setter
     * 
     */
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    /************************
     * Implementando um método extra para mostrar, em sala de aula,
     * formas de funcionamento dos objetos.
     */
    
    public void imprimirParametros()
    {
        System.out.println("Nome do condutor: "+this.getNome()+" / Idade: "+this.getIdade()+" / Nacionalidade: "+this.getNacionalidade());
    }
    
    
    
       
    
    
}
