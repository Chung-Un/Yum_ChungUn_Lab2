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
        char caracter; 
        int usuarioOpcion, cantidadRepetidas, usuarionumeroCadena, conteocaracter=0;
        double nota1,nota2,nota3,nota4,notasSuma,promedio,notaMax, notaMin;
        String promediodecimal,notaMaxdecimal, notaMindecimal;
        
        System.out.println("Digite el numero del ejercicio que desea ver: \n1.Cadena\n2.Notas\n3.Clases");
        usuarioOpcion= entrada.nextInt();
        entrada.nextLine();
        
        switch(usuarioOpcion){
            case 1:
                System.out.println("Ingrese una cadena de texto:");
                usuarioCadena = entrada.nextLine();
                usuarionumeroCadena = usuarioCadena.length();
                
                while(conteocaracter<usuarionumeroCadena){
                
                    
                caracter = usuarioCadena.charAt(conteocaracter);
                conteocaracter++; //para separar los caracteres
                
                
                }    
                
                
                
                
                
             
                break;
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
                
                notaMax = Math.max(nota1, Math.max(nota2, Math.max(nota3, nota4)));
                notaMaxdecimal= String.format("%.2f", notaMax);
                notaMin = Math.min(nota1,Math.min(nota2, Math.min(nota3, nota4)));
                notaMindecimal = String.format("%.2f", notaMin);
                
                System.out.println("La nota maxima es: " + notaMaxdecimal + "%");
                System.out.println("La nota minima es: " + notaMindecimal + "%");
                
               
                
                }
                
                
            
            }
        
        
        }
        
        
       
    
    

