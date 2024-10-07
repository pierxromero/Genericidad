//Crear una clase genérica llamada "OperacionMatematica" que pueda realizar
//operaciones matemáticas simples (suma, resta, multiplicación, división) con
//cualquier tipo de número (enteros, decimales, etc.). Debe tener métodos para
//cada operación y para establecer los números de entrada. Haz pruebas de
//tu clase con diferentes tipos de números.

import Models.OperacionesMaths;

public class Main {
    public static void main(String[] args) {
        OperacionesMaths<Integer> operacionMaths = new OperacionesMaths<>(1, 0);
        System.out.println(operacionMaths.suma());
        System.out.println(operacionMaths.resta());
        System.out.println(operacionMaths.multiplicacion());
        try {
            System.out.println(operacionMaths.division());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        OperacionesMaths<Double> operacionMaths2 = new OperacionesMaths<>(1.0, 2.0);
        System.out.println(operacionMaths2.suma());
        System.out.println(operacionMaths2.resta());
        System.out.println(operacionMaths2.multiplicacion());
        System.out.println(operacionMaths2.division());
    }
}