import java.sql.SQLOutput;

public class Producto {

    private String nombre;
    private int precio;
    private int codigoDB;
    private int stock;

    public Producto(String nombre) {
        System.out.println("El nombre del producto ingresado es: " + nombre);

    }

    public String get() {
        return nombre;
    }

    public void set(String a) {
        this.nombre = a;
    }



    public int calcularPrecioProducto(int){
        totalProducto = precio * cantidad;
        System.out.println("El Total del Producto es: " + totalProducto);
    }
}









}
