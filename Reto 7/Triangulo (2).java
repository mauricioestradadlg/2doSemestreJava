/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto7;


/**
 *
 * @author Mau
 */
class Triangulo extends Figuras
{
    private double base;
    private double altura;
    private double lado;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    

    public Triangulo(double base, double altura, double lado) 
    {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }
    
    

    @Override
    public double Area() 
    {
        
        return base * altura / 2;
    }

    @Override
    public double Perimetro() 
    {
        return base + altura + lado;
    }

    
}
