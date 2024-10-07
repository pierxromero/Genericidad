package Models;

import java.util.ArrayList;
import java.util.List;

public class Almacenamiento <T> {
    private List<T> objetos;

    public Almacenamiento() {
        this.objetos = new ArrayList<>();
    }

    public void agregar(T objeto) {
        this.objetos.add(objeto);
    }

    public void eliminar(T objeto) {
        this.objetos.remove(objeto);
    }

    public boolean buscar(T objeto) {
        return this.objetos.contains(objeto);
    }

    public List<T> mostrarTodos() {
        return this.objetos;
    }
}
