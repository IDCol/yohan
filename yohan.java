/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author SENA
 */


public class yohan {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner yohan =new Scanner(System.in);
        
        double num1;
        double num2;
        int suma;
        int resta;
        int multiplicacion;
       double division;
        int resto;
        
        System.out.print("Ingrese el primer numero");
        num1 = yohan.nextDouble();
        
        System.out.print("Ingrese el segundo numero");
        num2 = yohan.nextDouble();
        
        while(num2 ==0  ){
            System.out.print("el segundo numero no puede ser 0 dijite nuevamente el numero");
             num2 = yohan.nextInt();
        }
            
        suma = (int) (num1 + num2);
        resta = (int) (num1 - num2);
        multiplicacion = (int) (num1 * num2);
        division = num1 / num2;
        resto =(int) (num1 % num2);
        
        System.out.println("la suma es: " + suma);
        System.out.println("la resta es: " + resta);
        System.out.println("la multiplicacion es: " + multiplicacion);
        System.out.println("la division es: " + division);
        System.out.println("el resto es: " + resto);
       
        yohan.close();
    }
}
