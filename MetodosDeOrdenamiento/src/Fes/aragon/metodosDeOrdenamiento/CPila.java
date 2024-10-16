package Fes.aragon.metodosDeOrdenamiento;

public class CPila<E> extends ListaDoble {

    public CPila(){
    }

    public void meterEnPila(E dato){
        agregarEnCabeza(dato);
    }

    public E sacarDePila(){
        NodoDoble nodoDoble= (NodoDoble) obtenerNodoDoble(0);

        eliminarEnCabeza();

        return (E) nodoDoble.getDato();
    }

    public boolean esVacio(){

       return esVacio();

    }

    public int getLongitud() {
        return longitud;
    }

}
