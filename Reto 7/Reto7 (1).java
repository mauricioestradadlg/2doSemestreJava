/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto7;
import java.util.Scanner;
import java.util.InputMismatchException;



public class Reto7 
{


    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        boolean cycle = true;
        
        while (cycle) 
        
        {
            
            try 
            {
                
                
                int menu = menu();
                
                switch (menu) 
                {
                    // Calcular Triangulo
                    case 1:
                        
                        System.out.print("Dame la base: ");
                        double baseT = scanner.nextDouble();
                        
                        System.out.print("Dame la altura: ");
                        double height = scanner.nextDouble();
                        
                        System.out.print("Dame el lado: ");
                        double side = scanner.nextDouble();
                        
                        Triangulo miTriangulo = new Triangulo(baseT, height, side);
                        
                        espacio();
                        
                        System.out.println("El area del Triangulo es: " + miTriangulo.Area());
                        
                        System.out.println("El perimetro del Triangulo es: " + miTriangulo.Perimetro());
                      
                        espacio();
                        
                    int continuar = continuar();
                    
                    
                    // Continuar Ciclo
                    if (continuar == 1) 
                    {
                    
                       espacio();
                       linea();
                    }
                
                    else if (continuar == 2) 
                    {
                       cycle = false;
                    }
                        
                        
                        
                        
                        
                        break;
                        
                    // Calcular Circulo    
                    case 2:
                        
                        System.out.print("Dame el radio: ");
                        double radius = scanner.nextDouble();
                        
                        Circulo miCirculo = new Circulo(radius);
                        
                        espacio();
                        
                        System.out.println("El area del Circulo es: " + miCirculo.Area());
                        System.out.println("El perimetro del Circulo es: " + miCirculo.Perimetro());
                        
                        espacio();
                        
                    continuar = continuar();
                    
                    
                    // Continuar Ciclo
                    if (continuar == 1) 
                    {
                    
                       espacio();
                       linea();
                    }
                
                    else if (continuar == 2) 
                    {
                       cycle = false;
                    }
                        
                        
                        
                        break;
                        
                    // Calcular Cuadrado    
                    case 3:
                        
                        System.out.print("Dame el primer lado: ");
                        double side1 = scanner.nextDouble();
                        
                        System.out.print("Dame el segundo lado: ");
                        double side2 = scanner.nextDouble();
                        
                        Cuadrado miCuadrado = new Cuadrado(side1, side2);
                        
                        espacio();
                        
                        System.out.println("El area del cuadrado es: " + miCuadrado.Area());
                        System.out.println("El perimetro del cuadrado es: " + miCuadrado.Perimetro());
                        
                        espacio();
                        
                        
                        
                   continuar = continuar();
                    
                    
                    // Continuar Ciclo
                    if (continuar == 1) 
                    {

                    
                       espacio();
                       linea();
                    }
                
                    else if (continuar == 2) 
                    {
                       cycle = false;
                    }
                        break;
                        
                    // Calcular Rectangulo    
                    case 4:
                        
                        System.out.print("Dame el largo: ");
                        double lenght = scanner.nextDouble();
                        
                        System.out.print("Dame el ancho: ");
                        double width = scanner.nextDouble();
                        
                        Rectangulo miRectangulo = new Rectangulo(lenght, width);
                        espacio();
                        System.out.println("El area del Rectangulo es: " + miRectangulo.Area());
                        System.out.println("El perimetro del Rectangulo es: " + miRectangulo.Perimetro());
                        
                    continuar = continuar();
                    
                    
                    // Continuar Ciclo
                    if (continuar == 1) 
                    {
                    
                       espacio();
                       linea();
                    }
                
                    else if (continuar == 2) 
                    {
                       cycle = false;
                    }
                        
                        break;
                        
                    // Calcular Cilindro    
                    case 5:
                        
                        System.out.print("Dame el radio: ");
                        radius = scanner.nextDouble();
                        
                        System.out.print("Dame la altura: ");
                        height = scanner.nextDouble();
                        
                        Cilindro miCilindro = new Cilindro(radius, height);
                        
                        espacio();
                        
                        System.out.println("El area del Cilindro es: " + miCilindro.Area());
                        System.out.println("El perimetro del Cilindro es: " + miCilindro.Perimetro());
                        
                        espacio();
                        
                        
                    continuar = continuar();
                    
                    
                    // Continuar Ciclo
                    if (continuar == 1) 
                    {
                    
                       espacio();
                       linea();
                    }
                
                    else if (continuar == 2) 
                    {
                       cycle = false;
                    }
                        
                        break;
                        
                    // Salir del Programa    
                    case 6:
                        cycle = false;
                        break;
                        
                        
                    default:
                        
                        espacio();
                        System.out.println("Selecciona una opcion del MENU valido");
                        espacio();
                        
                        
                       
                        
                        break;
                }
                
                
                
                
            }
            
            catch (Exception e) 
            {
            espacio();
            System.out.println("ELIGE UNA OPCION CORRECTA!");
            
            espacio();
            
            
            
           
            }
        }
        
        
        
        
        linea();
        
        System.out.println("FIN DEL PROGRAMA");
    }
    
        public static void linea() 
    {
        
        System.out.println("_______________________________");
    }
    
    public static void espacio() 
    {
        
        System.out.println("\n \n \n");
    }
    
    public static int continuar() 
    {
        
        Scanner scanner = new Scanner(System.in);
        
         System.out.print("Quieres intentar otra opcion? \n \nPresiona 1 para Continuar \nPresiona 2 para Salir \n \nELIGE UNA OPCION: ");
        int continuar = scanner.nextInt();
        
        
        return continuar;
    }
    
     public static int menu()
    {
       
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("RETO 7 - POO");
       
        linea();
       
        String [] menu =
       
        {
           
           
            "Calcular Triangulo (Presiona 1)",
            "Calcular Circulo (Presiona 2)",
            "Calcular Cuadrado (Presiona 3)",
            "Calcular Rectangulo (Presiona 4)",
            "Calcular Cilindro (Presiona 5)",
            "Salir del Programa (Presiona 6)"
       
       
       
       
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
    
}
