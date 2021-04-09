/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corridagr;

import java.util.logging.Level;
import java.util.logging.Logger;

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
            
            //System.out.println("Thread " + i + " iniciada");
        }
        
//        if(threads[i].getTotalPercorrido() >= this.linhaChegada){
//                System.out.println("O " + threads[i].getGrilo().getNome() + " é o " + i + "° colocado");
//            }
//        for(int i = 0; i < grilos.length; i++){
//            try {
//                threads[i].join();
//                //System.out.println("o " + threads[i].getGrilo().getNome() + " foi o " + (i + 1) + "° colocado");
//            } catch (InterruptedException ex) {
//                //Logger.getLogger(Corrida.class.getName()).log(Level.SEVERE, null, ex);
//                ex.printStackTrace();
//            }
//        }
        
        
    
//        for(int i = 0; i < grilo.length; i++){
//            //grilo[i].run();
//            //grilo[i].getGrilo().pular();
//        }
    }
    
}
