package Models;

import java.util.HashSet;

public class ConjuntoT<T> {
    private HashSet<T> conjunto;
    public ConjuntoT() {
        this.conjunto = new HashSet<>();
    }
    public void agregar(T objeto) {
        conjunto.add(objeto);
    }
    public void eliminar(T objeto) {
        conjunto.remove(objeto);
    }
    public boolean contiene(T objeto) {
        return conjunto.contains(objeto);
    }
    public int tamanio() {
        return conjunto.size();
    }
    public String toString() {
        return conjunto.toString();
    }
}
