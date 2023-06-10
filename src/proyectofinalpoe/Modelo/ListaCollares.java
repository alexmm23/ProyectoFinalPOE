/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Modelo;

/**
 *
 * @author aleja
 */
public class ListaCollares {
    public Collar lista;
    
    public ListaCollares(){
        lista = null;
    }
    
    public void agregar(Collar n){
        Collar nuevo;
        nuevo = n;
        
        if(lista == null){
            lista = nuevo;
        }else{
            Collar aux = lista;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(n);
        }
    }
    public boolean estaVacia(){
        return lista == null;
    }
    
    public boolean buscar(Collar n){
        Collar aux = lista;
        boolean encontrado = false;
        while(aux != null){
            if(n == lista){
                encontrado = true;
                break;
            }
            aux = aux.getSiguiente();
        }
        
        return encontrado;
    }
}
