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
public class Corrida {
    
    private int linhaChegada;
    //instanciando threads e definindo a quantidade
    ThreadGrilo[] threads;
    
    public Corrida(Grilo[] grilos, int linhaChegada){//ThreadGrilo[] grilo, int tamanhoCorrida){
        
        this.linhaChegada = linhaChegada;
        threads = new ThreadGrilo[grilos.length];
        
        //iniciando as threads
        for(int i = 0; i < grilos.length; i++){
            threads[i] = new ThreadGrilo(grilos[i], linhaChegada);
            threads[i].start();
        }
    
//        for(int i = 0; i < grilo.length; i++){
//            //grilo[i].run();
//            //grilo[i].getGrilo().pular();
//        }
    }
    
}
