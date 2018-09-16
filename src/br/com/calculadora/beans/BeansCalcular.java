/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.calculadora.beans;

/**
 *
 * @author ADM
 */
public class BeansCalcular {
    private float val1;
    private float val2;
    private String operacao;
    private String memoria;
    
    public void setVal1(float val1){
        this.val1 = val1;
    }
    
    public void setVal2(float val2){
        this.val2 = val2;
    }
    
    public void setOperacao(String operacao){
        this.operacao = operacao;
    }
    
    public void setMemoria(String memoria){
        this.memoria = memoria;
    }
    
    public float getVal1(){
        return this.val1;
    } 
    
    public float getVal2(){
        return this.val2;
    }    
    
    public String getOperacao(){
        return this.operacao;
    }
    
    public String getMemoria(){
        return this.memoria;
    }
}
