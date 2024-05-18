/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto7;

/**
 *
 * @author Mau
 */
class Rectangulo extends Figuras
{
    private double largo;
    private double ancho;

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    

    public Rectangulo(double largo, double ancho) 
    {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    

    @Override
    public double Area() 
    {
        return largo * ancho;
    }

    @Override
    public double Perimetro() 
    {
       double lado1 = largo;
       double lado2 = ancho;
       
       return largo + ancho + lado1 + lado2;
    }
    
}
