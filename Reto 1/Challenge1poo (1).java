
package challenge1poo;


import java.util.Scanner;



/**
 *
 * @author Mau
 */
public class Challenge1poo 

{
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
        Scanner scanner = new Scanner(System.in);
        
        // \n
        System.out.println("CALCULADORA BASICA JAVA \n \n");
        
        System.out.println("SELECCIONA UNA OPCION: ");
        
        System.out.println("1- Suma (PRESIONA A)\n2- Resta (PRESIONA B)\n3- Multiplicacion (PRESIONA C)\n4- Division (PRESIONA D)\n");
        
        System.out.print("Elige una operacion: ");
        char option = scanner.next().charAt(0);
        
        
        
        double dato1;
        double dato2;
        double result;
        
        switch (option)
        
        {
            case 'A':
                System.out.println("________________________ \n \n");
                
                        
                System.out.print("Dame el primer valor: ");
                dato1 = scanner.nextDouble();
                
                System.out.print("Dame el segundo valor: ");
                dato2= scanner.nextDouble();
                
                result = dato1 + dato2;
                
                System.out.println("El resultado es: " + result);
                
                break;
                
            case 'B':
                
                System.out.println("________________________ \n \n");
                
                        
                System.out.print("Dame el primer valor: ");
                dato1 = scanner.nextDouble();
                
                System.out.print("Dame el segundo valor: ");
                dato2= scanner.nextDouble();
                
                
                result = dato1 - dato2;
                
                System.out.println("El resultado es: " + result);
                
                break;
                
                
            case 'C':
                
                System.out.println("________________________ \n \n");
                
                        
                System.out.print("Dame el primer valor: ");
                dato1 = scanner.nextDouble();
                
                System.out.print("Dame el segundo valor: ");
                dato2= scanner.nextDouble();
                
                result = dato1 * dato2;
                
                System.out.println("El resultado es: " + result);
                
                break;
                
                
            case 'D':
                
                System.out.println("________________________ \n \n");
                
                        
                System.out.print("Dame el primer valor: ");
                dato1 = scanner.nextDouble();
                
                System.out.print("Dame el segundo valor: ");
                dato2= scanner.nextDouble();
                
                result = dato1 / dato2;
                
                System.out.println("El resultado es: " + result);
                
                break;
                
            
        }
    }
    
}
