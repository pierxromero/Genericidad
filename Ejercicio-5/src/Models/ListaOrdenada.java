package Models;

import java.util.ArrayList;
import java.util.Collections;

public class ListaOrdenada <T>{
    private ArrayList<T> lista;
    public ListaOrdenada() {
        this.lista = new ArrayList<>();
    }
    public void agregar(T elemento) {
        lista.add(elemento);
    }

    public void eliminar(T elemento) {
        lista.remove(elemento);
    }
    public void ordenarAscendente() {
        Collections.sort(lista);
    }

    public void ordenarDescendente() {
        Collections.sort(lista);
        Collections.reverse(lista);
    }

    public T obtener(int posicion) {
        return lista.get(posicion);
    }

    public int tamaño() {
        return lista.size();
    }

    @Override
    public String toString() {
        return lista.toString();
    }
}
