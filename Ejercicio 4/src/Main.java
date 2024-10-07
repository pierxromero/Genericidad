//Crear una clase genérica llamada "Conjunto" que pueda almacenar
//elementos únicos de cualquier tipo. Debe tener métodos para agregar y
//eliminar elementos, y para verificar si un elemento está en el conjunto. Haz
//pruebas de tu clase con diferentes tipos de elementos.

import Models.ConjuntoT;
import Models.Persona;

public class Main {
    public static void main(String[] args) {
        ConjuntoT<Integer> conjunto = new ConjuntoT<>();
        conjunto.agregar(1);
        conjunto.agregar(2);
        conjunto.agregar(3);
        System.out.println(conjunto);
        System.out.println("¿Contiene 3?: " + conjunto.contiene(3));
        conjunto.eliminar(2);
        System.out.println("Despues de eliminar 2");
        System.out.println(conjunto);

        ConjuntoT<Persona> conjuntoPersona = new ConjuntoT<>();
        conjuntoPersona.agregar(new Persona("Juan", "Peña", 30, "23232332"));
        conjuntoPersona.agregar(new Persona("María", "Sanchez", 19, "23232312"));
        conjuntoPersona.agregar(new Persona("Juan", "Rodriguez", 50, "53232432"));
        System.out.println("Conjunto de personas: " + conjuntoPersona);
        System.out.println("¿Contiene a Juan de 25 años? " + conjuntoPersona.contiene(new Persona("Juan", "Peña", 30, "23232331")));
        conjuntoPersona.eliminar(new Persona("María", "Sanchez", 19, "23232312"));
        System.out.println("Despues de eliminar a María");
        System.out.println(conjuntoPersona);
    }
}