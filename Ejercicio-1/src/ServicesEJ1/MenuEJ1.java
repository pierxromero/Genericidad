package ServicesEJ1;

import Models.Almacenamiento;
import Models.Persona;

public class MenuEJ1 {
    public void menu1(){
        Almacenamiento<Integer> almacenamientoEnteros = new Almacenamiento<>();
        Almacenamiento<String> almacenamientoStrings = new Almacenamiento<>();
        Almacenamiento<Double> almacenamientoFlotantes = new Almacenamiento<>();
        Almacenamiento<Persona> almacenamientoPersonas = new Almacenamiento<>();

        almacenamientoEnteros.agregar(1);
        almacenamientoStrings.agregar("hola");
        almacenamientoFlotantes.agregar(3.14);
        almacenamientoPersonas.agregar(new Persona("Juan", "Peña", 30, "23232332"));

        System.out.println(almacenamientoEnteros.mostrarTodos());
        System.out.println(almacenamientoStrings.mostrarTodos());
        System.out.println(almacenamientoFlotantes.mostrarTodos());
        System.out.println(almacenamientoPersonas.mostrarTodos());

        System.out.println(almacenamientoEnteros.buscar(1));///true
        System.out.println(almacenamientoStrings.buscar("hola"));///true
        System.out.println(almacenamientoFlotantes.buscar(3.14));///true
        System.out.println(almacenamientoEnteros.buscar(4));///false
        System.out.println(almacenamientoPersonas.buscar(new Persona("Juan", "Peña", 30,"23232332")));

        almacenamientoEnteros.eliminar(1);
        System.out.println(almacenamientoEnteros.mostrarTodos());
        almacenamientoStrings.eliminar("hola");
        System.out.println(almacenamientoStrings.mostrarTodos());
        almacenamientoFlotantes.eliminar(3.14);
        System.out.println(almacenamientoFlotantes.mostrarTodos());
        almacenamientoPersonas.eliminar(new Persona("Juan", "Peña", 30,"23232332"));
        System.out.println(almacenamientoPersonas.mostrarTodos());
    }
}
