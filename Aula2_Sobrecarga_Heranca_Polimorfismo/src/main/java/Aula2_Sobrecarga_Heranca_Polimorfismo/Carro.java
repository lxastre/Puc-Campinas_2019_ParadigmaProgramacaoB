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
public class Carro extends Motor{
    
    /******** Atributos ********/
    
    public String corCarroceria;
    public int qtd_rodas;
    public int qtd_passageiros;
    public int qtd_portas;
    public String modelo;
    public String fabricante;
    
    /******* Atributos adicionais ***/
    public boolean statusPortaMotorista;
    public int kmRodados;
    public int anoFabricacao;
    
    /**************************/
    
    
    /******** Metodos ********/
    
    /**************************
     * Construtores
     */
    public Carro() {
    }

    public Carro(String corCarroceria, int qtd_rodas, int qtd_passageiros, int qtd_portas, String modelo, String fabricante, boolean statusPortaMotorista, int kmRodados, int anoFabricacao) {
        this.corCarroceria = corCarroceria;
        this.qtd_rodas = qtd_rodas;
        this.qtd_passageiros = qtd_passageiros;
        this.qtd_portas = qtd_portas;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.statusPortaMotorista = statusPortaMotorista;
        this.kmRodados = kmRodados;
        this.anoFabricacao = anoFabricacao;
    }
    
    

    /**************************
     * Getters e Setters
     * @return 
     */
    public String getCorCarroceria() {
        return corCarroceria;
    }

    public void setCorCarroceria(String corCarroceria) {
        this.corCarroceria = corCarroceria;
    }

    public int getQtd_rodas() {
        return qtd_rodas;
    }

    public void setQtd_rodas(int qtd_rodas) {
        this.qtd_rodas = qtd_rodas;
    }

    public int getQtd_passageiros() {
        return qtd_passageiros;
    }

    public void setQtd_passageiros(int qtd_passageiros) {
        this.qtd_passageiros = qtd_passageiros;
    }

    public int getQtd_portas() {
        return qtd_portas;
    }

    public void setQtd_portas(int qtd_portas) {
        this.qtd_portas = qtd_portas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**********
     * Reparem que o get de um boolean é diferente dos outros.
     * @return 
     */
    public boolean isStatusPortaMotorista() {
        return statusPortaMotorista;
    }

    public void setStatusPortaMotorista(boolean statusPortaMotorista) {
        this.statusPortaMotorista = statusPortaMotorista;
    }

    public int getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(int kmRodados) {
        this.kmRodados = kmRodados;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    
    
    /************
     * Métodos desenvolvidos para resolver os 
     * requisitos do exercício de laboratório
     */
    
    
    public int atualizaKmRodados(int acrescentar)
    {
        this.setKmRodados(this.getKmRodados() + acrescentar);
        System.out.println("O carro ja rodou: "+this.getKmRodados());
        return this.getKmRodados();
    }
    
    public void imprimirInformacoes()
    {
        System.out.println(this.getFabricante()+" / "+this.getModelo()+" ano "+this.getAnoFabricacao()+" KM rodados: "+this.getKmRodados());
    }
    
    public void abrePortaMotorista()
    {
        if(!this.isStatusPortaMotorista())
        {
            System.out.println("Abrindo porta...");
            this.setStatusPortaMotorista(true);
        }
        else
        {
            System.out.println("Porta ja aberta ....");
        }
    }
    
    public void fechaPortaMotorista()
    {
        if(this.isStatusPortaMotorista())
        {
            System.out.println("Fechando porta ...");
            this.setStatusPortaMotorista(false);
        }
        else
            System.out.println("Porta ja fechada ...");
    }
    
    /********************
     * Polimorfismo de Motor
     * 
     */
    
    public void qtdCilindros(int cilindros)
    {
        System.out.println("Cilindros do CARRO: "+cilindros);
    }
    
    public void roncoDoMotor()
    {
        System.out.println("Motor potente roncando: Zunnn Zunnn ...");
    }
            
    
}
