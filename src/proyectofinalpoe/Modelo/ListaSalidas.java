/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpoe.Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class ListaSalidas {
     public Salida lista;
     private int cantNodos;
    
    public void ListaSalidas(){
        lista = null;
    }
    public void agregar(Salida e){
        Salida nuevo = e;
               
        if(lista == null){
            lista = nuevo;
            cantNodos++;
        }else{
            Salida aux = lista;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(e);
            cantNodos++;
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
    public Salida[] imprimir(){
        Salida aux = lista;
        Salida[] arreglo = new Salida[cantNodos];
        int j=0;
        int i=1;
        if(lista==null){
            JOptionPane.showMessageDialog(null,"Pila Vacia");
        }else{
            while(aux != null){
                arreglo[j] = aux;
                aux = aux.getSiguiente();
                i++;
                j++;
            }
        }
        return arreglo;
    }
    
    public boolean estaVacia(){
        Salida aux = lista;
        return aux == null;
    }
     
    public boolean eliminarLista(String fecha) {
        Salida anterior = lista;
        Salida actual = lista;
        Salida siguiente = lista.getSiguiente();
        boolean eliminado = false;

        while (actual != null) {
            if (actual.getFecha().equals(fecha)) {
                anterior.setSiguiente(siguiente);
                cantNodos--;
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

    public int getCantNodos() {
        return cantNodos;
    }


    
    
}
