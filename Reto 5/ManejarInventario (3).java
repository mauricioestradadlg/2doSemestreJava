import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Product {
    private int id;
    private String nombre;
    private double precio;
    private int stock;

    public Product() {
        // Constructor por defecto con valores predeterminados
        this.id = 0;
        this.nombre = "";
        this.precio = 0.0;
        this.stock = 0;
    }

    public Product(int id, String nombre, double precio, int stock) {
        // Constructor sobrecargado con valores personalizados
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void vender(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Venta exitosa. Stock actual: " + stock);
        } else {
            throw new IllegalArgumentException("Cantidad no válida para la venta.");
        }
    }

    public void reabastecer(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
            System.out.println("Reabastecimiento exitoso. Stock actual: " + stock);
        } else {
            throw new IllegalArgumentException("Cantidad no válida para el reabastecimiento.");
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Precio: " + precio + ", Stock: " + stock;
    }
}

public class ManejarInventario {
    public static void main(String[] args) {
        List<Product> inventario = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar un nuevo producto");
            System.out.println("2. Vender un producto existente");
            System.out.println("3. Reabastecer un producto existente");
            System.out.println("4. Mostrar información de todos los productos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el ID del producto: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese el precio del producto: ");
                        double precio = scanner.nextDouble();
                        System.out.print("Ingrese el stock inicial del producto: ");
                        int stock = scanner.nextInt();

                        Product nuevoProduct = new Product(id, nombre, precio, stock);
                        inventario.add(nuevoProduct);
                        System.out.println("Producto agregado al inventario.");
                        break;
                    case 2:
                        System.out.print("Ingrese el ID del producto a vender: ");
                        int idVenta = scanner.nextInt();
                        System.out.print("Ingrese la cantidad a vender: ");
                        int cantidadVenta = scanner.nextInt();

                        for (Product product : inventario) {
                            if (product.getId() == idVenta) {
                                product.vender(cantidadVenta);
                                break;
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Ingrese el ID del producto a reabastecer: ");
                        int idReabastecimiento = scanner.nextInt();
                        System.out.print("Ingrese la cantidad a reabastecer: ");
                        int cantidadReabastecimiento = scanner.nextInt();

                        for (Product product : inventario) {
                            if (product.getId() == idReabastecimiento) {
                                product.reabastecer(cantidadReabastecimiento);
                                break;
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Inventario de productos:");
                        for (Product product : inventario) {
                            System.out.println(product.toString());
                        }
                        break;
                    case 5:
                        System.out.println("Saliendo del programa.");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese datos válidos.");
                scanner.nextLine(); // Limpiar el búfer de entrada
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}