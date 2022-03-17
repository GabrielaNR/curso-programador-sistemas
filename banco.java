/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.questao02poo;
import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        float valor;
        
    conta c1 = new conta(100.0f , 123456);
    
    while(true){
        System.out.println("Selecione a opção desejada: ");
        System.out.println("1 - Depósito \n 2 - Saque \n 3 - Saldo \n 4 - Sair");
        opcao = input.nextInt();
        
        if (opcao == 4) break;
        
        switch(opcao){
            case 1:
                System.out.println("Digite o valor a ser depositado: ");
                valor = input.nextFloat();
                c1.credita(valor);
                break;
            case 2:
                System.out.println("Digite o valor a ser sacado: ");
                valor = input.nextFloat();
                c1.debita(valor);
                break;
            case 3:
                System.out.println(c1.consultaSaldo());
                break;
            default:
                System.out.println("Opção inválida! Tente novamente!");
        }
    }
        
    }
    
}
