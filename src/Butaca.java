public class Butaca {
    String fila;
    int numero;
    boolean disponible;

    Butaca(String fila, int numero) {
        this.fila = fila;
        this.numero = numero;
        this.disponible = true;
    }

    String getCodigo() {
        return fila + numero;
    }

    void bloquear() {
        disponible = false;
    }

    void mostrar() {
        System.out.println(getCodigo() + " - " +
                (disponible ? "Disponible" : "Ocupada"));
    }
}
