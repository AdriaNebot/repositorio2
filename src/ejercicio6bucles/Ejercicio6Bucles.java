
package ejercicio6bucles;

import java.util.Scanner;


public class Ejercicio6Bucles {

    
    public static void main(String[] args) {
       //creamos scanner
        
        
        //creamos variables
        int negativo;
        int numero;
        int positivo;
        //assignamos valor a las variables
       negativo=0;
        positivo=0;
        //pedimos al usuario
        for (int cont=0; cont<=10;cont++) {
             Scanner Teclado=new Scanner(System.in);
            System.out.println("Dame un numero");
            numero=Teclado.nextInt();
            
           if (numero==0) {              
               negativo++;
           }
           else
               positivo++;
           
        }
            
        if (negativo>0) 
            System.out.println("Hay numeros nulos");
        
        else
            System.out.println("No hay numeros nulos");
            
    }
    
}
