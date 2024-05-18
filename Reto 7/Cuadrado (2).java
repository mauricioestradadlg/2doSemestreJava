/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto7;

/**
 *
 * @author Mau
 */
class Cuadrado extends Figuras
{
    private double lado1;
    private double lado2;

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    

    public Cuadrado(double lado1, double lado2) 
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    

    @Override
    public double Area() 
    {
        return lado1 * lado2;
    }

    @Override
    public double Perimetro() 
    {
        double lado3 = lado1;
        double lado4 = lado2;
        
        return lado1 + lado2 + lado3 + lado4;
    }
    
}
