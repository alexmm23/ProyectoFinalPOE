/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Modelo;

/**
 *
 * @author aleja
 */
public class ListaAretes {
    public Aretes lista;
    
    public ListaAretes(){
        lista = null;
    }
    public void agregar(Aretes n){
        Aretes nuevo = n;
               
        if(lista == null){
            lista = nuevo;
        }else{
            Aretes aux = lista;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(n);
        }
    }
    public boolean buscar(Aretes n){
        Aretes aux = lista;
        Aretes aretes = n;
        
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
