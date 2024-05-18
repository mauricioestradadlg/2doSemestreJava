/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poreto2parte2;

/**
 *
 * @author Igor Sungmin
 */
public class PoReto2parte2 {

public static int sumaFactores(int n) {
        int s = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        return s;
    }

    // Método para verificar si dos números son amigos y proporcionar una justificación
    public static void encontrarAmigos(int n1, int n2) {
        int sumaFactoresN1 = sumaFactores(n1);
        int sumaFactoresN2 = sumaFactores(n2);

        if (sumaFactoresN1 == n2 && sumaFactoresN2 == n1) {
            System.out.println(n1 + " y " + n2 + " son numeros amigos.");
            System.out.println("La suma de los divisores propios de " + n1 + " es " + sumaFactoresN1);
            System.out.println("La suma de los divisores propios de " + n2 + " es " + sumaFactoresN2);
        } else{System.out.println(n1 + " y " + n2 + " no son numeros amigos");}
    }

    public static void main(String[] args) {
        for (int n1 = 1; n1 <= 1184; n1++) {
            for (int n2 = n1 + 1; n2 <= 1210; n2++) {
                encontrarAmigos(n1, n2);}
            }
        }
    
    }
