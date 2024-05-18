/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto4;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;


/**
 *
 * @author Mau
 */
public class Reto4 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
             boolean cycle = true;
       
       Scanner scanner = new Scanner (System.in);
       
       try
       {
                  while (cycle)
       {
           
           // MENU PRINCIPAL
            int opcion = menu();
            
                 // CONDICIONALES para las opciones del MENU
                 switch (opcion) 
                 {
                     // SUMA MATRICES
                     case 1:
                         linea();
                         
                         System.out.print("Escribe la cantidad de filas: ");
                         int filas = scanner.nextInt();
                         
                         System.out.print("Escribe la cantidad de columnas: ");
                         int columnas = scanner.nextInt();
        
                         int[][] matrix1 = RandomMatrix(filas, columnas);
                         int[][] matrix2 = RandomMatrix(filas, columnas);
                         
                         linea();
        
                         System.out.println("Matriz 1:");
                         PrintMatrix(matrix1);
                         
                         espacio();
                         
                         System.out.println("Matriz 2:");
                         PrintMatrix(matrix2);
                         
                         espacio();
        
                         int[][] result = AddMatrix(matrix1, matrix2);
        
                         System.out.println("Matriz Resultado:");
                         PrintMatrix(result);
                         
                         
                         linea();
                         linea();
                         int option = continuar();
                         
                         if (option == 1) 
                         {
                             linea();
                             linea();
                         }
                         
                         else if (option == 2) 
                         {
                             cycle = false;
                         }
                         
                         break;
                         
                     // Multiplicar Entero por Matriz    
                     case 2:
                         linea();
                         
                        System.out.print("Escribe la cantidad de filas: ");
                        filas = scanner.nextInt();
                         
                        System.out.print("Escribe la cantidad de columnas: ");
                        columnas = scanner.nextInt();
                         
                        System.out.print("Escribe el valor del entero: ");
                        int myInt = scanner.nextInt();
                        
                         
                         int[][] matrix= RandomMatrix(filas, columnas); 
                        
                         linea();
        
                         System.out.println("Matriz Original:");
                         PrintMatrix(matrix);
                         
                         espacio();
        
                         int[][] product = Multiply(matrix, myInt);
        
                         System.out.println("Matriz Resultado:");
                         PrintMatrix(product);
                         

                         
                         linea();
                         linea();
                         option = continuar();
                         
                         if (option == 1) 
                         {
                             linea();
                             linea();
                         }
                         
                         else if (option == 2) 
                         {
                             cycle = false;
                         }
                         
                         
                         break;
                         
                     // Impresion de Matriz    
                     case 3:
                         
                        System.out.print("Escribe la cantidad de filas: ");
                        filas = scanner.nextInt();
                         
                        System.out.print("Escribe la cantidad de columnas: ");
                        columnas = scanner.nextInt();
                        

                        matrix= RandomMatrix(filas, columnas); 
                        
                        linea();
                        
                        System.out.println("MATRIZ: ");
                        
                        espacio();
                       
                        
                        PrintMatrix(matrix);
                         
//                        
                         
                         
                         linea();
                         linea();
                         option = continuar();
                         
                         if (option == 1) 
                         {
                             linea();
                             linea();
                         }
                         
                         else if (option == 2) 
                         {
                             cycle = false;
                         }
                         
                         linea();
                         
                         break;
                         
                         case 4:
                             
                             cycle = false;
                             
                             break;
                             
                             
                         default:
                             
                         getnumber(scanner);    
                         linea();
                         
                         break;
                 }
           
           

        
       }
       }
       
       catch (Exception e)
       {
           System.err.println("HICISTE ALGO MAL: " + e.getMessage());
          
       }
       
       finally
       {
           espacio();
           System.out.println("FIN DEL PROGRAMA!");
       }
       

    

    }

    public static void espacio () 
    {
         System.out.println(" \n ");
    }

    public static void linea ()
    {
        System.out.println("__________________________________________");
    }
   

    public static int menu()
    {
       
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("RETO 4 - POO");
       
        linea();
       
        String [] menu =
       
        {
           
           
            "Suma de Matrices (Presiona 1)",
            "Multiplicar Entero por Matriz (Presiona 2)",
            "Impresion de Matrix (Presiona 3)",
            "Salir del Programa (Presiona 4)"
       
       
       
       
        };
       
       
        for (int i= 0;i < menu.length; i++)
        {
            String myMenu = menu[i];
           
            System.out.println((i+1)+ "-" + myMenu);
        }
       
        linea();
       
        System.out.print("ELIGE UNA OPCION: ");
        int opcion = scanner.nextInt();
       
        return opcion;
    }
   
   
    public static int continuar()
    {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Quieres intentar otra opcion? \n \nPresiona 1 para Continuar \nPresiona 2 para Salir \n \nELIGE UNA OPCION: ");
        int option = scanner.nextInt();
       
        return option;
    }
    
     public static int[][] AddMatrix(int[][] matrix1, int[][] matrix2) 
     {
        int filas = matrix1.length;
        int columnas = matrix1[0].length;
        int[][] result = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) 
        {
            for (int j = 0; j < columnas; j++) 
            {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        return result;
    }
    
 
    public static void PrintMatrix(int[][] matrix) 
    {
        int filas = matrix.length;
        int columnas = matrix[0].length;
        
        for (int i = 0; i < filas; i++) 
        {
            for (int j = 0; j < columnas; j++) 
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(); 
        }
    }
    
    
    public static int[][] RandomMatrix(int filas, int columnas) 
    {
        int[][] matrix = new int[filas][columnas];
        java.util.Random random = new java.util.Random();
        
        for (int i = 0; i < filas; i++) 
        {
            for (int j = 0; j < columnas; j++) 
            {
                matrix[i][j] = random.nextInt(100); 
            }
        }
        
        return matrix;
    }
    
    public static int[][] Multiply (int[][] matrix, int myInt)
    {
        int filas = matrix.length;
        int columnas = matrix[0].length;
        int[][] product  = new int[filas][columnas];
        
        for (int i = 0; i< filas;i++) 
        {
            for (int j = 0; j < columnas; j++)
            {
                product [i][j] = matrix[i][j] * myInt;
            }
        }
        
        return product;

       }
    
        public static int getnumber(Scanner scanner) 
        {
        int opcion = 1;
        boolean opcionvalida = false;

        while (!opcionvalida) 
        {
            try 
            {
                linea();
                System.out.print("INGRESA UNA OPCION VALIDA: ");
                opcion = scanner.nextInt();
                opcionvalida = true; 
            } 
            
            catch (InputMismatchException e) 
            {
                
                
                espacio();
                System.out.println("DEBES INGRESAR UN NUMERO");
                scanner.nextLine(); 
            }
        }

        return opcion;
    
    
    
} }
      



