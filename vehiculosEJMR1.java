package evaluacion;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author E.J.M.R
 */



public class vehiculosEJMR1 {
    static Scanner leer=new Scanner(System.in);
   
    public static void EjercicioN4(){
          int[] arreglo={1,10,9,8,11,7,6,12,2,3,4,5};
          int dato;
          boolean fals= false;
          
          System.out.println("DIJITE EL MES A BUSSCAR");
          dato =leer.nextInt();
          int i=0;
          while(i<12 && fals == false){
              if(arreglo [i] == dato){
                  fals= true;
              }
              i++;
          }
          
          if (fals== false){
              System.out.println("EL MES NO SE ENCUENTRA EN EL ARREGLO");
          }
          else{
              System.out.println("El número ha sido encontrado en la posición "+(i-1));
          }
    }
    
    public static void main(String[] args) {
        System.out.println("INGRESA LA OPCION DEL NUMERO QUE DESEA PROBAR");
        Scanner leer=new Scanner (System.in);
        int opcion=leer.nextInt();
        while (opcion!=0){
            switch (opcion){
                case 4:EjercicioN4();break;
                case 1:EjercicioN4();break;
                
                default:System.out.println("OPCION INVALIDA!!! ");b reak; 
            }
            System.out.println("INGRESE LA OPCION DEL ALGORITMO QUE DESEA PROBAR");
            opcion= leer.nextInt();
        }
    }
    
    
}
