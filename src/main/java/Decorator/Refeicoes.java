package Decorator;

public class Refeicoes extends ReservaDecorator{
    public Refeicoes(Reserva reserva) {
        super(reserva);
    }

    @Override
    public float getPrecoHospedagem() {
        return 500;
    }

    @Override
    public String getNomeServico() {
        return "café da manhã, almoço e jantar";
    }
}
