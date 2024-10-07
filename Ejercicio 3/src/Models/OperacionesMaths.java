package Models;

public class OperacionesMaths<T extends Number> {
    private T num1;
    private T num2;
    public OperacionesMaths(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public T suma() {
        if (num1 instanceof Double || num2 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else if (num1 instanceof Float || num2 instanceof Float) {
            return (T) Float.valueOf(num1.floatValue() + num2.floatValue());
        } else if (num1 instanceof Long || num2 instanceof Long) {
            return (T) Long.valueOf(num1.longValue() + num2.longValue());
        } else {
            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
        }
    }

    public T resta() {
        if (num1 instanceof Double || num2 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
        } else if (num1 instanceof Float || num2 instanceof Float) {
            return (T) Float.valueOf(num1.floatValue() - num2.floatValue());
        } else if (num1 instanceof Long || num2 instanceof Long) {
            return (T) Long.valueOf(num1.longValue() - num2.longValue());
        } else {
            return (T) Integer.valueOf(num1.intValue() - num2.intValue());
        }
    }

    public T multiplicacion() {
        if (num1 instanceof Double || num2 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
        } else if (num1 instanceof Float || num2 instanceof Float) {
            return (T) Float.valueOf(num1.floatValue() * num2.floatValue());
        } else if (num1 instanceof Long || num2 instanceof Long) {
            return (T) Long.valueOf(num1.longValue() * num2.longValue());
        } else {
            return (T) Integer.valueOf(num1.intValue() * num2.intValue());
        }
    }

    public T division() {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        if (num1 instanceof Double || num2 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
        } else if (num1 instanceof Float || num2 instanceof Float) {
            return (T) Float.valueOf(num1.floatValue() / num2.floatValue());
        } else if (num1 instanceof Long || num2 instanceof Long) {
            return (T) Long.valueOf(num1.longValue() / num2.longValue());
        } else {
            return (T) Integer.valueOf(num1.intValue() / num2.intValue());
        }
    }

    public T getNum1() {
        return num1;
    }

    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public T getNum2() {
        return num2;
    }

    public void setNum2(T num2) {
        this.num2 = num2;
    }
}
