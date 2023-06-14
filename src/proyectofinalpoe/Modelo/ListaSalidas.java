/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Modelo;

/**
 *
 * @author aleja
 */
public class ListaSalidas {
     public Salida lista;
    
    public void ListaSalidas(){
        lista = null;
    }
    public void agregar(Salida e){
        Salida nuevo = e;
               
        if(lista == null){
            lista = nuevo;
        }else{
            Salida aux = lista;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(e);
        }
    }
    
    public Salida buscar(String fecha){
        Salida aux = lista;
        String Fecha = fecha ;
        
        boolean encontrado = false;
              
        while(aux != null){
            if(Fecha.equals(aux.getFecha())){
                encontrado = true;
                break;
            }
            aux = aux.getSiguiente();
        }
        if (encontrado == true){
            return aux;
        }else{
            return null;
        }
    }
     
    public boolean eliminarLista(String fecha) {
        Salida anterior = lista;
        Salida actual = lista;
        Salida siguiente = lista.getSiguiente();
        boolean eliminado = false;

        while (actual != null) {
            if (actual.getFecha().equals(fecha)) {
                anterior.setSiguiente(siguiente);
                eliminado = true;
                break; // Salir del bucle una vez que se elimina el elemento
            } else {
                anterior = actual;
                actual = siguiente;
                if (siguiente != null) {
                    siguiente = siguiente.getSiguiente();
                }
            }
        }
        return eliminado;  
    }
    
    
}
