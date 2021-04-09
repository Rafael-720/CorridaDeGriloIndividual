/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corridagr;

/**
 *
 * @author FAEL
 */
public class CorridaGr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //numero de grilos
        int numGrilos = 4;
        
        //tamanho da corrida
        int linhaChegada = 200;
        
        //instanciando grilos
        Grilo[] grilos = new Grilo[numGrilos]; 
        
        //instanciando threads e definindo a quantidade
        //ThreadGrilo[] threads = new ThreadGrilo[numGrilos];
        
        //criando a corrida
        Corrida corrida;
        
        //inicializando grilos
        for(int i = 0; i < numGrilos; i++){
            grilos[i] = new Grilo("Grilo_" + (i+1));
        }
        
        //iniciando as threads
//        for(int i = 0; i < numGrilos; i++){
//            threads[i] = new ThreadGrilo(grilos[i]);
//        }
        
        corrida = new Corrida(grilos, linhaChegada);
        
    }
    
}
