package Decorator;

public abstract class ReservaDecorator implements Reserva {

    private Reserva reserva;
    public String servico;

    public ReservaDecorator(Reserva reserva) {
        this.reserva = reserva;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public abstract float getPrecoHospedagem();

    public float getPreco() {
        return this.reserva.getPreco() + this.getPrecoHospedagem();
    }

    public abstract String getNomeServico();

    public String getServico() {
        return this.reserva.getServico() + " + " + this.getNomeServico();
    }

    public void setServico(String servico) {
        this.servico = servico;
    }
}
