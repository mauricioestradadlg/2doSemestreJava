/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poreto2;

import java.util.Scanner;



/**
 *
 * @author Igor Sungmin
 */
public class PoReto2 


{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
        Scanner n = new Scanner(System.in);
        
        
        System.out.print("Dame el primer valor: ");
        int value1 = n.nextInt();
        
        System.out.print("Dame el segundo valor: ");
        int value2 = n.nextInt();


        if (amigos(value1, value2)) 
        {
            System.out.println("Los valores de " + value1 + " y " + value2 + " son numeros amigos.");
        } 
        
        else 
        
        {
            System.out.println("Los valores de " + value1 + " y " + value2 + " no son numeros amigos.");
        }
        
        

        
        
    }
    
        public static int problema (int value) 
        
        {
        int addition = 0;
        for (int i = 1; i <= value / 2; i++) 
        {
            if (value % i == 0) 
            {
                addition += i;
            }
        }
        return addition;
        }
        
        public static boolean amigos (int value1, int value2) 
        
        {
            
        return (problema(value1) == value2) 
                
        && (problema(value2) == value1);
        
        
        }
    
    
        
}
