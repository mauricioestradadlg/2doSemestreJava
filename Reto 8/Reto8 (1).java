/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto8;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;


public class Reto8 
{

 
    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);
        
        boolean cycle = true;
        
        List<MedioTiempo> jornada1 = new ArrayList<>();
        List<TiempoCompleto> jornada2 = new ArrayList<>();
        
        
        while (cycle) 
        {
            try 
            {
                int myMenu = menu();
                switch (myMenu) 
                {
                    case 1: 
                    {
                            linea();
                            espacio();
                            System.out.println("AGREGAR EMPLEADO TIEMPO COMPLETO: ");
                            espacio();
                            System.out.print("Nombre Completo: ");
                            String name = scanner.nextLine();
                            scanner.nextLine();
                            System.out.print("ID de Nomina: ");
                            int myID = scanner.nextInt();
                            scanner.nextLine();
                            double salarioCompleto = 7000;
                            TiempoCompleto employee = new TiempoCompleto(name, myID, salarioCompleto);
                            espacio();
                            employee.info();
                            jornada2.add(employee);
                            int continuar = continuar();
                            if (continuar == 1)
                            {
                                
                                espacio();
                                linea();
                                
                            }
                            
                            else if (continuar == 2)
                            {
                                cycle = false;
                                
                            }       break;
                        }
                    case 2: 
                        {
                            linea();
                            espacio();
                            System.out.println("AGREGAR EMPLEADO MEDIO TIEMPO: ");
                            espacio();
                            System.out.print("Nombre Completo: ");
                            String name = scanner.nextLine();
                            scanner.nextLine();
                            System.out.print("ID de Nomina: ");
                            int myID = scanner.nextInt();
                            scanner.nextLine();
                            double salarioMedio = 6000;
                            MedioTiempo employee1 = new MedioTiempo(name, myID, salarioMedio);
                            espacio();
                            employee1.info();
                            jornada1.add(employee1);
                            int continuar = continuar();
                            if (continuar == 1)
                            {
                                
                                espacio();
                                linea();
                                
                            }
                            
                            else if (continuar == 2)
                            {
                                cycle = false;
                                
                            }       break;
                        }
                    case 3:
                    { 
                        
                        System.out.println("CONSULTAR INFORMACION DE EMPLEADOS: ");
                            espacio();
                            System.out.print("SELECCIONA UNA OPCION \n \nEmpleados Tiempo Completo (Presiona 1) \nEmpleados Medio Tiempo (Presiona 2): \nELIGE UNA OPCION: ");
                            int info1 = scanner.nextInt();
                            if (info1 == 1)
                            {
                                espacio();
                                linea();
                                
                                System.out.println("Empleados de JULIO [Tiempo Completo]: ");
                                
                                for (TiempoCompleto employees : jornada2)
                                {
                                    linea();
                                    System.out.println("Nombre Completo: " + employees.Nombre);
                                    System.out.println("ID de Nomina: " + employees.ID);
                                    System.out.println("Salario Base: " + employees.salarioBase);
                                    System.out.println();
                                }
                                
                            }
                            
                            else if(info1 == 2) 
                            {
                                
                                espacio();
                                linea();
                                
                                System.out.println("Empleados de JULIO [Medio Tiempo]: ");
                                
                                for (MedioTiempo employees : jornada1)
                                {
                                    
                                    linea();
                                    System.out.println("Nombre Completo: " + employees.Nombre);
                                    System.out.println("ID de Nomina: " + employees.ID);
                                    System.out.println("Salario Base: " + employees.salarioBase);
                                    System.out.println();
                                    
                                }
                                
                            }   
                            
                            
                            int continuar = continuar();
                            if (continuar == 1) 
                            {
                                espacio();
                                linea();
                            } 
                            else if (continuar == 2) 
                            {
                                cycle = false;
                                break;
                            }
                        
                        break;


                        
                    }    
                    case 4: 
                    {
                        
                        System.out.println("DAR DE BAJA A EMPLEADO: ");
                        espacio();
                        System.out.print("SELECCIONA UNA OPCION \n \nEmpleados Tiempo Completo (Presiona 1) \nEmpleados Medio Tiempo (Presiona 2): \nELIGE UNA OPCION: ");
                        int info = scanner.nextInt();
                        
                        
                        if (info == 1) 
                        {
                            
                            System.out.println("A que empleado daras de Baja: ");
                             
                            espacio();
                            
                            for (TiempoCompleto employees : jornada2) 
                            {
                                linea();
                                System.out.println("Nombre Completo: " + employees.Nombre);
                                System.out.println("ID de Nomina: " + employees.ID);
                                System.out.println();
                            }
                            
                            System.out.print("Escribe el ID del Empleado al que daras de baja: ");
                            int idnomina = scanner.nextInt();
                            
                            for (TiempoCompleto employees : jornada2) 
                            {
                                if (idnomina == employees.getID()) 
                                {
                                    jornada2.remove(employees);
                                    break;
                                    
                                } y
                            }
                            espacio();
                            System.out.println("Empleados de JULIO [Tiempo Completo]: ");
                                
                                for (TiempoCompleto employees : jornada2)
                                {
                                    linea();
                                    System.out.println("Nombre Completo: " + employees.Nombre);
                                    System.out.println("ID de Nomina: " + employees.ID);
                                    System.out.println("Salario Base: " + employees.salarioBase);
                                    System.out.println();
                                }
                            
                        }
                        
                        else if (info == 2) 
                        {
                            
                            System.out.println("A que empleado daras de Baja: ");
                            
                            espacio();
                            
                            for (MedioTiempo employees : jornada1)
                            {
                                linea();
                                System.out.println("Nombre Completo: " + employees.Nombre);
                                System.out.println("ID de Nomina: " + employees.ID);
                                System.out.println();
                            }
                            
                            System.out.print("Escribe el ID del Empleado al que daras de baja: ");
                            int idnomina = scanner.nextInt();
                            
                            for (MedioTiempo employees : jornada1) 
                            {
                                if (idnomina == employees.getID()) 
                                {
                                    jornada1.remove(employees);
                                    break;
                                    
                                }
                            }
                            espacio();
                            
                            System.out.println("Empleados de JULIO [Medio Tiempo]: ");
                                
                            for (MedioTiempo employees : jornada1)
                            {
                                    
                                linea();
                                System.out.println("Nombre Completo: " + employees.Nombre);
                                System.out.println("ID de Nomina: " + employees.ID);
                                System.out.println("Salario Base: " + employees.salarioBase);
                                System.out.println();
                                    
                            }
                             
                             
                            
                        }
                        
                        int continuar = continuar();
                        if (continuar == 1) 
                        {
                            espacio();
                            linea();
                        } 
                        
                        else if (continuar == 2) 
                        {
                            cycle = false;
                            break;
                        }

                        break;
                                                    
                    }    
                    
                    case 5:
                    {    
                        cycle = false;
                        break;
                        
                    }    
                    default:
                        espacio();
                        System.out.println("ELIGE UNA OPCION CORRECTA!");
                        espacio();
                        break;
                }
                linea();
                System.out.println("FIN DEL PROGRAMA");
            }
            
            catch (InputMismatchException e) 
            {
                
                espacio();
                System.out.println("Proporciona un dato de entrada VALIDO!");
                scanner.nextLine();
            
                espacio();
                
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
        
        espacio();
        Scanner scanner = new Scanner(System.in);
        
         System.out.print("Quieres intentar otra opcion? \n \nPresiona 1 para Continuar \nPresiona 2 para Salir \n \nELIGE UNA OPCION: ");
        int continuar = scanner.nextInt();
        
        
        return continuar;
    }
    
     public static int menu()
    {
       
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("EMPLEADOS JULIO");
       
        linea();
       
        String [] menu =
       
        {
           
           
            "AGREGAR EMPLEADO [Tiempo Completo] (Presiona 1)",
            "AGREGAR EMPLEADO [Medio Tiempo] (Presiona 2)",
            "MOSTRAR INFORMACION DE EMPLEADOS (Presiona 3)",
            "DAR DE BAJA A EMPLEADO (Presiona 4)",
            "Salir del Programa (Presiona 5)"
       
       
       
       
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
     
     



