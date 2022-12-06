/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pais1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Pais1 { 
String pais1;
String pais2;
String capital;
String capital2;
String vizinho;
int dimensao;
public void Pais_comparador(){
Scanner sc = new Scanner(System.in);
System.out.println("Insira o nome do pais1");
 this.pais1 = sc.next();

System.out.println("Insira o nome do pais 2");
 this.pais2 = sc.next();
    System.out.println("O pais e igual: "+pais1.equals(pais2));    
    System.out.println("Insira a capital");
 this.capital = sc.next();
    
    System.out.println("Insira a capital");
 this.capital2=sc.next();
    System.out.println("O pais e igual: "+capital.equals(capital2)); 
   
    System.out.println("Insira a dimensao do pais");

 this.dimensao = sc.nextInt();       
}
public void Get(){
System.out.print(this.pais1);
System.out.print(this.pais1);
System.out.println(this.capital);
System.out.println(this.capital2);
System.out.println(this.dimensao);
}
public void vizinho(){    
ArrayList<String> nomearr = new ArrayList(5);     
Scanner sc = new Scanner(System.in);
System.out.println("Insira países vizinhos");
vizinho = sc.next();
nomearr.add(vizinho);
vizinho = sc.next();
nomearr.add(vizinho);
vizinho = sc.next();
nomearr.add(vizinho);
vizinho = sc.next();
nomearr.add(vizinho);
vizinho = sc.next();
nomearr.add(vizinho);
for (String leitor:nomearr){
    System.out.println(" Os nomes impressos foram "+leitor);    
}}
      


public static void main(String[] args) {
Pais1 a = new Pais1();
a.Pais_comparador();
a.vizinho();        
        }
}
