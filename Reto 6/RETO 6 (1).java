/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package challenge6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;




class Libro 
{
    String titulo;
    String autor;
    int paginas;
    int stock;
    String categoria;

    public Libro(String titulo, String autor, int paginas, int stock, String categoria) 
    {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.stock = stock;
        this.categoria = categoria;
    }
}

class Programacion extends Libro 
{
    public Programacion(String titulo, String autor, int paginas, int stock) 
    {
        super(titulo, autor, paginas, stock, "Programacion");
    }
}

class Matematicas extends Libro 
{
    public Matematicas(String titulo, String autor, int paginas, int stock) 
    {
        super(titulo, autor, paginas, stock, "Matematicas");
    }
}

class Fisica extends Libro 
{
    public Fisica(String titulo, String autor, int paginas, int stock) 
    {
        super(titulo, autor, paginas, stock, "Fisica");
    }
}



public class Challenge6 
{

    public static void main(String[] args) 
    {
        
         boolean cycle = true;
            
            Scanner scanner = new Scanner(System.in);
            
            List<Programacion> coding = new ArrayList<>();
            List<Matematicas> math = new ArrayList<>();
            List<Fisica> physics = new ArrayList<>();
            
            
             while (cycle) 
            {
                
        try 
        {
            
           int menu = menu();
                
                switch (menu) 
                {
                    case 1:
                        
                        linea();
                        espacio();
                        
                        System.out.println("AGREGAR NUEVO LIBRO:");
            
            
                        System.out.print("Nombre del Titulo: ");
                        String title = scanner.nextLine();
            
            
                        System.out.print("Nombre del Autor: ");
                        String author = scanner.nextLine();
            
            
                        System.out.print("Numero de Paginas: ");
                        int pages = scanner.nextInt();
            
                        System.out.print("Numero de Copias: ");
                        int copies = scanner.nextInt();
            
            
                        scanner.nextLine(); 

                        System.out.print("Categoría (Programacion | Matematicas | Fisica): ");
                        String category = scanner.nextLine();

                        switch (category.toLowerCase()) 
                        {
                            case "programacion":
                    
                            Programacion book = new Programacion(title, author, pages, copies);
                            coding.add(book);
                    
                            break;
                    
                            case "matematicas":
                    
                              Matematicas book1 = new Matematicas(title, author, pages, copies);
                              math.add(book1);
                    
                            break;
                    
                            case "fisica":
                    
                            Fisica book2 = new Fisica(title, author, pages, copies);
                            physics.add(book2);
                    
                            break;
                    
                        default:
                           System.out.println("Categoría no válida. Intente de nuevo.");
                           continue; 
                }
                        
                        espacio();
            
                int continuar = continuar();
                
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
                        
                        
                        
                    case 2:
                        
                        opcion2();
                        
                        continuar = continuar();
                
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
                        
                        
                    case 3:
                        
                        Category();
                        
                        System.out.print("Elige una opcion: ");
                        int myInt = scanner.nextInt();
                        
               switch (myInt) {
                   case 1:
                       System.out.println("Lista de libros de Programación:");
                       for (Programacion books : coding)
                       {
                           linea();
                           System.out.println("Titulo: " + books.titulo);
                           System.out.println("Autor: " + books.autor);
                           System.out.println("Categoria: " + books.categoria);
                           System.out.println("Paginas: " + books.paginas);
                           System.out.println("Stock: " + books.stock);
                           System.out.println();
                       }
                       break;
                   case 2:
                       for (Matematicas books : math)
                       {
                           linea();
                           System.out.println("Titulo: " + books.titulo);
                           System.out.println("Autor: " + books.autor);
                           System.out.println("Categoria: " + books.categoria);
                           System.out.println("Paginas: " + books.paginas);
                           System.out.println("Stock: " + books.stock);
                           System.out.println();
                       }
                       break;
                   case 3:
                       for (Fisica books : physics)
                       {
                           linea();
                           System.out.println("Titulo: " + books.titulo);
                           System.out.println("Autor: " + books.autor);
                           System.out.println("Categoria: " + books.categoria);
                           System.out.println("Paginas: " + books.paginas);
                           System.out.println("Stock: " + books.stock);
                           System.out.println();
                       }
                       break;
                   default:
                       break;
               }
                        
                        continuar = continuar();
                
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

                        
                        
                    case 4:
                        
                        
                        cycle = false;
                        
                        
                        break;
                        
                        
                    default:
                        break;
                }
                
                
                            linea();
        
            System.out.println("FIN DEL PROGRAMA");
            


            
        }
        
        catch(InputMismatchException e) 
        {
            System.out.println("Entrada inválida. Por favor, ingrese datos válidos.");
                scanner.nextLine(); // Limpiar el búfer de entrada
        }

                
                
                
            }
        
        

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
       
        System.out.println("RETO 6 - POO");
       
        System.out.println("Libros de Ingenieria en Software");
        linea();
       
        String [] menu =
       
        {
           
           
            "Agregar Libro a Biblioteca (Presiona 1)",
            "Calcular precio de alquiler de un libro (Presiona 2)",
            "Mostrar Informacion de un libro en especifico (Presiona 3)",
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
    
    public static void Category() {
        
        System.out.println("Categorias Disponibles: \n1-Programacion \n2-Matematicas \n3-Fisica");
    } 
    
    public static void opcion2 () 
    {
        
        espacio();
        System.out.println("Precios de alquiler en los libros: ");
        
        System.out.println("1- Diario: $50 \n2- Semanal: $300 \n3- Quincenal: $400 \n4-Mensual: $500");
        espacio();
    }   
}