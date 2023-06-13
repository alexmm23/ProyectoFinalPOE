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
        Entrada entrada = n;
        
        boolean encontrado = false;
       
        while(aux != null){
            if(entrada.getProveedor().equals(aux.getProveedor())){
                encontrado = true;
                break;
            }
            aux = aux.getSiguiente();
        }
        
        return encontrado;
    }
    
//    public boolean eliminar(Entrada n){
//        Entrada aux = lista;
//        Entrada entrada = n;
//               
//        while(aux != null){
//            if(entrada.getProveedor().equals(aux.getProveedor())){
//                
//                while(aux.getSiguiente != null){
//                    aux = aux.getSiguiente();
//                }
//                break;
//            }
//            aux = aux.getSiguiente();
//        }
//        
//        return encontrado;
//    }
//    
//    
//    
}
