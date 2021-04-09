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
public class ThreadGrilo extends Thread{
    
    private Grilo grilo;
    private int linhaChegada;
    private int totalPercorrido = 0;
    private int pulos = 0;
    

    public ThreadGrilo(Grilo g, int linhaChegada) {
        this.setGrilo(g);
        this.linhaChegada = linhaChegada;
        
    }
    
    
    @Override
    public void run(){
        
        if(totalPercorrido < linhaChegada){
            
            pulos++;
            
            this.grilo.pular();
            
            this.totalPercorrido += this.grilo.getDistanciaRandomica();
            
            if(this.totalPercorrido >= this.linhaChegada){                
                System.out.println("O " + this.grilo.getNome() + " pulou " + this.grilo.getDistanciaRandomica() +
                    "cm e cruzou a linha de chegada percorrendo " + this.totalPercorrido + "cm");
            }else{
                System.out.println("O " + this.grilo.getNome() + " pulou " + this.grilo.getDistanciaRandomica() +
                    "cm e já percorreu " + this.totalPercorrido + "cm");
            }
            
            
            
                    
            this.run();
        }else{
            System.out.println(this.grilo.getNome() + " alcançou a linha de chegada com " + pulos + " pulos");
        }
        
        
        
    }

    
    public Grilo getGrilo() {
        return grilo;
    }

    public void setGrilo(Grilo grilo) {
        this.grilo = grilo;
    }

    
    
    
}
