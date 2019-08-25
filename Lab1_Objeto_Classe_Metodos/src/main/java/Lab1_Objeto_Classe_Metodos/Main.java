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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carro instanciaCarro = new Carro();
        System.out.println("Construtor Vazio!");
        instanciaCarro.imprimirInformacoes();
        
        instanciaCarro.setAnoFabricacao(2018);
        instanciaCarro.setCorCarroceria("Vermelho");
        instanciaCarro.setFabricante("VW");
        instanciaCarro.setKmRodados(19000);
        instanciaCarro.setModelo("Up");
        instanciaCarro.setQtd_passageiros(5);
        instanciaCarro.setQtd_portas(3);
        instanciaCarro.setQtd_rodas(4);
        instanciaCarro.setStatusPortaMotorista(true);
        System.out.println("Depois de usar os metodos SETTERS ....");
        instanciaCarro.imprimirInformacoes();
        
        Carro instanciaCarro1 = new Carro("Preto", 4, 5, 5, "Onix", "GM", false, 0, 2019);
        System.out.println("Segundo Objeto, mas usando o contrutor completo");
        instanciaCarro1.imprimirInformacoes();
    }
    
}
