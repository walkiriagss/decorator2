package Decorator;

public class BuscarAeroporto extends ReservaDecorator{


    public BuscarAeroporto(Reserva reserva) {
        super(reserva);
    }

    @Override
    public float getPrecoHospedagem() {
        return 200;
    }

    @Override
    public String getNomeServico() {
        return "busca e leva no aeroporto ou rodoviária";
    }

}
