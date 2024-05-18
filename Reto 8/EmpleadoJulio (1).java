/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto8;


abstract class EmpleadoJulio 
{
    
    protected String Nombre;
    protected int ID;
    protected double salarioBase;

    public EmpleadoJulio() 
    {
        
    }

    public EmpleadoJulio(String Nombre, int ID, double salarioBase) 
    {
        this.Nombre = Nombre;
        this.ID = ID;
        this.salarioBase = salarioBase;
    }

    public String getNombre() 
    {
        return Nombre;
    }

    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }

    public int getID() 
    {
        return ID;
    }

    public void setID(int ID) 
    {
        this.ID = ID;
    }

    public double getSalarioBase() 
    {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) 
    {
        this.salarioBase = salarioBase;
    }
    
    public abstract void info();
    
    
}
