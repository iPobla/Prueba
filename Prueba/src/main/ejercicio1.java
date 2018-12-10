/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import clase.Usuario;
import java.util.Scanner;
        
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dolar = 674;
        int numerocuenta;
        Scanner entrada1 = new Scanner (System.in);
        System.out.println("Ingrese número de cuenta: ");
        numerocuenta = entrada1.nextInt();
       
        String titular;
        Scanner entrada2 = new Scanner (System.in);
        System.out.println("Ingrese su nombre completo: ");
        titular = entrada2.nextLine();
        
        int saldo;
        Scanner entrada3 = new Scanner (System.in);
        System.out.println("Ingrese su saldo: ");
        saldo = entrada3.nextInt();
        
        int interes;
        Scanner entrada4 = new Scanner (System.in);
        System.out.println("Ingrese su interés: ");
        interes = entrada4.nextInt();
     
        
        int deposito;
        Scanner entrada5 = new Scanner (System.in);
        System.out.println("Digite cantidad a depositar: ");
        deposito = entrada5.nextInt();
        System.out.println("¡Su depósito ha sido realizado con éxito!");
        
        int giro;
        Scanner entrada6 = new Scanner (System.in);
        System.out.println("Digite cantidad a girar: ");
        giro = entrada6.nextInt();
        System.out.println("¡Gracias!");
        
        if (saldo>0){
            System.out.println("¡Su cuenta no está en números rojos!");
        }else{
            System.out.println("¡Su cuenta está en números rojos!");
        }
        
        System.out.println("Su saldo es de: "+saldo);
        
        System.out.println("El interes ganado es de: "+saldo/interes);
        
        System.out.println("Su dinero en dólares son: "+saldo/dolar+"dólares");
    }
}       
        
    
