public class PlataformaReserva {
    void realizarReserva(SalaCine sala, String[] codigosButacas) {

        System.out.println("Solicitando reserva...");

        sala.bloquearButacas(codigosButacas);

        System.out.println("Reserva realizada.");
    }
}
