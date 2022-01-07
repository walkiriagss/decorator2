package Decorator;

public class QuartoBanheira extends ReservaDecorator{

    public QuartoBanheira(Reserva reserva) {
        super(reserva);
    }

    public float getPrecoHospedagem() {
        return 300;
    }

    public String getNomeServico() {
        return "banheira";
    }
}
