package Decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {

    @Test
    void deveRetornarPrecodaReserva() {
        Reserva reserva = new ReservaQuarto(1500);

        assertEquals(1500.0f, reserva.getPreco());
    }

    @Test
    void deveRetornarPrecodaReservaComBanheira() {
        Reserva reserva = new QuartoBanheira(new ReservaQuarto(1500));

        assertEquals(1800, reserva.getPreco());
    }

    @Test
    void deveRetornarPrecodaReservacomRefeicoes() {
        Reserva reserva = new Refeicoes(new ReservaQuarto(1500));

        assertEquals(2000, reserva.getPreco());
    }

    @Test
    void deveRetornarPrecodaReservacomBusca() {
        Reserva reserva = new BuscarAeroporto(new ReservaQuarto(1500));

        assertEquals(1700, reserva.getPreco());
    }

    @Test
    void deveRetornarPrecodaReservacomBanheiraERefeicoes() {
        Reserva reserva = new QuartoBanheira(new Refeicoes(new ReservaQuarto(1500)));

        assertEquals(2300, reserva.getPreco());
    }

    @Test
    void deveRetornarPrecodaReservacomBanheiraEBusca() {
        Reserva reserva = new QuartoBanheira(new BuscarAeroporto(new ReservaQuarto(1500)));

        assertEquals(2000, reserva.getPreco());
    }

    @Test
    void deveRetornarPrecodaReservacomBuscaERefeicoes() {
        Reserva reserva = new BuscarAeroporto(new Refeicoes(new ReservaQuarto(1500)));

        assertEquals(2200, reserva.getPreco());
    }

    @Test
    void deveRetornarPrecodaReservacomBuscaERefeicoesEbanheira() {
        Reserva reserva = new BuscarAeroporto(new Refeicoes(new QuartoBanheira(new ReservaQuarto(1500))));

        assertEquals(2500, reserva.getPreco());
    }

    @Test
    void deveRetornarServicosDeHospedagem() {
        Reserva reserva = new ReservaQuarto();

        assertEquals("Reserva Quarto", reserva.getServico());
    }

    @Test
    void deveRetornarServicosDeHospedagemComBusca() {
        Reserva reserva = new BuscarAeroporto(new ReservaQuarto());

        assertEquals("Reserva Quarto + busca e leva no aeroporto ou rodoviária", reserva.getServico());
    }

    @Test
    void deveRetornarServicosDeHospedagemComBanheira() {
        Reserva reserva = new QuartoBanheira(new ReservaQuarto());

        assertEquals("Reserva Quarto + banheira", reserva.getServico());
    }

    @Test
    void deveRetornarServicosDeHospedagemComRefeicoes() {
        Reserva reserva = new Refeicoes(new ReservaQuarto());

        assertEquals("Reserva Quarto + café da manhã, almoço e jantar", reserva.getServico());
    }

    @Test
    void deveRetornarServicosDeHospedagemComRefeicoesEBanheira() {
        Reserva reserva = new Refeicoes(new QuartoBanheira (new ReservaQuarto()));

        assertEquals("Reserva Quarto + banheira + café da manhã, almoço e jantar", reserva.getServico());
    }

    @Test
    void deveRetornarServicosDeHospedagemComRefeicoesEBusca() {
        Reserva reserva = new Refeicoes(new BuscarAeroporto (new ReservaQuarto()));

        assertEquals("Reserva Quarto + busca e leva no aeroporto ou rodoviária + café da manhã, almoço e jantar", reserva.getServico());
    }

    @Test
    void deveRetornarServicosDeHospedagemComBanheiraEBusca() {
        Reserva reserva = new BuscarAeroporto(new QuartoBanheira (new ReservaQuarto()));

        assertEquals("Reserva Quarto + banheira + busca e leva no aeroporto ou rodoviária", reserva.getServico());
    }

    @Test
    void deveRetornarServicosDeHospedagemComBanheiraEBuscaERefeicoes() {
        Reserva reserva = new BuscarAeroporto (new QuartoBanheira(new Refeicoes (new ReservaQuarto())));

        assertEquals("Reserva Quarto + café da manhã, almoço e jantar + banheira + busca e leva no aeroporto ou rodoviária", reserva.getServico());
    }
}