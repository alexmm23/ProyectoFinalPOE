
package proyectofinalpoe.Modelo;
 
public class ListaEntradas {
   public Entrada lista;
    
    public void ListaEntradas(){
        lista = null;
    }
    public void agregar(Entrada e){
        Entrada nuevo = e;
               
        if(lista == null){
            lista = nuevo;
        }else{
            Entrada aux = lista;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(e);
        }
    }
    
    public Entrada buscar(String fecha){
        Entrada aux = lista;
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
        Entrada anterior = lista;
        Entrada actual = lista;
        Entrada siguiente = lista.getSiguiente();
        boolean eliminado = false;

        while (actual != null) {
            if (actual.getFecha()== fecha) {
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