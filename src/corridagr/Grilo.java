/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corridagr;

import java.util.Random;

/**
 *
 * @author FAEL
 */
public class Grilo {
    
    private int distanciaRandomica;
    private String nome;
    
    public Grilo(String nome){
        this.setNome(nome);
    }
    
    public void pular(){
        this.setDistanciaRandomica(new Random().nextInt(50));
        //this.getDistanciaRandomica();
    }
    
    public int getDistanciaRandomica() {
        return distanciaRandomica;
    }

    public void setDistanciaRandomica(int distanciaRandomica) {
        this.distanciaRandomica = distanciaRandomica;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
