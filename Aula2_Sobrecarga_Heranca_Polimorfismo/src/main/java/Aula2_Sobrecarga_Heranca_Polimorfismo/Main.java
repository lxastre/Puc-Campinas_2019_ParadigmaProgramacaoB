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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Carro instanciaCarro = new Carro();
        instanciaCarro.setAnoFabricacao(2018);
        instanciaCarro.setFabricante("VW");
        instanciaCarro.setModelo("Gol");
        
        instanciaCarro.imprimirInformacoes();
        
        instanciaCarro.fechaPortaMotorista();
        instanciaCarro.abrePortaMotorista();
        instanciaCarro.fechaPortaMotorista();
        
        instanciaCarro.atualizaKmRodados(10);
        instanciaCarro.imprimirInformacoes();
        
        instanciaCarro.atualizaKmRodados(100);
        instanciaCarro.imprimirInformacoes();
        
        instanciaCarro.qtdCilindros(3);
        instanciaCarro.roncoDoMotor();
        
        Condutor instanciaCondutor1 = new Condutor();
        instanciaCondutor1.imprimirParametros();
        
        Condutor instanciaCondutor2 = new Condutor("Roberto");
        instanciaCondutor2.imprimirParametros();
        
        Condutor instanciaCondutor3 = new Condutor("Rodrigo", 30, "Polones");
        instanciaCondutor3.imprimirParametros();
        
        Piloto instanciaPiloto1 = new Piloto(100, "Carlos", 20, "Brasileiro");
        instanciaPiloto1.imprimirParametros();
        
        
        Moto instanciaMoto = new Moto();
        instanciaMoto.qtdCilindros(1);
        instanciaMoto.roncoDoMotor();
        
        


    }
    
}
