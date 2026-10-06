//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Butaca[] butacas = {
            new Butaca("A", 1),
            new Butaca("A", 2),
            new Butaca("A", 3),
            new Butaca("A", 4),
            new Butaca("B", 1),
            new Butaca("B", 2),
            new Butaca("B", 3),
            new Butaca("B", 4)
    };

    SalaCine sala = new SalaCine(butacas);

    PlataformaReserva plataforma = new PlataformaReserva();

    String[] reserva = {"A1", "A2", "B3"};

    plataforma.realizarReserva(sala, reserva);

    sala.mostrarEstado();
}
