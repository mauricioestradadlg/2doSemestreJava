/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto8;

/**
 *
 * @author ntact
 */
 class MedioTiempo extends EmpleadoJulio
 {

    public MedioTiempo() {
    }

    public MedioTiempo(String Nombre, int ID, double salarioBase) {
        super(Nombre, ID, salarioBase);
    }
    
    

    @Override
    public void info() 
    {
        System.out.println("INFORMACION DE EMPLEADO: ");
        
        System.out.println("Nombre completo: " + Nombre);
        System.out.println("ID de Nomina: " + ID);
        System.out.println("Salario Base: " + salarioBase);
    }
    
    
     
    
 }
