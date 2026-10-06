public class SalaCine {
    Butaca[] butacas;

    SalaCine(Butaca[] butacas) {
        this.butacas = butacas;
    }

    void bloquearButacas(String[] codigosButacas) {

        for (String codigo : codigosButacas) {

            for (Butaca butaca : butacas) {

                if (butaca.getCodigo().equals(codigo)
                        && butaca.disponible) {

                    butaca.bloquear();

                    System.out.println(
                            "Butaca " + codigo + " bloqueada."
                    );
                }
            }
        }
    }

    void mostrarEstado() {

        System.out.println("\nEstado de la sala:");

        for (Butaca butaca : butacas) {
            butaca.mostrar();
        }
    }
}
