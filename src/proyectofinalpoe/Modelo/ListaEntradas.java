/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Modelo;

/**
 *
 * @author aleja
 */
public class ListaEntradas {
    public Entrada lista;
    public ListaEntradas(){
        lista = null;
    }
    public void agregar(Entrada n){
        Entrada nuevo = n;
               
        if(lista == null){
            lista = nuevo;
        }else{
            Entrada aux = lista;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(n);
        }
    }
    public boolean buscar(Entrada n){
        Entrada aux = lista;
        Entrada aretes = n;
        
        boolean encontrado = false;
        
        
        while(aux != null){
            if(aretes.getId() == aux.getId()){
                encontrado = true;
                break;
            }
            aux = aux.getSiguiente();
        }
        
        return encontrado;
    }
    
    
    
}
