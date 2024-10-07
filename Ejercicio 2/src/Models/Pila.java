package Models;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Pila<T> {
    private ArrayList<T> objetos;

    public Pila() {
        this.objetos = new ArrayList<>();
    }
    public void push(T objeto) {
        objetos.add(objeto);
    }
    ///Remueve el tope
    public T pop() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        return objetos.remove(objetos.size() - 1);
    }
    ///Devuelve el tope
    public T ultimoElemento() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        return objetos.get(objetos.size() - 1);
    }
    ///Devuelve true o false si la pila esta vacia
    public boolean estaVacia() {
        return objetos.isEmpty();
    }
    ///Devuelve el tamaño de la pila
    public int tamanio() {
        return objetos.size();
    }

}
