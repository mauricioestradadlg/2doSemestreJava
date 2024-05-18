/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challenge6;

/**
 *
 * @author ntact
 */
public class Libro 
{
    private String titulo;
    private String autor;
    private int paginas;
    private int stock;
    private  String categoria;

    public Libro(String titulo, String autor, int paginas, int stock, String categoria) 
    {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.stock = stock;
        this.categoria = categoria;
    }
    
     public String getTitulo() 
     {
        return titulo;
     }

    public void setTitulo(String titulo) 
    {
  
            this.titulo = titulo;
    }

    public String getAutor() 
    {
        return autor;
    }

    public void setAutor(String autor) 
    {
        
       this.autor = autor;
    }

    public int getPaginas() 
    {
        return paginas;
    }

    public void setPaginas(int paginas) 
    {
       this.paginas = paginas;
    }

    public int getStock() 
    {
        return stock;
    }

    public void setStock(int stock) 
    {
        this.stock = stock;

    }

    public String getCategoria() 
    {
        return categoria;
    }

    public void setCategoria(String categoria) 
    {
        
        this.categoria = categoria;

    }

class Programacion extends Libro 
{
    public Programacion(String titulo, String autor, int paginas, int stock) 
    {
        super(titulo, autor, paginas, stock, "Programacion");
    }
}

class Matematicas extends Libro 
{
    public Matematicas(String titulo, String autor, int paginas, int stock) 
    {
        super(titulo, autor, paginas, stock, "Matematicas");
    }
}

class Fisica extends Libro 
{
    public Fisica(String titulo, String autor, int paginas, int stock) 
    {
        super(titulo, autor, paginas, stock, "Fisica");
    }
}
}
