
package proyectofinalpoe.Modelo;
 
import javax.swing.JOptionPane;

public class ListaEntradas {
   public Entrada lista;
   private int cantNodos;
    
    public void ListaEntradas(){
        lista = null;
    }
    public void agregar(Entrada e){
        Entrada nuevo = e;
               
        if(lista == null){
            lista = nuevo;
            cantNodos++;
        }else{
            Entrada aux = lista;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
                
            }
            aux.setSiguiente(e);
            cantNodos++;
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
    }public Entrada[] imprimir(){
        Entrada aux = lista;
        Entrada[] arreglo = new Entrada[cantNodos];
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
        Entrada aux = lista;
        return aux == null;
    }
     
    public boolean eliminarLista(String fecha) {
        Entrada anterior = lista;
        Entrada actual = lista;
        Entrada siguiente = lista.getSiguiente();
        boolean eliminado = false;

        while (actual != null) {
            if (actual.getFecha()== fecha) {
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