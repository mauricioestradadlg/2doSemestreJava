/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto3;
import java.util.Scanner;

/**
 *
 * @author Mau
 */
public class Reto3 

{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    
    {
                Scanner scanner = new Scanner (System.in);
       
        boolean cycle = true;
       
        while (cycle)
        {
           
            int opcion = menu();
           
           
            switch (opcion)
           
            {
                case 1:
                   
                    linea();
                    
                    System.out.print("Escribe un valor decimal: ");
                    int decimalnumber1 = scanner.nextInt();
       
                    String binario = DecimalBinario(decimalnumber1);
       
                    System.out.println("El numero " + decimalnumber1 + " en binario es: " + binario);
                    
                   
                   
                    int option = continuar();
                   
                    if (option == 1)
                    {
                        linea();
                    }
                   
                    else if (option == 2)
                    {
                        cycle =false;
                    }  
                   
                    break;
                   
                case 2:
                   
                    linea();
                    
                    
                    System.out.print("Escribe un valor decimal: ");
                    int decimal = scanner.nextInt();
                    
                    String numeroOctal = DoubleOctal(decimal);
                    System.out.println(decimal + " en octal es: " + numeroOctal);
                    
                  
                   
                    option = continuar();
                   
                    if (option == 1)
                    {
                        linea();
                    }
                   
                    else if (option == 2)
                    {
                        cycle =false;
                    }  
                    break;
                   
                   
                case 3:
                   
                    linea();
                    
                    System.out.print("Escribe un numero binario: ");
                    String myBinario = scanner.nextLine();
                    
                    int myInt = BinarioDecimal(myBinario);
                    System.out.println(myBinario + " en decimal seria: " + myInt);
                    
                    
                   
                    option = continuar();
                   
                    if (option == 1)
                    {
                        linea();
                    }
                   
                    else if (option == 2)
                    {
                        cycle =false;
                    }  
                   
                   
                    break;

                   
                   
                case 4:
                   
                     linea();
                    
                    System.out.print("Escribe un numero octal: ");
                    String myOctal = scanner.nextLine();
                    
                    double myDouble = OctalDouble(myOctal);
                    System.out.println(myOctal + " en decimal seria: " + myDouble);
                   
                    option = continuar();
                   
                    if (option == 1)
                    {
                        linea();
                    }
                   
                    else if (option == 2)
                    {
                        cycle =false;
                    }  
                   
                   
                    break;
                   
                   
                case 5:
                   
                    linea();
                    
                    System.out.print("Escribe un numero hexadecimal: ");
                    String myHexadecimal = scanner.nextLine();
                    
                    int decimal2 = HexadecimalDouble(myHexadecimal);
                    
                    System.out.println("Numero en decimal: " + decimal2);

                   
                    option = continuar();
                   
                    if (option == 1)
                    {
                        linea();
                    }
                   
                    else if (option == 2)
                    {
                        cycle =false;
                    }  
                   
                   
                    break;
                   
                case 6:
                    
                    cycle = false;
                    
                    break; 
                    
                default:
                    break;
            }
    }
    }
    
    public static void linea()
   
    {
        System.out.println("_________________________________");
       
    }
   
    public static int menu()
    {
         Scanner scanner = new Scanner (System.in);
         
         System.out.println("CALCULADORA RETO 3");
         
         linea();
         
         System.out.print("1-Decimal a Binario (Presiona 1) \n2-Decimal a Octal (Presiona 2) \n3-Binario a Decimal (Presiona 3) \n4-Octal a Decimal (Presiona 4) \n5-Hexadecimal a Decimal (Presiona 5) \n6-Salir de la Calculadora (Presiona 6) \n -ELIGE UNA OPCION: ");
         int opcion = scanner.nextInt();
         
       
        return opcion;
    }
   
    public static int continuar()
    {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Quieres hacer otro calculo? \nPresiona 1 para Continuar \nPresiona 2 para Salir \nElige una opcion: ");
        int option = scanner.nextInt();
       
        return option;
    }
   

     public static String DecimalBinario (int decimalNumber)
     {
       if (decimalNumber == 0) 
        {
            return "0"; 
        }

        StringBuilder binaryBuilder = new StringBuilder();
        while (decimalNumber > 0) 
        {
            int remainder = decimalNumber % 2;
            binaryBuilder.insert(0, remainder); 
            decimalNumber /= 2;
        }

        return binaryBuilder.toString();
    }
     
      public static String DoubleOctal (int decimalNumber) 
      {
          
          if (decimalNumber == 0) {
            return "0"; // Manejamos el caso especial de 0
        }

        StringBuilder octalBuilder = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 8;
            octalBuilder.insert(0, remainder); // Insertar el residuo al principio
            decimalNumber /= 8;
        }

        return octalBuilder.toString();
        
      }
      
      
    public static int BinarioDecimal (String myBinario) 
    
    {
        
        int decimalNumber = Integer.parseInt(myBinario, 2);
        return decimalNumber;
       

    }  
    
    
    public static double OctalDouble(String octal) 
    {
        
        int decimalNumber = Integer.parseInt(octal, 8);
        return decimalNumber;
       

    }
    
    public static int HexadecimalDouble(String hexadecimal) 
    {
        
        if (hexadecimal.startsWith("0x")) 
        {
            hexadecimal = hexadecimal.substring(2);
        }

        
        int decimal = Integer.parseInt(hexadecimal, 16);

        return decimal;
    }
    

    
}
