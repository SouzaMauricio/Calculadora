/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.calculadora.controller;

import br.com.calculadora.beans.BeansCalcular;

/**
 *
 * @author ADM
 */
public class ControllCalcular {
    public static String calcular(BeansCalcular obj){
        try{
            float res = 0;
            switch(obj.getOperacao()){
                case "+":
                    res = obj.getVal1() + obj.getVal2();
                    break;
                case "-":
                    res = obj.getVal1() - obj.getVal2();
                    break;
                case "/":
                    res = obj.getVal1() / obj.getVal2();
                    break;
                case "*":
                    res = obj.getVal1() * obj.getVal2();
                    break;
            }        
            return String.valueOf(res);
           }
        catch(Exception ex){
            return ex.getMessage();
        }        
    }
}
