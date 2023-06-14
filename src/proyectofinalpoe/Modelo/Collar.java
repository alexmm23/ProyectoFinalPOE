/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Modelo;

/**
 *
 * @author aleja
 */
public class Collar extends Producto{
    private double longitud;
    private String material;
    private String tipoGema;
    private String cadena;
    private boolean estilo;
    private Collar siguiente;

    public Collar(double longitud, String material, String tipoGema, String cadena, boolean estilo, int id, String nombre, double precio, int stock, String descripcion) {
        super(id, nombre, precio, descripcion);
        this.longitud = longitud;
        this.material = material;
        this.tipoGema = tipoGema;
        this.cadena = cadena;
        this.estilo = estilo;
        this.siguiente = null;
    }

    public Collar() {
        super();
        this.longitud = 0;
        this.material = "mat";
        this.tipoGema = "gem";
        this.cadena = "cad";
        this.estilo = false;
        this.siguiente = null;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoGema() {
        return tipoGema;
    }

    public void setTipoGema(String tipoGema) {
        this.tipoGema = tipoGema;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public boolean isEstilo() {
        return estilo;
    }

    public void setEstilo(boolean estilo) {
        this.estilo = estilo;
    }

    public Collar getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Collar siguiente) {
        this.siguiente = siguiente;
    }
    
}
