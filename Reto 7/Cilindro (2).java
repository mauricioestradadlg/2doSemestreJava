/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto7;

/**
 *
 * @author Mau
 */
class Cilindro extends Figuras
{
    private double radio;
    private double altura;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    

    public Cilindro(double radio, double altura) 
    {
        this.radio = radio;
        this.altura = altura;
    }
    
    

    @Override
    public double Area() 
    {
        return (2 * Math.PI * radio * altura) + (2 * Math.PI * Math.pow(radio,2));
    }

    @Override
    public double Perimetro() 
    {
        return Math.PI * Math.pow(radio, 2) * altura;
    }
    
}
