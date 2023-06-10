/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Modelo;

/**
 *
 * @author aleja
 */
public class ListaAnillos{
    public Anillo lista;
    
    public ListaAnillos(){
        lista = null;
    }
    public void agregar(Anillo n){
        Anillo nuevo = n;
               
        if(lista == null){
            lista = nuevo;
        }else{
            Anillo aux = lista;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(n);
        }
    }
    public boolean buscar(Anillo n){
        Anillo aux = lista;
        Anillo anillo = n;
        
        boolean encontrado = false;
        
        
        while(aux != null){
            if(anillo.getId() == aux.getId()){
                encontrado = true;
                break;
            }
            aux = aux.getSiguiente();
        }
        
        return encontrado;
    }
}
