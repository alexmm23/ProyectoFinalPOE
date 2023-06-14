package proyectofinalpoe.Modelo;

import javax.swing.JOptionPane;

public class ListaProducto {
    public Producto lista;
    public Producto ultimo;
    public int id;
    private int cantNodos;
    
    public void ListaProducto(){
        lista = null;
    }
    public void agregar(Producto p){

        Producto nuevo = p;
               
        if(lista == null){
            lista = nuevo;
            lista.setId(id);
            id++;
            cantNodos++;
        }else{
            Producto aux = lista;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            nuevo.setId(id);
            aux.setSiguiente(nuevo);
            id++;
            cantNodos++;
        }
    }
    
    public Producto buscar(int id){
        Producto aux = lista;
        int Id = id;
        
        boolean encontrado = false;
              
        while(aux != null){
            if(Id == aux.getId()){
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
    public Producto[] imprimir(){
        Producto aux = lista;
        Producto[] arreglo = new Producto[cantNodos];
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
        Producto aux = lista;
        return aux == null;
    }
     
    public boolean eliminarLista(int id) {
        Producto anterior = lista;
        Producto actual = lista;
        Producto siguiente = lista.siguiente;
        boolean eliminado = false;

        while (actual != null) {
            if (actual.getId() == id) {
                anterior.siguiente = siguiente;
                eliminado = true;
                cantNodos--;
                break; // Salir del bucle una vez que se elimina el elemento
            } else {
                anterior = actual;
                actual = siguiente;
                if (siguiente != null) {
                    siguiente = siguiente.siguiente;
                }
            }
        }
        return eliminado;  
    }  
        public int getCantNodos() {
        return cantNodos;
    }
}
