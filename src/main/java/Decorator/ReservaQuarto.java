package Decorator;

public class ReservaQuarto implements Reserva{

    public float preco;

    public ReservaQuarto(){

    }
    public ReservaQuarto(float preco) {
        this.preco=preco;
    }

    public float getPreco(){
        return preco;
    }

    public String getServico() {
        return "Reserva Quarto";
    }

}
