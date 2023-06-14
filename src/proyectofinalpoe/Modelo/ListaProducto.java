package proyectofinalpoe.Modelo;

public class ListaProducto {
    public Producto lista;
    public Producto ultimo;
    
    public void ListaProducto(){
        lista = null;
    }
    public void agregar(Producto p){
        /*
        Producto nuevoNodo = p;
        if (lista == null) {
            lista = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            ultimo.siguiente = nuevoNodo;
            ultimo = nuevoNodo;
        }*/
        Producto nuevo = p;
               
        if(lista == null){
            lista = nuevo;
        }else{
            Producto aux = lista;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
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
     
    public boolean eliminarLista(int id) {
        Producto anterior = lista;
        Producto actual = lista;
        Producto siguiente = lista.siguiente;
        boolean eliminado = false;

        while (actual != null) {
            if (actual.getId() == id) {
                anterior.siguiente = siguiente;
                eliminado = true;
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
}
