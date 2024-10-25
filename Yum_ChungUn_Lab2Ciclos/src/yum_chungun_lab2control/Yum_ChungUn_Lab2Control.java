/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yum_chungun_lab2control;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Yum_ChungUn_Lab2Control {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String usuarioCadena;
        char caractermasUsado; 
        int usuarioOpcion, cantidadRepetidas;
        double nota1,nota2,nota3,nota4,notasSuma,promedio;
        String promediodecimal;
        
        System.out.println("Digite el numero del ejercicio que desea ver: \n1.Cadena\n2.Notas\n3.Clases");
        usuarioOpcion= entrada.nextInt();
        
        switch(usuarioOpcion){
            case 1:
                System.out.println("Ingrese una cadena de texto:");
                usuarioCadena = entrada.nextLine();
                
                System.out.println (usuarioCadena.length());
            
                
            case 2: 
                
                System.out.println("Ingrese la nota numero 1: ");
                nota1= entrada.nextDouble();
                while(nota1 <0 || nota1>100){
                System.out.println("Ingrese una nota valida: ");
                nota1 = entrada.nextDouble();}
                
                System.out.println("Ingrese la nota numero 2: ");
                nota2= entrada.nextDouble();
                while(nota2 <0 || nota2>100){
                System.out.println("Ingrese una nota valida: ");
                nota2 = entrada.nextDouble();}
                
                System.out.println("Ingrese la nota numero 3: ");
                nota3= entrada.nextDouble();
                while(nota3 <0 || nota3>100){
                System.out.println("Ingrese una nota valida: ");
                nota3 = entrada.nextDouble();}
                
                System.out.println("Ingrese la nota numero 4: ");
                nota4= entrada.nextDouble();
                while(nota4 <0 || nota4>100){
                System.out.println("Ingrese una nota valida: ");
                nota4 = entrada.nextDouble();}
                
                notasSuma= nota1+nota2+nota3+nota4;
                promedio = notasSuma/4;
                promediodecimal = String.format("%.2f", promedio);
                
                System.out.println("El promeido de sus notas es: " + promediodecimal + "%");
                
                
                }
                
                
            
            }
        
        
        }
        
        
       
    
    

