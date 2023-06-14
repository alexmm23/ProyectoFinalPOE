/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Modelo;

/**
 *
 * @author aleja
 */
public class Aretes extends Producto{
    private String material;
    private String forma;
    private String cierre;
    private String color;
    private boolean piedras;
   

    public Aretes(String material, String forma, String cierre, String color, boolean piedras, int id, String nombre, double precio, String descripcion) {
        super(id, nombre, precio, descripcion);
        this.material = material;
        this.forma = forma;
        this.cierre = cierre;
        this.color = color;
        this.piedras = piedras;
    }

    public Aretes() {
        super();
        this.material = "mat";
        this.forma = "for";
        this.cierre = "cier";
        this.color = "col";
        this.piedras = false;
  
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getCierre() {
        return cierre;
    }

    public void setCierre(String cierre) {
        this.cierre = cierre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPiedras() {
        return piedras;
    }

    public void setPiedras(boolean piedras) {
        this.piedras = piedras;
    }

    
}
