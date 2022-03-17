/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao02poo;

/**
 *
 * @author Windows
 */
public class conta {
    //atributos
    private float valor;
    private int conta;
    
    //métodos set e get
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    } 
    //metodo construtor
    public conta(float valor, int conta) {
        this.valor = valor;
        this.conta = conta;
    }
    
    //métodos
    public void credita(float valorCredito){
        this.valor = this.valor + valorCredito;
    }
    public void debita(float valorDebito){
        this.valor = this.valor - valorDebito;
    }
    public float consultaSaldo(){
        return this.valor;
    }
    
}
