/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Modelo;

/**
 *
 * @author aleja
 */
public class Anillo extends Producto {
     private String material;
    private int tamano;
    private String piedra;
    private boolean ajustable;
    private String estilo;


    public Anillo(String material, int tamano, String piedra, boolean ajustable, String estilo, int id, String nombre, double precio, int stock, String descripcion) {
        super(id, nombre, precio, descripcion);
        this.material = material;
        this.tamano = tamano;
        this.piedra = piedra;
        this.ajustable = ajustable;
        this.estilo = estilo;
    }

    public Anillo() {
        super();
        this.material = "mat";
        this.tamano = 3;
        this.piedra = "pie";
        this.ajustable = false;
        this.estilo = "estilo";
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getPiedra() {
        return piedra;
    }

    public void setPiedra(String piedra) {
        this.piedra = piedra;
    }

    public boolean isAjustable() {
        return ajustable;
    }

    public void setAjustable(boolean ajustable) {
        this.ajustable = ajustable;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
 
}
