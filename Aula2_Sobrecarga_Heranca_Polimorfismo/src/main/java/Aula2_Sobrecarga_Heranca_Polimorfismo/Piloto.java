/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula2_Sobrecarga_Heranca_Polimorfismo;

/**
 * Classe Piloto serve para exemplificar os conceitos de herança, herdando de Condutor.
 * @author xastre
 */
public class Piloto extends Condutor{
    
    /**************************
     * Atributos
     */
    public int nivelHabilidade;

    
    /*************************
     * Métodos
     */
    
    
    /*************************
     * Construtores
     */
    public Piloto() {
    }

    public Piloto(int nivelHabilidade, String nome, int idade, String nacionalidade) {
        super(nome, idade, nacionalidade);
        this.nivelHabilidade = nivelHabilidade;
    }

    
    /************************
     * Getters and Setters
     * Reparem que temos os atributos da Classe que herdamos
     * @return 
     */
    
    public int getNivelHabilidade() {
        return nivelHabilidade;
    }

    public void setNivelHabilidade(int nivelHabilidade) {
        this.nivelHabilidade = nivelHabilidade;
    }

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
    
    
    /*******************************
     * Implementação de um metodo para demonstrar a herança como ocorreu (ou não).
     */
    public void imprimirParametros()
    {
        System.out.println("Nome do PILOTO: "+this.getNome()+" / Idade: "+this.getIdade()+" / Nacionalidade: "+this.getNacionalidade()+" / Habilidade = "+this.getNivelHabilidade());
        super.imprimirParametros();
    }
    
}
