
package shakeshakc;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ShakeShakc {
    
 
    public static void main(String[] args) {
        
       friesShack();
    }
  
  public static void burgersShack(){
        List<Burger> burgers = new ArrayList<>();
        
        Burger shackBurger = new Burger("ShackBurger", 110);
        Burger smokeShack = new Burger("SmokeShack", 155);
        Burger shroomBurger = new Burger("ShroomBurger",160 );
        Burger shackStack = new Burger("ShackStack", 280);
        Burger hamburguesa = new Burger("Hamburguesa", 100);
        burgers.add(shackBurger);
        burgers.add(smokeShack);
        burgers.add(shackStack);
        burgers.add(shroomBurger);
        burgers.add(hamburguesa);
        
        System.out.println("Hamburguesas Shake Shack: ");
        
        for (Burger hamburguesas : burgers){
            System.out.println("_________________________________");
            System.out.println("Burger: " + hamburguesas.getName());
            System.out.println("Precio: $" +hamburguesas.getPrecio());
            System.out.println("\n");
        }
    }
  
  public static void friesShack(){
      List<Fries> papitas = new ArrayList<>();
      
      Fries papas = new Fries("Papas", 70);
      Fries cheeseFries = new Fries("Papas con Queso", 110);
      Fries baconcheeseFries = new Fries("Papas con Queso y Tocino", 155);
      
      papitas.add(papas);
      papitas.add(cheeseFries);
      papitas.add(baconcheeseFries);
      
      for (Fries chips : papitas){
            System.out.println("_________________________________");
            System.out.println("Fries: " + chips.getName());
            System.out.println("Precio: $" + chips.getPrecio());
            System.out.println("\n");
        }
  }
    }
    
   

    

