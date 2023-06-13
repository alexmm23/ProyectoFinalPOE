/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Modelo;

/**
 *
 * @author aleja
 */
public class Entrada {
    private String fecha;
    private String proveedor;
    private int numProductos;
    private double costoCompra;
    private String tipoProducto;//Anillo/collar/aretes

    public Entrada(String fecha, String proveedor, int numProductos, double costoCompra, String tipoProducto) {
        this.fecha = fecha;
        this.proveedor = proveedor;
        this.numProductos = numProductos;
        this.costoCompra = costoCompra;
        this.tipoProducto = tipoProducto;
    }
    
    public Entrada(){
        
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getNumProductos() {
        return numProductos;
    }

    public void setNumProductos(int numProductos) {
        this.numProductos = numProductos;
    }

    public double getCostoCompra() {
        return costoCompra;
    }

    public void setCostoCompra(double costoCompra) {
        this.costoCompra = costoCompra;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    
    
    
}
