
package proyectofinalpoe.Modelo;


public class Salida {
    private String fecha;
    private String cliente;
    private int numProductos;
    private double costoVenta;
    private String tipoProducto;

    public Salida(String fecha, String cliente, int numProductos, double costoVenta, String tipoProducto) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.numProductos = numProductos;
        this.costoVenta = costoVenta;
        this.tipoProducto = tipoProducto;
    }
    public Salida() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumProductos() {
        return numProductos;
    }

    public void setNumProductos(int numProductos) {
        this.numProductos = numProductos;
    }

    public double getCostoVenta() {
        return costoVenta;
    }

    public void setCostoVenta(double costoVenta) {
        this.costoVenta = costoVenta;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    
    
    
    
    
    
}
