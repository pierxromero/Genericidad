import Models.Pila;
import Models.Persona;

import java.util.EmptyStackException;

//Crear una clase genérica llamada "Pila" que funcione como una pila de
//objetos. Debe tener métodos para agregar y quitar elementos de la pila, así
//como para verificar si está vacía y para obtener el número de elementos en
//la pila. Haz pruebas de tu clase con diferentes tipos de objetos.
public class Main {
    public static void main(String[] args) {
        Pila<Integer> pila = new Pila
        pila.push(1);
        pila.push(2);
        pila.push(3);
        try {
            System.out.println(pila.pop());
        } catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(pila.ultimoElemento());
        }catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(pila.tamanio());
        System.out.println(pila.estaVacia());

        Pila<Persona> personaPila = new Pila
        personaPila.push(new Persona("Juan", "Peña", 30, "23232332"));
        personaPila.push(new Persona("Carlos", "Roberto", 30, "23232333"));
        personaPila.push(new Persona("Samuel", "Sanchez", 30, "23232339"));
        try {
            System.out.println(personaPila.pop());
        } catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(personaPila.ultimoElemento());
        } catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(personaPila.tamanio());
        System.out.println(personaPila.estaVacia());

    }
}
