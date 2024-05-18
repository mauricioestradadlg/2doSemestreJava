/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto7;

/**
 *
 * @author Mau
 */
class Circulo extends Figuras
{

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    

    public Circulo(double radio) 
    {
     
        this.radio = radio;
    }
    
    
    

    @Override
    public double Area() 
    {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double Perimetro() 
    {
        return 2 * Math.PI * radio;
    }
    
}
