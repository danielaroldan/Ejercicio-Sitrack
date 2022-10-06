/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejerciciositrack;

import java.io.IOException;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author danie
 */
public class EjercicioSitrack {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una URL");
        String entradaUrl = input.nextLine();
        //Abrimos URL
        Document UrlPl = Jsoup.connect(entradaUrl).get();
        //guardamos la pag en un string
        String randomText = UrlPl.text();
        //Ingresamos la pagina a buscar
        System.out.println("Ingrese la frase a buscar:");
        String loQBusco = input.nextLine();
        // Guardo en un array la frase y cuento las palabras
        String[] palabras = loQBusco.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            System.out.println("La palabra: "+palabra+": " + "aparece:  "+ contador (randomText,palabra)+ " veces");
            
        }
       
        
        
        System.out.println("cantidad de palabras de la frase: "+palabras.length);
        System.out.println("URL buscada: "+randomText);
        System.out.println(" La frase que busco: " + loQBusco + " " +"Aparece: "+ contador (randomText,loQBusco) + " veces");
        
        
    }
       
       public static int contador(String randomText,String loQBusco){
        int times = 0;
            for (int i = 0; i <randomText.length(); i++) {
            //si encuentra la frase la agregamos a un contador
                if (randomText.substring(i).startsWith(loQBusco)) {
                  times++;
                }
            }
         return times;  
       }   
    
} 

