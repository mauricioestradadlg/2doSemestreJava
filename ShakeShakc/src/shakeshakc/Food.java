
package shakeshakc;


abstract class Food {
    
    private String name;
    private double precio;

    public Food(String name, double precio) {
        this.name = name;
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
   
  
}
